package kelolakelasgenderwayang;

/**
 *
 * @author I Nyoman Widana
 * TGL 20-4-2026
 */

// KelasGenderWayang.java
// Mewakili sebuah kelas latihan Gender Wayang.

public class KelasGenderWayang {
    private String namaKelas;
    private Guru guru;
    private Murid[] murid;
    private int jumlahMurid;

    public KelasGenderWayang(String namaKelas, Guru guru, int kapasitas) {
        this.namaKelas = namaKelas;
        this.guru = guru;
        this.murid = new Murid[kapasitas];
        this.jumlahMurid = 0;
    }

    public void daftarMurid(Murid m) {
        if (jumlahMurid < murid.length) {
            murid[jumlahMurid] = m;
            jumlahMurid++;
            System.out.println("Murid " + m.getNama() + " berhasil didaftarkan ke kelas " + namaKelas);
        } else {
            System.out.println("Kelas " + namaKelas + " sudah penuh!");
        }
    }

    public void mulaiLatihan() {
        System.out.println("Latihan " + namaKelas + " dimulai!");
        guru.mengajar();
        for (int i = 0; i < jumlahMurid; i++) {
            murid[i].latihan();
        }
    }

    public void tampilInfoKelas() {
        System.out.println("Kelas: " + namaKelas + ", Guru: " + guru.getNama() +
                           ", Jumlah murid: " + jumlahMurid);
    }

    public String getNamaKelas() {
        return namaKelas;
    }
}
