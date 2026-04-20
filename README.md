# 🎵 Sistem Manajemen Kelas Gender Wayang

Aplikasi Java untuk mengelola kelas-kelas latihan Gender Wayang dengan fitur pendaftaran murid dan administrasi guru.

---

## ✨ Fitur

**Untuk Murid:**

- Melihat daftar kelas tersedia
- Mendaftar ke kelas pilihan
- Input data (nama, umur, tingkat, catatan)

**Untuk Guru:**

- Login dengan password (`kerawitan123`)
- Membuat kelas baru dengan kapasitas
- Melihat info semua kelas

---

## 📂 Struktur Proyek

```
src/kelolakelasgenderwayang/
├── KelolaKelasGenderWayang.java   (Main program)
├── Pengguna.java                  (Kelas dasar)
├── Guru.java                      (Extends Pengguna)
├── Murid.java                     (Extends Pengguna)
└── KelasGenderWayang.java         (Manajemen kelas)
```

---

## 💻 Persyaratan

- Java JDK 8 atau lebih tinggi
- OS: Windows, Linux, atau macOS

---

## 🚀 Cara Menjalankan

### Kompilasi:

```bash
javac -d build/classes src/kelolakelasgenderwayang/*.java
```

### Jalankan:

```bash
java -cp build/classes kelolakelasgenderwayang.KelolaKelasGenderWayang
```

Atau gunakan NetBeans: klik kanan `KelolaKelasGenderWayang.java` → **Run File** (Shift+F6)

---

## 📖 Panduan Penggunaan

### Menu Utama

```
1. Menu Murid
2. Menu Guru (password)
3. Keluar
```

### **Opsi 1: Murid**

1. Pilih nomor kelas dari daftar yang ditampilkan
2. Isi data pribadi (nama, umur, tingkat, catatan)
3. Konfirmasi berhasil ditampilkan

### **Opsi 2: Guru**

1. Masukkan password: `kerawitan123`
2. Pilih:
   - **1** = Buat Kelas Baru (input nama + kapasitas)
   - **2** = Lihat Info Semua Kelas

---

## � Pohon Menu

```
SISTEM GENDER WAYANG
│
├─── [1] MENU MURID
│    │
│    ├─── Tampilkan Daftar Kelas
│    │    └─► Pilih Nomor Kelas (1, 2, 3, ...)
│    │
│    └─── INPUT DATA MURID
│         ├─► Nama: [input text]
│         ├─► Umur: [input number]
│         ├─► Tingkat: [input text]
│         ├─► Catatan: [input text]
│         │
│         └─► ✅ BERHASIL TERDAFTAR
│            └─► Kembali ke Menu Utama
│
├─── [2] MENU GURU (Password Protected)
│    │
│    ├─── INPUT PASSWORD
│    │    ├─► Benar → Lanjut
│    │    └─► Salah → Kembali ke Menu Utama
│    │
│    └─── [Login Berhasil]
│         │
│         ├─── [1] BUAT KELAS BARU
│         │    │
│         │    └─── INPUT DATA KELAS
│         │         ├─► Nama Kelas: [input text]
│         │         ├─► Kapasitas: [input number]
│         │         │
│         │         └─► ✅ KELAS BERHASIL DIBUAT
│         │            └─► Kembali ke Menu Guru
│         │
│         └─── [2] LIHAT INFO SEMUA KELAS
│              │
│              └─► TAMPILKAN DATA
│                  ├─► Kelas: [nama]
│                  ├─► Guru: [nama guru]
│                  └─► Jumlah Murid: [count]
│                     └─► Kembali ke Menu Guru
│
└─── [3] KELUAR
     └─► Program Selesai
```

---

## �🏗️ Arsitektur Kelas

```
Pengguna (Base)
├── Guru
│   └── spesialis (String)
│   └── mengajar()
└── Murid
    └── tingkat (String)
    └── catatan (String)
    └── tampilProfil()
    └── latihan()

KelasGenderWayang
├── namaKelas
├── guru (Guru)
├── murid[] (Murid[])
└── jumlahMurid
```

---

## 📚 Kelas-Kelas Utama

| Kelas                       | Deskripsi                                          |
| --------------------------- | -------------------------------------------------- |
| **Pengguna**                | Kelas dasar untuk Guru dan Murid (nama, umur)      |
| **Guru**                    | Merepresentasikan guru dengan spesialisasi         |
| **Murid**                   | Merepresentasikan murid dengan tingkat dan catatan |
| **KelasGenderWayang**       | Manajemen kelas (daftar murid, info kelas)         |
| **KelolaKelasGenderWayang** | Main program dengan menu interaktif                |

---

## 💡 Contoh Penggunaan

**Murid Mendaftar:**

```
Menu 1 → Pilih kelas → Input data → Berhasil terdaftar
```

**Guru Buat Kelas:**

```
Menu 2 → Password → Pilih 1 → Input nama + kapasitas → Berhasil dibuat
```

---

## ⚠️ Catatan Penting

| Aspek          | Keterangan                                                                                           |
| -------------- | ---------------------------------------------------------------------------------------------------- |
| Maksimal Kelas | 10 kelas gender wayang (dapat diubah di kode)                                                        |
| Penyimpanan    | Hanya di memori, hilang saat program ditutup                                                         |
| Password       | Dapat diubah di `KelolaKelasGenderWayang.java` baris: `final String PASSWORD_GURU = "kerawitan123";` |

---

**Dibuat oleh:** I Nyoman Widana  
**Tanggal:** 20 April 2026  
**Bahasa:** Java (OOP)
