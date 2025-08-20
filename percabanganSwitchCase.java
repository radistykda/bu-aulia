import java.util.Scanner;

public class percabanganSwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);   
        System.out.println("Masukan warna lampu: ");
        String lampu = input.next();

        switch (lampu) {
            case "merah":
                System.out.println("Anda harus berhenti!");
                break;
            case "kuning":
            System.out.println("Siap-siap berhenti!");
            case "hijau":
            System.out.println("Anda boleh jalan!");
                
                default:
                System.out.println("hm? Salah ketik yaa?");
                break;
        }

    
    }
    
}
