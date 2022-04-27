/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem;

import java.util.Scanner;

/**
 *
 * @author Rishabh
 */
public class SumJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        double firstNumber,secondNumber,answer;
        
        System.out.println("Enter first Number");
        firstNumber=scan.nextDouble();
        
        System.out.println("Enter second Number");
        secondNumber=scan.nextDouble();
        
        answer=firstNumber + secondNumber;
        
        System.out.println("Sum of two Number");
        System.out.println(answer);
    }
}
