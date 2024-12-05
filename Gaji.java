import java.util.Scanner;

/**
 * Program untuk menghitung total gaji berdasarkan masa kerja dan jam lembur.
 */
public class Gaji {
    // Variabel global untuk menyimpan masa kerja
    public static int masaKerja;

    public static void main(String[] args) {
        // Membuat Scanner untuk input pengguna
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel
        int jamLembur;
        int gajiPokok = 5000000; // Gaji pokok awal
        int lemburPokok = 40000; // Tarif lembur per jam awal
        int totalGaji;
        int bonus = 0; // Inisialisasi bonus lembur

        // Input dari pengguna
        System.out.print("Masukkan Masa Kerja (dalam tahun): ");
        masaKerja = input.nextInt();

        System.out.print("Masukkan Jumlah Jam Lembur: ");
        jamLembur = input.nextInt();

        // Menghitung gaji pokok dan tarif lembur berdasarkan masa kerja
        if (masaKerja >= 5 && masaKerja <= 10) {
            gajiPokok = 7500000;
            lemburPokok = 50000;
        } else if (masaKerja > 10) {
            gajiPokok = 10000000;
            lemburPokok = 75000;
        }

        // Menghitung bonus lembur
        if (jamLembur > 0) {
            bonus = lemburPokok * jamLembur;
        }

        // Menghitung total gaji
        totalGaji = gajiPokok + bonus;

        // Menampilkan hasil
        System.out.println("\n--- Hasil Perhitungan Gaji ---");
        System.out.println("Gaji Pokok: Rp. " + gajiPokok);
        System.out.println("Bonus Lembur: Rp. " + bonus);
        System.out.println("Total Gaji: Rp. " + totalGaji);

        // Menutup Scanner
        input.close();

        // Informasi tambahan (opsional)
        System.out.println("\nInformasi Tambahan:");
        System.out.println("Jumlah Method: " + Gaji.class.getDeclaredMethods().length);
        System.out.println("Jumlah Field: " + Gaji.class.getDeclaredFields().length);
    }
}
