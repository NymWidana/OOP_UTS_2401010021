package kelolakelasgenderwayang;

/**
 *
 * @author I Nyoman Widana
 * TGL 20-4-2026
 */

// Guru.java
// Turunan dari Pengguna, mewakili guru tabuh Gender Wayang.

public class Guru extends Pengguna {
    private String spesialis;

    public Guru(String nama, int umur, String spesialis) {
        super(nama, umur);
        this.spesialis = spesialis;
    }

    public void mengajar() {
        System.out.println(nama + " sedang mengajar tabuh dengan spesialisasi: " + spesialis);
    }
}
