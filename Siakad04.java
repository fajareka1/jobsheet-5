import java.util.Scanner;
public class Siakad04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // variable
        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;

        System.out.print("Masukkan nama : ");
        nama = input.nextLine();
        System.out.print("Masukkan NIM : ");
        nim = input.nextLine();
        System.out.print("Masukkan Kelas : ");
        kelas = input.nextLine().charAt(0);
        System.out.print("Masukkan No. Absen : ");
        absen = input.nextByte();
        System.out.print("Masukkan Nilai Kuis : ");
        nilaiKuis = input.nextDouble();
        System.out.print("Masukkan Nilai Tugas : ");
        nilaiTugas = input.nextDouble();
        System.out.print("Masukkan Nilai UTS : ");
        nilaiUTS = input.nextDouble();
        System.out.print("Masukkan Nilai UAS : ");
        nilaiUAS = input.nextDouble();

        nilaiAkhir = (nilaiKuis * 0.2) + (nilaiTugas * 0.15) + (nilaiUTS * 0.3) + (nilaiUAS * 0.35);

        String akreditas, kualifikasi;
        if (nilaiAkhir > 80 && nilaiAkhir <= 100){
            akreditas = "A";
            kualifikasi = "Sangat baik";
        }else if (nilaiAkhir > 73 && nilaiAkhir <= 80){
            akreditas = "B+";
            kualifikasi = "Lebih dari baik";
        }else if (nilaiAkhir > 65 && nilaiAkhir <= 73){
            akreditas = "B";
            kualifikasi = "Baik";
        }else if (nilaiAkhir > 60 && nilaiAkhir <= 65){
            akreditas = "C+";
            kualifikasi = "Lebih dari cukup";
        }else if (nilaiAkhir > 50 && nilaiAkhir <= 60){
            akreditas = "C";
            kualifikasi = "Cukup";
        }else if (nilaiAkhir > 39 && nilaiAkhir <= 50){
            akreditas = "D";
            kualifikasi = "Kurang";
        }else{
            akreditas = "E";
            kualifikasi = "Gagal";
        }

        System.out.println("Nama\t\t: " + nama);
        System.out.println("NIM\t\t: " + nim);
        System.out.println("Kelas\t\t: " + kelas);
        System.out.println("No. Absen\t: " + absen);
        System.out.println("Nilai Akhir\t: " + nilaiAkhir);
        System.out.println("Nilai Akhir Huruf\t: " + akreditas);
        System.out.println("Kualifikasi\t: " + kualifikasi);
        input.close();
    }
}