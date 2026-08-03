# wazz

Editor file GXT buat Android. Kubuat biar kalau mau ganti teks GTA nggak perlu
pindah ke PC dulu. Buka `american.gxt`, cari teksnya, edit, terus ekspor lagi.
Sesimpel itu.

Bisa dipakai buat GTA III, Vice City, dan San Andreas. GTA IV sama V nggak
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
siapa tahu hasil editnya salah atau gamenya nggak mau baca.

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

GTA III dan Vice City masih nyimpen nama key yang gampang dibaca. San Andreas
beda, key-nya disimpan sebagai hash CRC32. Makanya tanpa daftar nama, yang
kelihatan cuma angka dan nyari teks tertentu bakal nyebelin.

Terima kasih banyak buat [Sergeanur/GXT](https://github.com/Sergeanur/GXT).
Daftar dari sana yang bantu nyocokin hash San Andreas ke nama key aslinya.
Ini bagian penting banget buat dukungan SA di wazz.

## Build

Repo ini berisi hasil decompile dari APK milikku sendiri sebagai referensi.
APK siap pakai ada di halaman Releases.

Minimal Android 7.0 (API 24).

## Kredit

Dibuat oleh **Zhawoilah [ ID 🇮🇩 ]**.

Nggak berafiliasi dengan Rockstar Games. GTA tetap milik pemiliknya.

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

San Andreas stores its text keys as CRC32 hashes. Big thanks to
[Sergeanur/GXT](https://github.com/Sergeanur/GXT) for the name list used to map
those hashes back to readable key names. It makes SA files much easier to work
with.

## Credits

Made by **Zhawoilah [ ID 🇮🇩 ]**.

Not affiliated with Rockstar Games. GTA belongs to its respective owners.
