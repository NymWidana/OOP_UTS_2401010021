package kelolakelasgenderwayang;

/**
 *
 * @author I Nyoman Widana
 * TGL 20-4-2026
 */

// Pengguna.java
// Kelas dasar untuk semua jenis pengguna (Guru dan Murid).

public class Pengguna {
    protected String nama;
    protected int umur;

    public Pengguna(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }
}

