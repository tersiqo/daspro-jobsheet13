public class Tugas1_22 {
    private double sisi;

    public Tugas1_22(double sisi) {
        this.sisi = sisi;
    }

    public double hitungVolume() {
        return Math.pow(sisi, 3); 
    }

    public double hitungLuasPermukaan() {
        return 6 * Math.pow(sisi, 2); 
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public static void main(String[] args) {
        Tugas1_22 kubus = new Tugas1_22(4);
        System.out.println("Sisi Kubus: " + kubus.getSisi());
        System.out.println("Volume Kubus: " + kubus.hitungVolume());
        System.out.println("Luas Permukaan Kubus: " + kubus.hitungLuasPermukaan());

        kubus.setSisi(8);
        System.out.println("\nSetelah Mengubah Sisi:");
        System.out.println("Sisi Kubus: " + kubus.getSisi());
        System.out.println("Volume Kubus: " + kubus.hitungVolume());
        System.out.println("Luas Permukaan Kubus: " + kubus.hitungLuasPermukaan());
    }
}
