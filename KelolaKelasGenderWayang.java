package kelolakelasgenderwayang;

import java.util.Scanner;

/**
 *
 * @author I Nyoman Widana
 * TGL 20-4-2026
 */

// Main.java
// Program utama dengan menu untuk Guru dan Murid.
// Guru masuk dengan password, bisa membuat banyak kelas baru.
// Murid langsung melihat daftar kelas dan mendaftar ke salah satu.
// UI diperjelas dengan pembatas antar input, informasi, dan instruksi.

import java.util.Scanner;

public class KelolaKelasGenderWayang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final String PASSWORD_GURU = "kerawitan123";

        KelasGenderWayang[] daftarKelas = new KelasGenderWayang[10];
        int jumlahKelas = 0;

        Guru guru = new Guru("Pak Made", 50, "Wayang Kulit");
        daftarKelas[jumlahKelas] = new KelasGenderWayang("Latihan Banjar", guru, 5);
        jumlahKelas++;

        while (true) {
            System.out.println("\n==============================");
            System.out.println("=== SISTEM GENDER WAYANG ===");
            System.out.println("==============================");
            System.out.println("[MENU UTAMA]");
            System.out.println("1. Menu Murid");
            System.out.println("2. Menu Guru (password)");
            System.out.println("3. Keluar");
            System.out.println("------------------------------");
            System.out.print("[INPUT] Pilih menu: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            if (pilihan == 1) {
                // Menu Murid: langsung daftar ke kelas
                System.out.println("\n==============================");
                System.out.println("=== MENU MURID ===");
                System.out.println("==============================");
                System.out.println("[INFO] Daftar kelas tersedia:");
                for (int i = 0; i < jumlahKelas; i++) {
                    System.out.println((i+1) + ". " + daftarKelas[i].getNamaKelas());
                }
                System.out.println("------------------------------");
                System.out.print("[INPUT] Pilih nomor kelas: ");
                int idx = sc.nextInt();
                sc.nextLine();

                if (idx >= 1 && idx <= jumlahKelas) {
                    System.out.println("\n[INPUT] Masukkan data murid:");
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Umur: ");
                    int umur = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Tingkat: ");
                    String tingkat = sc.nextLine();
                    System.out.print("Catatan: ");
                    String catatan = sc.nextLine();

                    Murid m = new Murid(nama, umur, tingkat, catatan);
                    daftarKelas[idx-1].daftarMurid(m);

                    System.out.println("\n[INFO] Murid berhasil didaftarkan ke kelas " + daftarKelas[idx-1].getNamaKelas());
                    System.out.println("------------------------------");
                } else {
                    System.out.println("[INFO] Pilihan kelas tidak valid.");
                }
            } else if (pilihan == 2) {
                // Menu Guru
                System.out.println("\n==============================");
                System.out.println("=== MENU GURU ===");
                System.out.println("==============================");
                System.out.print("[INPUT] Masukkan password: ");
                String pass = sc.nextLine();
                if (pass.equals(PASSWORD_GURU)) {
                    System.out.println("\n[INFO] Login berhasil!");
                    System.out.println("------------------------------");
                    System.out.println("1. Buat Kelas Baru");
                    System.out.println("2. Lihat Info Semua Kelas");
                    System.out.println("------------------------------");
                    System.out.print("[INPUT] Pilih: ");
                    int pg = sc.nextInt();
                    sc.nextLine();

                    if (pg == 1) {
                        System.out.println("\n[INPUT] Masukkan data kelas baru:");
                        System.out.print("Nama Kelas Baru: ");
                        String namaKelas = sc.nextLine();
                        System.out.print("Kapasitas: ");
                        int kapasitas = sc.nextInt();
                        sc.nextLine();
                        daftarKelas[jumlahKelas] = new KelasGenderWayang(namaKelas, guru, kapasitas);
                        jumlahKelas++;
                        System.out.println("\n[INFO] Kelas baru berhasil dibuat!");
                        System.out.println("------------------------------");
                    } else if (pg == 2) {
                        System.out.println("\n[INFO] Daftar semua kelas:");
                        for (int i = 0; i < jumlahKelas; i++) {
                            daftarKelas[i].tampilInfoKelas();
                        }
                        System.out.println("------------------------------");
                    }
                } else {
                    System.out.println("[INFO] Password salah!");
                }
            } else {
                System.out.println("\n[INFO] Program selesai. Terima kasih!");
                break;
            }
        }
        sc.close();
    }
}
