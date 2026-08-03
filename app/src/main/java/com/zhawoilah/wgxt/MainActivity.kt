package com.zhawoilah.wgxt

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.zhawoilah.wgxt.ui.theme.AgonAppTheme
import com.zhawoilah.wgxt.R
import java.util.Locale

private data class Entry(val key: String, val value: String)
private data class GameToken(val code: String, val en: String, val id: String)
private val tokens = listOf(
    GameToken("~n~", "New line (line break)", "Baris baru"),
    GameToken("~w~", "White (default text)", "Putih (warna teks bawaan)"),
    GameToken("~r~", "Red", "Merah"), GameToken("~g~", "Green", "Hijau"),
    GameToken("~b~", "Blue", "Biru"), GameToken("~y~", "Yellow", "Kuning"),
    GameToken("~p~", "Purple / pink", "Ungu / merah muda"), GameToken("~o~", "Orange", "Oranye"),
    GameToken("~q~", "Light pink", "Merah muda terang"), GameToken("~l~", "Black", "Hitam"),
    GameToken("~z~", "Grey / soft white", "Abu-abu / putih lembut"),
    GameToken("~h~", "Highlight / bright white", "Sorotan / putih terang"),
    GameToken("~s~", "Reset to standard style", "Kembalikan gaya standar"),
    GameToken("~a~", "Insert a string value", "Sisipkan nilai teks"),
    GameToken("~1~", "Insert a number value", "Sisipkan nilai angka"),
    GameToken("~k~", "Show a control / key binding", "Tampilkan tombol kontrol"),
    GameToken("~<~", "Left", "Kiri"), GameToken("~>~", "Right", "Kanan"),
    GameToken("~up~", "Up", "Atas"), GameToken("~down~", "Down", "Bawah")
)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState); enableEdgeToEdge()
        setContent { AgonAppTheme { WazzApp() } }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun WazzApp() {
    var page by remember { mutableStateOf("home") }
    var fileName by remember { mutableStateOf("") }
    var entries by remember { mutableStateOf(emptyList<Entry>()) }
    var editing by remember { mutableStateOf<Int?>(null) }
    val context = LocalContext.current
    val open = rememberLauncherForActivityResult(ActivityResultContracts.OpenDocument()) { uri ->
        uri?.let { fileName = it.lastPathSegment?.substringAfterLast('/') ?: "american.gxt"; entries = readEntries(context, it); page = "entries" }
    }
    val export = rememberLauncherForActivityResult(ActivityResultContracts.CreateDocument("application/octet-stream")) { uri ->
        uri?.let { context.contentResolver.openOutputStream(it)?.bufferedWriter()?.use { out -> entries.forEach { e -> out.append(e.key).append('=').appendLine(e.value) } } }
    }
    Scaffold(
        topBar = { TopAppBar(title = { Text(if (page == "about") stringResource(R.string.about_title) else "wazz") }, navigationIcon = { if (page != "home") IconButton({ page = "home" }) { Icon(Icons.AutoMirrored.Filled.ArrowBack, null) } }) },
        bottomBar = { NavigationBar { NavigationBarItem(page != "about", { page = "home" }, { Icon(Icons.Default.Home, null) }, label = { Text(stringResource(R.string.nav_home)) }); NavigationBarItem(page == "about", { page = "about" }, { Icon(Icons.Default.Info, null) }, label = { Text(stringResource(R.string.nav_about)) }) } }
    ) { pad ->
        when (page) {
            "home" -> Home(Modifier.padding(pad), { open.launch(arrayOf("*/*")) }, { fileName = "sample.gxt"; entries = sampleEntries(); page = "entries" })
            "entries" -> Entries(Modifier.padding(pad), fileName, entries, { editing = it }, { export.launch(fileName.ifBlank { "edited.gxt" }) })
            else -> About(Modifier.padding(pad))
        }
    }
    editing?.let { index -> EditDialog(entries[index], { editing = null }) { changed -> entries = entries.toMutableList().also { it[index] = changed }; editing = null } }
}

@Composable private fun Home(modifier: Modifier, onOpen: () -> Unit, onSample: () -> Unit) {
    Column(modifier.fillMaxSize().padding(24.dp), verticalArrangement = Arrangement.Center) {
        Icon(Icons.Default.Description, null, Modifier.size(56.dp), tint = MaterialTheme.colorScheme.primary)
        Spacer(Modifier.height(20.dp)); Text(stringResource(R.string.home_headline), style = MaterialTheme.typography.headlineMedium, fontWeight = FontWeight.Bold)
        Text(stringResource(R.string.home_subtitle), color = MaterialTheme.colorScheme.onSurfaceVariant); Spacer(Modifier.height(28.dp))
        Button(onOpen, Modifier.fillMaxWidth()) { Icon(Icons.Default.FolderOpen, null); Spacer(Modifier.width(8.dp)); Text(stringResource(R.string.home_open_file)) }
        TextButton(onSample, Modifier.fillMaxWidth()) { Text(stringResource(R.string.home_generate_sample)) }
    }
}

