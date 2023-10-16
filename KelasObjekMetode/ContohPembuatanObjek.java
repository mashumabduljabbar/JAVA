public class ContohPembuatanObjek {
    public static void main(String[] args) {
        // Membuat objek dari kelas Mobil
        Mobil mobilPertama = new Mobil("Toyota", "Merah", 2020);
        Mobil mobilKedua = new Mobil("Honda", "Biru", 2022);

        // Memanggil metode pada objek
        mobilPertama.informasiMobil();
        mobilKedua.informasiMobil();
    }
}
