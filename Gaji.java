import java.util.Scanner;

public class Gaji {
    public static int masaKerja;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int jamLembur;
        int gajiPokok = 5000000;
        int lemburPokok = 40000;
        int totalGaji;
        int bonus = 0;


        System.out.println("Masukan Masa Kerja: ");
        masaKerja = input.nextInt();
        System.out.println("Masukan Jam Lembur: ");
        jamLembur = input.nextInt();


        if (masaKerja >= 5 && masaKerja <= 10) {
            gajiPokok = 7500000;
            lemburPokok = 50000;
        } else if (masaKerja > 10) {
            gajiPokok = 10000000;
            lemburPokok = 75000;
        }

        
        if (jamLembur > 0) {
            bonus = lemburPokok * jamLembur;
        }

       
        totalGaji = gajiPokok + bonus;

        
        System.out.println("Total Gaji: Rp. " + totalGaji);

        
        input.close();

        
        System.out.println(Gaji.class.getDeclaredMethods().length);
        System.out.println(Gaji.class.getDeclaredFields().length);
    }
}