@Composable private fun Entries(modifier: Modifier, name: String, entries: List<Entry>, onEdit: (Int) -> Unit, onExport: () -> Unit) {
    Column(modifier.fillMaxSize()) {
        Row(Modifier.fillMaxWidth().padding(16.dp), verticalAlignment = Alignment.CenterVertically) { Column(Modifier.weight(1f)) { Text(name, fontWeight = FontWeight.Bold); Text(stringResource(R.string.entries_total, entries.size), color = MaterialTheme.colorScheme.onSurfaceVariant) }; FilledTonalButton(onExport) { Icon(Icons.Default.Download, null); Spacer(Modifier.width(6.dp)); Text(stringResource(R.string.export_button)) } }
        if (entries.isEmpty()) Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) { Text(stringResource(R.string.entries_empty)) }
        else LazyColumn(contentPadding = PaddingValues(horizontal = 16.dp, vertical = 4.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) { itemsIndexed(entries) { i, e -> Card(Modifier.fillMaxWidth().clickable { onEdit(i) }) { Column(Modifier.padding(16.dp)) { Text(e.key, color = MaterialTheme.colorScheme.primary, fontWeight = FontWeight.Bold); Text(e.value, maxLines = 2) } } } }
    }
}

@Composable private fun EditDialog(entry: Entry, close: () -> Unit, save: (Entry) -> Unit) {
    var text by remember(entry) { mutableStateOf(entry.value) }
    AlertDialog(onDismissRequest = close, title = { Text(entry.key) }, text = { Column { OutlinedTextField(text, { text = it }, Modifier.fillMaxWidth(), label = { Text(stringResource(R.string.editor_value)) }, minLines = 4); Spacer(Modifier.height(10.dp)); Text(stringResource(R.string.editor_token_hint), style = MaterialTheme.typography.labelMedium); Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(6.dp)) { tokens.take(5).forEach { AssistChip({ text += it.code }, { Text(it.code) }) } } } }, confirmButton = { TextButton({ save(entry.copy(value = text)) }) { Text(stringResource(R.string.action_save)) } }, dismissButton = { TextButton(close) { Text(stringResource(R.string.action_cancel)) } })
}

@Composable private fun About(modifier: Modifier) {
    val indo = Locale.getDefault().language == "id" || Locale.getDefault().language == "in"
    LazyColumn(modifier.fillMaxSize(), contentPadding = PaddingValues(20.dp), verticalArrangement = Arrangement.spacedBy(16.dp)) {
        item { Text("wazz — editor gxt", style = MaterialTheme.typography.headlineSmall, fontWeight = FontWeight.Black); Text(stringResource(R.string.about_app_desc)); Spacer(Modifier.height(8.dp)); AssistChip({}, { Text("${stringResource(R.string.about_made_by)} Zhawoilah [ ID 🇮🇩 ]") }) }
        item { Section(stringResource(R.string.about_section_how)) { Text(stringResource(R.string.about_how_desc)) } }
        item { Section(stringResource(R.string.about_section_supported)) { Text("GTA III  •  Vice City  •  San Andreas") } }
        item { Section(stringResource(R.string.about_section_tokens)) { Text(stringResource(R.string.about_tokens_hint)); Spacer(Modifier.height(10.dp)); tokens.forEach { Row(Modifier.fillMaxWidth().padding(vertical = 5.dp)) { Text(it.code, Modifier.width(64.dp), color = MaterialTheme.colorScheme.primary, fontWeight = FontWeight.Bold); Text(if (indo) it.id else it.en) } } } }
        item { Text(stringResource(R.string.about_disclaimer), style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurfaceVariant) }
    }
}
@Composable private fun Section(title: String, body: @Composable ColumnScope.() -> Unit) = Card { Column(Modifier.padding(18.dp)) { Text(title, style = MaterialTheme.typography.titleMedium, fontWeight = FontWeight.Bold); Spacer(Modifier.height(10.dp)); body() } }

private fun sampleEntries() = listOf(Entry("MAIN_MENU", "~y~Grand Theft Auto"), Entry("NEW_GAME", "New Game"), Entry("LOAD_GAME", "Load Game"), Entry("WELCOME", "~w~Welcome back~n~~g~Have fun!"))
private fun readEntries(context: Context, uri: Uri): List<Entry> = runCatching { val bytes = context.contentResolver.openInputStream(uri)!!.use { it.readBytes() }; val text = bytes.toString(Charsets.ISO_8859_1); text.lineSequence().mapNotNull { line -> val p = line.indexOf('='); if (p in 1..80) Entry(line.take(p).trim(), line.drop(p + 1).trim()) else null }.filter { it.key.matches(Regex("[A-Za-z0-9_]+")) }.take(5000).toList().ifEmpty { listOf(Entry("RAW_FILE", "${bytes.size} bytes — format binary terdeteksi. Gunakan contoh untuk melihat editor.")) } }.getOrElse { emptyList() }
