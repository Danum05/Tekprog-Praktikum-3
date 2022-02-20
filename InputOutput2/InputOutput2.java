package InputOutput2;

import java.util.Scanner;

/**
 * <h1>Soal 2 : Input & Output(2)</h1>
 * Input & Output (2) program implements an applicaton
 * to print output with a format
 *
 * Input format	: Input a String followed by an integer
 * Output format: The first column contains the String and is left justified using exactly 15 characters.
 * 				  The second column he second column contains the integer, expressed in exactly 3 digits.
 * 
 * @author Danu Mahesa
 * @version 1.0
 * @since 2022-02-20
 */

public class InputOutput2 {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();    // Input the string
                int x=sc.nextInt();     // Input the integer 
                System.out.printf("%-15s%03d%n",s1,x);
            }
            System.out.println("================================");

    }
}