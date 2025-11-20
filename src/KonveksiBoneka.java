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

        // 4. Memastikan method dapat diakses langsung via KonveksiBoneka.Produksi tanpa
        // instance outer class.
        public void tampilkanProduksi() {
            System.out.println("Nama Desainer: " + namaDesainer);
            System.out.println("Jumlah Boneka: " + jumlahBoneka);
            System.out.println("Estimasi Hari: " + estimasiHari);
            System.out.println("Biaya Produksi per Boneka: Rp" + biayaProduksi);
            System.out.println("Total Biaya Produksi: Rp" + (jumlahBoneka * biayaProduksi));
        }

        // Method yang ditambahkan buat menghitung total biaya per pesanan
        public double getTotalBiayaPesanan() {
            return this.jumlahBoneka * this.biayaProduksi;
        }
    }

    // Bagian Anggota ke - 3
    // 1. Membuat main() untuk membuat instance
    public static void main(String[] args) {

        KonveksiBoneka konveksiUtama = new KonveksiBoneka(
                "Pabrik Boneka Kuda",
                "Jakarta",
                "Boneka Wisuda");

        konveksiUtama.tampilkanInfoKonveksi();

        // 2. Menampilkan hasil info konveksi dan produksi.

        System.out.println("--- Info Pesanan 1 ---");
        KonveksiBoneka.Produksi pesanan1 = new KonveksiBoneka.Produksi(
                "Surya",
                150,
                7,
                45000.0);
        // Menampilkan hasil pesanan 1
        pesanan1.tampilkanProduksi();

        System.out.println("\n--- Info Pesanan 2 ---");
        KonveksiBoneka.Produksi pesanan2 = new KonveksiBoneka.Produksi(
                "Sempurna",
                75,
                4,
                52000.0);
        // Menampilkan hasil pesanan 2
        pesanan2.tampilkanProduksi();

        // 3. Logika sederhana menghitung total biaya dari beberapa pesanan
        System.out.println("\n=========================================");
        double totalSemuaPesanan = pesanan1.getTotalBiayaPesanan() + pesanan2.getTotalBiayaPesanan();
        System.out.println("TOTAL BIAYA KESELURUHAN (2 Pesanan): Rp" + totalSemuaPesanan);
        System.out.println("=========================================");
    }
}