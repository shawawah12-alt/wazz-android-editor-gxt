# wazz — editor GXT

Editor file teks GTA yang bisa dipakai langsung dari Android. Nggak perlu mindahin file ke PC cuma buat mengganti satu baris dialog, nama menu, atau tulisan lain di dalam game.

> **Catatan:** wazz bukan aplikasi resmi Rockstar Games. Selalu simpan cadangan file GXT asli sebelum mulai ngedit.

## Yang bisa dilakukan

- Membuka dan membaca file `.gxt`
- Mencari key atau isi teks
- Mengubah teks lalu menyimpan editan
- Mengekspor salinan file hasil edit
- Membuka file contoh kalau cuma mau mencoba tampilan editor
- UI bahasa Indonesia kalau bahasa HP Indonesia; bahasa lain otomatis memakai Inggris
- Contekan token GXT di menu **Tentang / About**

## Cara pakai

1. Cari file GXT game-mu. Biasanya file utama bernama `american.gxt`.
2. Buka wazz, lalu tekan **Buka file .gxt**.
3. Pilih file tadi lewat pemilih dokumen Android.
4. Cari entri yang ingin diubah, lalu ketuk entrinya.
5. Ubah teksnya. Jangan asal menghapus token seperti `~r~` atau `~n~` kalau efeknya masih dibutuhkan.
6. Simpan editan, kemudian tekan **Ekspor**.
7. Cadangkan file asli sebelum menggantinya dengan hasil ekspor.

## Contekan token

Token adalah potongan kecil yang mengatur tampilan teks di dalam game. Token tidak ikut terlihat sebagai tulisan biasa saat game berjalan.

| Token | Fungsi |
|---|---|
| `~n~` | Baris baru |
| `~w~` | Putih / warna bawaan |
| `~r~` | Merah |
| `~g~` | Hijau |
| `~b~` | Biru |
| `~y~` | Kuning |
| `~p~` | Ungu atau merah muda |
| `~o~` | Oranye |
| `~q~` | Merah muda terang |
| `~l~` | Hitam |
| `~z~` | Abu-abu atau putih lembut |
| `~h~` | Sorotan / putih terang |
| `~s~` | Kembali ke gaya standar |
| `~a~` | Sisipan nilai teks |
| `~1~` | Sisipan nilai angka |
| `~k~` | Tombol kontrol / key binding |
| `~<~`, `~>~` | Kiri dan kanan |
| `~up~`, `~down~` | Atas dan bawah |

Contoh: `~r~Gagal!~n~~w~Coba lagi.` akan menampilkan “Gagal!” berwarna merah, pindah baris, lalu “Coba lagi.” dengan warna putih.

## Game yang dituju

- Grand Theft Auto III
- Grand Theft Auto: Vice City
- Grand Theft Auto: San Andreas

Format GXT tiap game nggak sepenuhnya sama. San Andreas juga menyimpan key sebagai CRC32, jadi nama key yang terbaca bergantung pada daftar nama yang tersedia.

## Bahasa

wazz mengikuti bahasa perangkat. Bahasa Indonesia memakai penjelasan token Indonesia, sedangkan perangkat dengan bahasa lain memakai Inggris. Jadi bagian tutorial nggak lagi nyangkut di bahasa Inggris saat UI sedang Indonesia.

## Kredit

Dibuat oleh **Zhawoilah [ ID 🇮🇩 ]**.

---

# English

A small Android editor for GTA text files. It saves you from moving a file to a PC just to change one line of dialogue, a menu label, or another bit of in-game text.

> **Heads-up:** wazz is not affiliated with Rockstar Games. Keep a backup of the original GXT file before editing anything.

## What it does

- Opens `.gxt` files
- Lets you find and edit text entries
- Exports a new copy with your changes
- Includes a sample file for a quick test drive
- Uses Indonesian when the phone language is Indonesian, otherwise falls back to English
- Includes a localized GXT token guide under **About**

## How to use it

1. Find your game's GXT file—`american.gxt` is usually the main one.
2. Open wazz and tap **Open a .gxt file**.
3. Pick the file in Android's document picker.
4. Find the entry you need and tap it.
5. Edit the text. Keep tokens such as `~r~` and `~n~` if their effects are still needed.
6. Save the entry, then tap **Export**.
7. Back up the original before replacing it with the exported copy.

## Token quick guide

`~n~` starts a new line. `~r~`, `~g~`, `~b~`, `~y~`, and `~w~` change text colour. `~h~` highlights text, `~s~` resets the style, while `~a~` and `~1~` are placeholders. The full bilingual list is available in the app and in the Indonesian table above.

Example: `~r~Failed!~n~~w~Try again.` shows “Failed!” in red, starts a new line, and returns to white for “Try again.”

## Credits

Made by **Zhawoilah [ ID 🇮🇩 ]**.

## License

Source code is available under the MIT License. Grand Theft Auto and related names belong to their respective owners.
