import java.util.Scanner;

public class BelanjaBarangRadisty {
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
          System.out.println("Nama Barang 1:");
        String namabarang = input.nextLine();
        System.out.println("Harga Barang 1:");
        int harga = input.nextInt();
         System.out.println("Nama Barang 2:");
        String NamaBarang = input.next();
        System.out.println("Harga Barang 2:");
        int Harga = input.nextInt();

        System.out.println("=============");
        System.out.println("Barang yang dibeli: "+namabarang+" dan "+NamaBarang);
        System.out.println("Harga: "+harga+" ribu dan "+Harga+" ribu");
    }
}
