/* ✅ Pyramid pattern in Java
    *
   ***
  *****
 *******
*********

 */

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Rows = ");

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++)
        {
            for (int j = 1; j < N-i; j++)
            {System.out.print(" ");}

            for (int k = 1; k <= 2*i-1; k++)
            {System.out.print("*");}

            System.out.println();
        }
        sc.close();
    }
}
