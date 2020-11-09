/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

import java.util.Scanner;

/**
 *
 * @author jary0160
 */
public class Factorial {

    public static int reccalls;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;
        System.out.println("Enter the factorial number: ");
        num = s.nextInt();
        int fact = factorial(num);
        System.out.println(num + "! = " + fact);
        int fact2 = factorial(num);
        System.out.println(num + "! = " + fact2);
        System.out.println("refactorial was called" + reccalls + "times. ");
        
    }
    
    public static int refactorial(int anum){
        if(anum==1)
            return 1;
        else 
            return anum * refactorial(anum - 1);
    }
    public static int factorial(int anum){
        int answer = anum;
        for (int i = anum-1; i > 0; i--){
            answer *= i;
        }
        return answer;
    }
}
