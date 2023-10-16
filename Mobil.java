// Contoh deklarasi kelas sederhana
public class Mobil {
    // Properti
    String merek;
    String warna;
    int tahunProduksi;

    // Konstruktor
    public Mobil(String merek, String warna, int tahunProduksi) {
        this.merek = merek;
        this.warna = warna;
        this.tahunProduksi = tahunProduksi;
    }

    // Metode
    public void informasiMobil() {
        System.out.println("Merek: " + merek);
        System.out.println("Warna: " + warna);
        System.out.println("Tahun Produksi: " + tahunProduksi);
    }
}
