import java.util.Scanner;

public class Tugas2_22 {

    static int[][] sales = {
            {20, 20, 25, 20, 10, 60, 10}, 
            {30, 80, 40, 10, 15, 20, 25}, 
            {5, 9, 20, 25, 10, 5, 45},    
            {50, 8, 17, 18, 10, 30, 6},   
            {15, 10, 16, 15, 10, 10, 55}  
    };

    static String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== Menu Cafe ===");
            System.out.println("1. Input Data Penjualan");
            System.out.println("2. Tampilkan Seluruh Data Penjualan");
            System.out.println("3. Tampilkan Menu dengan Penjualan Tertinggi");
            System.out.println("4. Tampilkan Rata-rata Penjualan untuk Setiap Menu");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                inputPenjualan(scanner);
            } else if (choice == 2) {
                tampilkanSeluruhPenjualan();
            } else if (choice == 3) {
                tampilkanPenjualanTertinggi();
            } else if (choice == 4) {
                tampilkanRata2Penjualan();
            } else if (choice == 5) {
                running = false;
                System.out.println("Terima kasih!");
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        }
    }

    public static void inputPenjualan(Scanner scanner) {
        System.out.println("\nInput Data Penjualan");
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Masukkan data untuk " + menu[i] + ":");
            for (int j = 0; j < sales[i].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                sales[i][j] = scanner.nextInt();
            }
        }
    }

    public static void tampilkanSeluruhPenjualan() {
        System.out.println("\nSeluruh Data Penjualan:");
        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i] + ": ");
            for (int j = 0; j < sales[i].length; j++) {
                System.out.print(sales[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void tampilkanPenjualanTertinggi() {
        int highestSales = 0;
        String highestMenu = "";

        for (int i = 0; i < menu.length; i++) {
            int totalSales = 0;
            for (int j = 0; j < sales[i].length; j++) {
                totalSales += sales[i][j];
            }
            if (totalSales > highestSales) {
                highestSales = totalSales;
                highestMenu = menu[i];
            }
        }

        System.out.println("\nMenu dengan penjualan tertinggi: " + highestMenu +
                " dengan total penjualan " + highestSales);
    }

    public static void tampilkanRata2Penjualan() {
        System.out.println("\nRata-rata Penjualan untuk Setiap Menu:");
        for (int i = 0; i < menu.length; i++) {
            int totalSales = 0;
            for (int j = 0; j < sales[i].length; j++) {
                totalSales += sales[i][j];
            }
            double average = (double) totalSales / sales[i].length;
            System.out.println(menu[i] + ": " + average);
        }
    }
}
