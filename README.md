<p align="center">
  <img src="assets/wazz-icon.png" width="180" alt="wazz icon">
</p>

<h1 align="center">wazz</h1>

<p align="center">
  <a href="https://github.com/shawawah12-alt/wazz-editor-gxt/releases"><img src="https://img.shields.io/github/v/release/shawawah12-alt/wazz-editor-gxt?style=flat-square&color=2563eb" alt="Release"></a>
  <a href="https://github.com/shawawah12-alt/wazz-editor-gxt/releases"><img src="https://img.shields.io/github/downloads/shawawah12-alt/wazz-editor-gxt/total?style=flat-square&color=16a34a" alt="Downloads"></a>
  <img src="https://img.shields.io/badge/Android-7.0%2B-3DDC84?style=flat-square&logo=android&logoColor=white" alt="Android 7.0+">
  <img src="https://img.shields.io/badge/GTA-III%20%7C%20VC%20%7C%20SA-f59e0b?style=flat-square" alt="GTA III, Vice City, San Andreas">
  <a href="LICENSE"><img src="https://img.shields.io/github/license/shawawah12-alt/wazz-editor-gxt?style=flat-square&color=64748b" alt="License"></a>
</p>

Editor file GXT buat Android. gw buat biar kalau mau ganti teks GTA engga perlu
pindah ke PC dulu. Buka `american.gxt`, cari teksnya, edit, terus ekspor lagi.
Sesimpel itu.

Bisa dipakai buat GTA III, Vice City, dan San Andreas. GTA IV sama V engga
masuk karena format teksnya udah beda, bukan GXT model lama lagi.

## Fitur

- Buka file `.gxt` langsung dari penyimpanan HP
- Cari key atau isi teks
- Edit teks dan ekspor hasilnya
- Support GTA III, Vice City, dan San Andreas
- Ada sample kalau cuma mau nyoba
- Bahasa Indonesia kalau bahasa HP Indonesia, sisanya pakai Inggris
- Contekan token di menu About

## Cara pakai

Buka aplikasi, pilih file GXT, terus cari entry yang mau diganti. Ketuk
entry-nya, edit, simpan, lalu tekan Export. Backup file asli sebelum ditimpa,
siapa tahu hasil editnya salah atau gamenya engga mau baca.

File utama biasanya namanya `american.gxt`. Lokasinya beda-beda tergantung
game dan versi yang dipasang, jadi cari di folder data game masing-masing.

## Token

Token itu kode format yang ada di tengah teks. Jangan langsung dihapus karena
ada yang ngatur warna, pindah baris, atau nampilin tombol kontrol.

| Token | Fungsi |
|---|---|
| `~n~` | Pindah baris |
| `~w~` | Putih |
| `~r~` | Merah |
| `~g~` | Hijau |
| `~b~` | Biru |
| `~y~` | Kuning |
| `~p~` | Ungu / pink |
| `~o~` | Oranye |
| `~q~` | Pink terang |
| `~l~` | Hitam |
| `~z~` | Abu-abu / putih lembut |
| `~h~` | Highlight |
| `~s~` | Balik ke style normal |
| `~a~` | Placeholder teks |
| `~1~` | Placeholder angka |
| `~k~` | Tombol kontrol |
| `~<~` | Kiri |
| `~>~` | Kanan |
| `~up~` | Atas |
| `~down~` | Bawah |

Contoh:

```text
~r~Gagal!~n~~w~Coba lagi.
```

`Gagal!` jadi merah, `~n~` bikin baris baru, lalu `Coba lagi.` balik putih.
Keterangan token di aplikasi ikut bahasa HP juga, bukan Inggris terus.

## Sedikit soal San Andreas

San Andreas nyimpen key teks sebagai hash CRC32, bukan nama biasa. Tapi di
wazz kamu engga bakal disuruh ngedit deretan angka hash itu. Aplikasinya sudah
punya mekanisme bawaan yang langsung mencocokkan hash tersebut dan menampilkan
nama key dalam bentuk huruf yang gampang dibaca.

Mekanisme itu bisa ada berkat kerja dari
[Sergeanur/GXT](https://github.com/Sergeanur/GXT). Terima kasih sebesar-besarnya
buat Sergeanur yang sudah mengumpulkan dan mencocokkan hash CRC32 San Andreas
dengan nama key aslinya. Jadi pas file SA dibuka di wazz, key yang tampil
langsung berupa nama, bukan angka acak.

## Source

Source aplikasinya ada di folder `source-code`. Di dalamnya ada kode editor,
parser dan writer GXT, tampilan aplikasi, resource dua bahasa, icon, serta
daftar nama key buat GTA III, Vice City, dan San Andreas.

Bagian utamanya ada di `source-code/java/com/zhawoilah/wgxt`. Representasi
low-level class aplikasi juga disertakan di `source-code/low-level/smali` buat
referensi kalau mau lihat struktur class sampai detailnya.

## Build

APK siap pakai ada di halaman Releases.

Minimal Android 7.0 (API 24).

## Kredit

Dibuat oleh **Zhawoilah [ ID 🇮🇩 ]**.

Engga berafiliasi dengan Rockstar Games. GTA tetap milik pemiliknya.

---

# English

An Android GXT editor. I made it so small GTA text edits don't require moving
the file to a PC first. Open `american.gxt`, find the text, edit it, and export
the file again.

It works with GTA III, Vice City, and San Andreas. GTA IV and V aren't
supported because they use a different text format.

## Features

- Open `.gxt` files from Android storage
- Search by key or text
- Edit entries and export the result
- GTA III, Vice City, and San Andreas support
- Built-in sample file
- Indonesian UI on Indonesian devices, English everywhere else
- Token guide in the About screen

## Usage

Open a GXT file, find the entry you need, tap it, edit the text, and export.
Keep a backup of the original file before replacing it.

## Tokens

Tokens are formatting codes used inside game text. `~n~` starts a new line,
`~r~` makes text red, `~w~` makes it white, and the other colour tokens work
the same way. `~h~` highlights text, `~s~` resets the style, `~a~` and `~1~`
are placeholders, while `~k~` is used for controls. The full list is in the
table above and in the app.

The token descriptions follow the phone language, so Indonesian devices get
Indonesian explanations instead of the old English-only list.

## San Andreas keys

San Andreas stores text keys as CRC32 hashes instead of regular names. wazz
already handles this inside the app: it matches those hashes automatically and
shows readable key names, so users don't have to work with random-looking
numbers.

That mechanism is possible thanks to the work from
[Sergeanur/GXT](https://github.com/Sergeanur/GXT). Huge thanks to Sergeanur for
collecting and matching the San Andreas CRC32 hashes with their original key
names. Because of that work, SA keys appear as readable names as soon as the
file is opened in wazz.

## Credits

Made by **Zhawoilah [ ID 🇮🇩 ]**.

Not affiliated with Rockstar Games. GTA belongs to its respective owners.
