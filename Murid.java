package kelolakelasgenderwayang;

/**
 *
 * @author I Nyoman Widana
 * TGL 20-4-2026
 */

// Murid.java
// Turunan dari Pengguna, mewakili murid Gender Wayang.

public class Murid extends Pengguna {
    private String tingkat;
    private String catatan;

    public Murid(String nama, int umur, String tingkat, String catatan) {
        super(nama, umur);
        this.tingkat = tingkat;
        this.catatan = catatan;
    }

    public void tampilProfil() {
        System.out.println("Nama: " + nama + ", Umur: " + umur +
                           ", Tingkat: " + tingkat + ", Catatan: " + catatan);
    }

    public void latihan() {
        System.out.println(nama + " sedang berlatih tabuh Gender Wayang.");
    }
}
