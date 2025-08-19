import java.util.Scanner;

public class belanjabuah {
    public static void main(String[] args) {
        System.out.println("====TOKO BUAH ADIS====");
         Scanner input = new Scanner (System.in);
         System.out.println("jumlah buah apel: ");
        int apel= input.nextInt();
        System.out.println("jumlah buah nanas: ");
        int nanas= input.nextByte();
        double hargaapel =8500, hargananas =20000;
        double total, bayar, Kembalian;

        total=(apel*hargaapel)+(nanas*hargananas);
        System.out.println("Jumlah apel yang dibeli: " +apel+" dan nanas: "+nanas);
        System.out.println("total pembayaran: " +total);
        System.out.println("Masukan pembayaran: ");
        bayar=input.nextDouble();
        Kembalian = bayar-total;
        System.out.println("kembalian anda adalah: "+Kembalian);
        System.out.println("====TERIMAKASIH SELAMAT DATANG KEMBALI====");
        




    }
}
