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
public class User_Input_ID {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter your Number");
        int n = scan1.nextInt();
//        System.out.println(number);
        if (n == 1) {
            System.out.println("Male");
        }
        else if (n == 2) {
            System.out.println("Female");
        }else {
            System.out.println("do not know");
        }
    }
}
