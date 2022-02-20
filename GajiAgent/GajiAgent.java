package GajiAgent;
import java.util.Scanner;

/**
 * <h1>Soal 4 : Gaji Agent</h1>
 * Program Gaji Agent mengimplementasikan aplikasi untuk melakukan 
 * perhitungan gaji sebuah agent penjualan.
 * 
 * Input format	: Satu baris integer berupa jumlah penjualan bulan ini
 * Output format: Satu baris berisi sebuah bilangan berupa gaji yang diterima
 * 
 * @author Danu Mahesa
 * @version 1.0
 * @since 2022-02-20
 */

public class GajiAgent {

    public static void main(String[] args) {
        // kamus data
        int gajiPokok = 500000;
        int item;
        double bonus;
        double TotalGaji;
        double potongGaji;
        int HargaPerBarang = 50000;
        
        try ( //membuat imputan untuk jumlah item pada bulan ini
                Scanner input = new Scanner(System.in)) {
            item = input.nextInt();
            // operasi sesuai dengan kondisi item yang terjual
            if(item > 80){
                TotalGaji = item * HargaPerBarang * 35/100;
                System.out.println(TotalGaji);
            }else if(item >= 40){
                TotalGaji = item * HargaPerBarang * 1/4;
                System.out.println(TotalGaji);
            }else if(item < 15){
                item = 15 - item;
                potongGaji = (0.15*50000*item);
                TotalGaji = (500000 - potongGaji);
                System.out.println(TotalGaji);
            }else{
                bonus = (0.10)*(item*50000);
                TotalGaji = 500000 + bonus;
           
            }
            // menampilkan dan mengkonversi double menjadi int
            System.out.println((int)TotalGaji);
            input.close();
        }
        
    }
    
}
