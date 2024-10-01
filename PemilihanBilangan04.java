import java.util.Scanner;

/**
 * PemilihanBilangan04
 */
public class PemilihanBilangan04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int angka;
        String status;
        System.err.print("masukkan sebuah angka : ");
        angka = sc.nextInt();

        // if(angka % 2 == 0)
        // {
        //     status = "genap";
        // }
        // else
        // {
        //     status = "ganjil";
        // }
        
        // menggunakan tenary
        status = angka % 2 == 0 ? "genap" : "ganji";

        System.err.println("Angka " + angka + " adalah bilangan " + status);
    }
}