package Berhitung;

import java.util.Scanner;

/**
 * <h1>Soal 3 : Berhitung</h1>
 * Program Berhitung mengimplementasikan aplikasi untuk melakukan 
 * operasi matematika (penjumlahan, pengurangan, perkalian, pembagian, sisa hasil bagi)
 *
 * Input format	: Satu baris berisi A, operator, dan B, masing-masing dipisahkan sebuah spasi,
 * 				  yang menyatakan terdapat operasi "A operator B"
 * Output format: Satu baris berisi sebuah bilangan bulat, hasil "A operator B"
 * 
 * @author Danu Mahesa
 * @version 1.0
 * @since 2022-02-20
 */

public class Berhitung {
	public static void main(String args[]) {
		try (Scanner input = new Scanner(System.in)){
			int result = 0;
			int A = input.nextInt();        //Input integer 
			String operator = input.next(); //Input Operasi aritmatika 
			int B = input.nextInt();        //Input integer 
			switch (operator) {
			case("+"):
				result = A+B;
				break;
			case("-"):
				result = A-B;
				break;
			case("*"):
				result = A*B;
				break;
			case("/"):
				result = A/B;
				break;
			case("%"):
				result = A%B;
				break;
			}
			System.out.printf("%d", result);  //Tampilkan hasil
		}catch (Exception e) {
			System.out.println("something error");
		}
	}
}