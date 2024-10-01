import java.util.Scanner;

public class KategoriUsia04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int usia;
        String kategori;

        System.out.print("Masukkan usia Anda: ");
        usia = sc.nextInt();
        if (usia < 0) {
            System.out.println("Usia harus berupa angka positif. Silakan coba lagi.");
        }

        if (usia >= 0 && usia <= 12) {
            kategori = "Anak-anak";
        } else if (usia >= 13 && usia <= 19) {
            kategori = "Remaja";
        } else if (usia >= 20 && usia <= 64) {
            kategori = "Dewasa";
        } else {
            kategori = "Lansia";
        }

        System.out.println("Kategori usia: " + kategori);

        sc.close();
    }
}
