// Bagian Anggota ke -1
// 1. Membuat Class Utama
public class KonveksiBoneka {
    // 2. Menambahkan atribut
    public String namaKonveksi;
    public String lokasi;
    public String jenisBoneka;

    // 3. Membuat Construktor
    public KonveksiBoneka(String namaKonveksi, String lokasi, String jenisBoneka){
        this.namaKonveksi = namaKonveksi;
        this.lokasi = lokasi;
        this. jenisBoneka = jenisBoneka;
    }

    // 4. Membuat method
    public void tampilkanInfoKonveksi(){
        System.out.println("Nama Konveksi: " + namaKonveksi);
        System.out.println("Lokasi Konveksi: " + lokasi);
        System.out.println("Jenis Boneka: " + jenisBoneka);
    }
}

// Bagian Anggota ke - 2
// 1. Membuat static nested class Produksi di dalam KonveksiBoneka.
public static class Produksi {
// 2. Membuat Atribut: namaDesainer, jumlahBoneka, estimasiHari, biayaProduksi.
    String namaDesainer;
        int jumlahBoneka;
        int estimasiHari;
        double biayaProduksi;
// 3. Constructor dan method tampilkanProduksi().
    public Produksi(String namaDesainer, int jumlahBoneka, int estimasiHari, double biayaProduksi) {
            this.namaDesainer = namaDesainer;
            this.jumlahBoneka = jumlahBoneka;
            this.estimasiHari = estimasiHari;
            this.biayaProduksi = biayaProduksi;
        }
// 4. Memastikan method dapat diakses langsung via KonveksiBoneka.Produksi tanpa instance outer class.
    public void tampilkanProduksi() {
            System.out.println("Nama Desainer: " + namaDesainer);
            System.out.println("Jumlah Boneka: " + jumlahBoneka);
            System.out.println("Estimasi Hari: " + estimasiHari);
            System.out.println("Biaya Produksi per Boneka: Rp" + biayaProduksi);
            System.out.println("Total Biaya Produksi: Rp" + (jumlahBoneka * biayaProduksi));
        }
}

// Bagian Anggota ke - 3
// 1. Membuat main() untuk membuat instance dari KonveksiBoneka dan KonveksiBoneka.Produksi.
// 2. Menampilkan hasil kombinasi info konveksi dan produksi.
// 3. Menambahkan logika sederhana perhitungan biaya total (misal: biayaProduksi * jumlahBoneka).