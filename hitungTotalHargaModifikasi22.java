import java.util.Scanner;

public class hitungTotalHargaModifikasi22 {
    public static void Menu() {
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000 ");
        System.out.println("============================");
        System.out.println("Silahkan pilih menu yang anda inginkan.");
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            hargaTotal *= 0.5; 
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            hargaTotal *= 0.7; 
        } else { 
            System.out.println("Kode promo tidak valid");
        }

        return hargaTotal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu();

        int totalHargaKeseluruhan = 0;
        String kodePromo;
        
        System.out.print("Masukkan kode promo : ");
        kodePromo = sc.next();

        boolean tambahPesanan = true;
        while (tambahPesanan) {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
            int pilihanMenu = sc.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();

            int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
            totalHargaKeseluruhan += totalHarga;

            System.out.print("\nApakah Anda ingin menambah pesanan lagi? (ya/tidak): ");
            String jawaban = sc.next();
            tambahPesanan = jawaban.equalsIgnoreCase("ya");
        }

        System.out.println("Total harga untuk semua pesanan Anda: Rp" + totalHargaKeseluruhan);
    }
}
