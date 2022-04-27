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
public class User_input_name {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner scan = new Scanner(System.in);
      System.out.println ("What is your Name");
      String name = scan.nextLine();
      System.out.println("Hello "+name);
    }
    
}
