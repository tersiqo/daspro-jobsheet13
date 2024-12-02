public class PengunjungCafe22foreach {

    public static void daftarPengunjungDanUsia(Object... dataPengunjung) {
        System.out.println("Daftar Nama Pengunjung dan Usia:");
        for (int i = 0; i < dataPengunjung.length; i += 2) {
            String nama = (String) dataPengunjung[i];
            int usia = (int) dataPengunjung[i + 1];
            System.out.println("- " + nama + ", Usia: " + usia);
        }
    }

    public static void main(String[] args) {
        daftarPengunjungDanUsia("Ali", 25, "Budi", 30, "Citra", 28);
    }
}
