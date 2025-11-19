// Bagian Anggota ke -1
// 1. Membuat Class Utama
public class KonveksiBoneka {
    // 2. Menambahkan atribut
    public String namaKonveksi;
    public String lokasi;
    public String jenisBoneka;

    // 3. Membuat Construktor
    public KonveksiBoneka(String namaKonveksi, String lokasi, String jenisBoneka) {
        this.namaKonveksi = namaKonveksi;
        this.lokasi = lokasi;
        this.jenisBoneka = jenisBoneka;
    }

    // 4. Membuat method
    public void tampilkanInfoKonveksi() {
        System.out.println("Nama Konveksi: " + namaKonveksi);
        System.out.println("Lokasi Konveksi: " + lokasi);
        System.out.println("Jenis Boneka: " + jenisBoneka);
    }
}
