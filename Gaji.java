import java.util.Scanner;

public class Gaji{
    public static int masaKerja;
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int jamLembur = input.nextInt();
        int gajiPokok = 5000000;
        int lemburPokok = 40000;
        int totalGaji = 0;
        int bonus = 0;

        
        /* Pekerjaan anda mulai dari sini */
        System.out.println("Masukan Masa Kerja : ");
        masaKerja  = scanner.nextInt();
        System.out.println("Masukan Jam Lembur : ");
        jamLembur  = scanner.nextInt();

        
        /* Menghitung masa kerja */
        if (masaKerja < 5){
        } else if (masaKerja >=5 && masaKerja <=10){
            gajiPokok = 7500000;
            lemburPokok = 50000;
        } else {
            gajiPokok = 10000000;
            lemburPokok = 75000;
        }

        
        /* Menghitung lembur */
        if (jamLembur < 5){
        } else if (jamLembur >=5 && jamLembur <=10){
            bonus = lemburPokok * jamLembur;
        } else {
            bonus = lemburPokok * jamLembur;
        }
        

        
        totalGaji = gajiPokok + bonus;
        System.out.println("Total Gaji : Rp. " + totalGaji);

        scanner.close();
       

        /* Pekerjaan anda berakhir sini */

        System.out.println(Gaji.class.getDeclaredMethods().length);
        System.out.println(Gaji.class.getDeclaredFields().length);
    
    }

}
