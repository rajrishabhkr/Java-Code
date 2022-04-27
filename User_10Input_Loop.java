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
public class User_10Input_Loop {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter your Number");
        for (int i=0; i<10; i++){
            int  n= scan1.nextInt();
            System.out.println("Number entered "+n);
        }
    }
    
}
