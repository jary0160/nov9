
package Recursion;

import java.util.Scanner;


public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number (min 1) calculate in fiboncci sequence" );
        int num = s.nextInt();
        int fibnum = fib(num);
        System.out.format("fib (%d) = %d\n", num, fibnum);
        System.out.format("recfib(%d) = %d\n", num, fibnum2);
    }
    public static int recfib(int num){
        if (num==1 || num==2)
            return num-1;
        else
            return recfib(num-1) + recfib(num-2);
    }
    public static int fib(int num){
        if (num < 3) return num-1;
        int num1=0, num2 = 1;
        int fib = 0;
        for (int i = 3; i <= num; i++) {
            fib = num1 + num2;
            num1 = num2;
            num2 = fib;
        }
        return fib;
    }
    
}
