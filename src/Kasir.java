import java.util.Scanner;

public class Kasir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input jumlah barang yang akan dibeli
        System.out.print("Masukkan jumlah barang yang akan dibeli: ");
        int jumlahBarang = input.nextInt();

        // Inisialisasi variabel total belanja
        double totalBelanja = 0;

        // Loop untuk menginput data setiap barang dan menghitung total belanja
        for (int i = 1; i <= jumlahBarang; i++) {
            System.out.println("Input data untuk Barang ke-" + i);

            // Input nama barang
            System.out.print("Nama barang: ");
            String namaBarang = input.next();

            // Input harga barang
            System.out.print("Harga barang (Rp): ");
            double hargaBarang = input.nextDouble();

            // Input jumlah barang (qty)
            System.out.print("Jumlah barang (qty): ");
            int qty = input.nextInt();

            // Menghitung total harga untuk barang tersebut
            double totalHarga = hargaBarang * qty;

            // Menambahkan total harga barang ke total belanja
            totalBelanja += totalHarga;

            // Menampilkan data barang yang dibeli
            System.out.println("Barang: " + namaBarang);
            System.out.println("Qty: " + qty);
            System.out.println("Total: Rp " + totalHarga);
        }

        // Inisialisasi variabel diskon
        double diskon = 0;

        // Cek apakah total belanja lebih dari atau sama dengan 30000
        if (totalBelanja >= 30000) {
            // Menghitung diskon 10%
            diskon = 0.1 * totalBelanja;
            System.out.println("Anda mendapatkan diskon 10%!");
        }

        // Menghitung total yang harus dibayar setelah diskon
        double totalYangHarusDibayar = totalBelanja - diskon;

        // Menampilkan total belanja, diskon, dan total yang harus dibayar
        System.out.println("Total Belanja: Rp " + totalBelanja);
        System.out.println("Diskon: Rp " + diskon);
        System.out.println("Total yang harus dibayar: Rp " + totalYangHarusDibayar);

        // Menutup scanner
    }
}