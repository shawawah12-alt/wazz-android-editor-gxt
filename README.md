# wazz - editor gxt

Aplikasi Android buat buka dan edit file teks GXT dari GTA III, Vice City, dan San Andreas.

Awalnya aplikasi ini dibuat karena edit satu atau dua tulisan di GTA lewat HP itu ribet. Biasanya file harus dipindah ke PC dulu, padahal kadang yang mau diganti cuma nama menu atau satu baris dialog. Di wazz, file bisa dibuka, diedit, lalu diekspor lagi langsung dari Android.

## Cara pakai

1. Siapkan file GXT dari game. File utamanya biasanya bernama `american.gxt`.
2. Buka wazz dan pilih **Buka file .gxt**.
3. Cari tulisan atau key yang mau diedit.
4. Ketuk entrinya, ubah teks, lalu simpan.
5. Tekan **Ekspor** untuk membuat file hasil edit.
6. Backup file asli sebelum memasang file baru ke game.

Kalau belum punya file GXT buat dites, pakai file contoh yang ada di halaman awal.

## Token teks

Tulisan di GTA kadang punya kode kecil seperti `~r~` atau `~n~`. Itu bukan teks rusak. Kode tersebut dipakai game buat mengatur warna, baris baru, dan beberapa hal lain.

| Token | Kegunaan |
|---|---|
| `~n~` | Pindah baris |
| `~w~` | Warna putih |
| `~r~` | Warna merah |
| `~g~` | Warna hijau |
| `~b~` | Warna biru |
| `~y~` | Warna kuning |
| `~p~` | Warna ungu atau merah muda |
| `~o~` | Warna oranye |
| `~q~` | Warna merah muda terang |
| `~l~` | Warna hitam |
| `~z~` | Abu-abu atau putih lembut |
| `~h~` | Membuat teks lebih terang |
| `~s~` | Mengembalikan gaya teks |
| `~a~` | Tempat untuk nilai teks |
| `~1~` | Tempat untuk nilai angka |
| `~k~` | Menampilkan tombol kontrol |
| `~<~` dan `~>~` | Arah kiri dan kanan |
| `~up~` dan `~down~` | Arah atas dan bawah |

Contohnya:

```text
~r~Gagal!~n~~w~Coba lagi.
```

`Gagal!` akan berwarna merah. Setelah itu teks pindah ke baris baru dan `Coba lagi.` tampil dengan warna putih.

Sebaiknya jangan hapus token kalau masih dibutuhkan. Daftar token ini juga bisa dilihat dari menu **Tentang** di aplikasi. Penjelasannya otomatis memakai bahasa Indonesia kalau bahasa HP Indonesia. Selain itu, aplikasi memakai bahasa Inggris.

## Game yang didukung

- GTA III
- GTA Vice City
- GTA San Andreas

Ketiga game itu sama-sama memakai GXT, tetapi susunan filenya tidak persis sama. Khusus San Andreas, key teks disimpan sebagai angka CRC32. wazz memakai daftar nama supaya angka tersebut bisa ditampilkan sebagai nama key yang lebih gampang dibaca.

GTA IV dan GTA V tidak didukung karena format teksnya sudah berbeda.

## Terima kasih

Terima kasih banyak buat [Sergeanur/GXT](https://github.com/Sergeanur/GXT). Project tersebut sangat membantu dalam mencocokkan hash CRC32 di GTA San Andreas dengan nama key aslinya. Tanpa daftar itu, banyak key San Andreas cuma akan terlihat sebagai angka dan bakal jauh lebih susah dicari.

Dibuat oleh **Zhawoilah [ ID 🇮🇩 ]**.

Aplikasi ini tidak berafiliasi dengan Rockstar Games. Nama GTA dan aset terkait tetap milik pemiliknya masing-masing.

---

# English

wazz is an Android app for opening and editing GXT text files from GTA III, Vice City, and San Andreas.

It was made for small edits that should not require moving a file to a PC. Open the GXT file, find the entry, change the text, and export a new copy from your phone.

## How to use it

1. Get the GXT file from your game. The main file is usually called `american.gxt`.
2. Open wazz and tap **Open a .gxt file**.
3. Find the text or key you want to change.
4. Tap the entry, edit it, and save.
5. Tap **Export** to create the edited file.
6. Keep a backup of the original file before putting the new one into the game.

There is also a sample file on the home screen if you only want to try the editor.

## Text tokens

GTA text often contains codes such as `~r~` and `~n~`. These codes control colours, line breaks, placeholders, and controller buttons. They are not broken text, so do not remove them unless you no longer need their effect.

For example:

```text
~r~Failed!~n~~w~Try again.
```

`Failed!` appears in red. The text then moves to a new line and `Try again.` appears in white.

The full token list is available in the About screen. It follows the phone language, using Indonesian on Indonesian devices and English everywhere else.

## Supported games

- GTA III
- GTA Vice City
- GTA San Andreas

The three games use different versions of the GXT format. San Andreas stores text keys as CRC32 hashes, so wazz uses a name list to show readable key names where possible.

GTA IV and GTA V are not supported because they use a different text format.

## Thanks

Big thanks to [Sergeanur/GXT](https://github.com/Sergeanur/GXT). That project is a huge help for matching GTA San Andreas CRC32 hashes with their original key names. Without it, many San Andreas entries would only appear as numbers and would be much harder to find.

Made by **Zhawoilah [ ID 🇮🇩 ]**.

This app is not affiliated with Rockstar Games. GTA and related assets belong to their respective owners.
