import java.util.Scanner;

public class Kafe04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String menu;
        char ukuranCup;
        int jumlah;
        boolean keanggotaan;
        double hargaMenu = 0, totalHarga, diskon, nominalBayar;

        System.out.print("Masukkan menu : ");
        menu = sc.nextLine();
        System.out.print("Masukkan ukuran cup : ");
        ukuranCup = sc.next().charAt(0);
        System.out.print("Masukkan jumlah : ");
        jumlah = sc.nextInt();
        System.out.print("Masukkan kenggotaan (true/false) : ");
        keanggotaan = sc.nextBoolean();

        if(menu.toLowerCase() == "kopi")
        {
            hargaMenu = 12000;
        }
        else if(menu.toLowerCase() == "teh")
        {
            hargaMenu = 7000;
        }
        else
        {
            hargaMenu = 20000;
        }

        totalHarga = hargaMenu * jumlah;

        switch (ukuranCup) {
            case 'S':
                break;
            case 'M':
                totalHarga += 0.25 * totalHarga;
                break;
            case 'L':
                totalHarga += 0.4 * totalHarga;
                break;
            default:
                System.out.println("ukuran cup tidak tersedia");
                return;
        }

        diskon = keanggotaan ? 0 : 0.1;
        nominalBayar = totalHarga - (totalHarga * diskon);

        System.out.println("Item pembelian : " + jumlah + " " + menu);
        System.out.println("Ukuran cup : " + ukuranCup);
        System.out.println("Nominal bayar : " + nominalBayar);
    }
}
