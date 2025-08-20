import java.util.Scanner;

public class perhitunganDiskon {
    public static void main(String[] args) {
        double totalbeli, diskon, hargaakhir, bayar, kembalian;

        System.out.println("=====Toko Baju GaB=====");

        Scanner input = new Scanner(System.in);
        System.out.println("Total pembelian: ");
        totalbeli = input.nextDouble();

        if (totalbeli > 500000) {
            diskon = (0.2) * totalbeli;
            System.out.println("Mendapat diskon 20%");
        } else if (totalbeli > 300000) {
            diskon = (0.15) * totalbeli;
            System.out.println("Mendapat diskon 15%");
        } else if (totalbeli > 100000) {
            diskon = (0.1) * totalbeli;
            System.out.println("Mendapat diskon 10%");
        } else {
            System.out.println("Tidak ada diskon");
            diskon = 0;
        }

        hargaakhir = totalbeli - diskon;
        System.out.println("Harga akhir: " + hargaakhir);
        System.out.println("Masukkan pembayaran: ");
        bayar = input.nextDouble();
        kembalian = bayar - hargaakhir;
        System.out.println("Kembalian anda: " + kembalian);
        System.out.println("q: Terimakasih dan selamat datang kembali :p");
    }

}
