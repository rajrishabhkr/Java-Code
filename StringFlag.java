/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Rishabh
 */
public class StringFlag {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s=in.nextLine();
        System.out.println("Enter a flag value as 0 or 1:\n"+ "0 - for even \n"+"1 - for odd");
        int flag=in.nextInt();
        List<Character> evenChars=new ArrayList<Character>();
        List<Character> oddChars=new ArrayList<Character>();
        for(int i=0;i<=s.length()-1; i++){
            if(i%2==0){
            char odd=s.charAt(i);
            oddChars.add(odd);
            }else{
            char even=s.charAt(i);
            oddChars.add(even);
            }
        }
        if(flag==0){
            System.out.println("Even chart are: "+evenChars);
        }
        else if(flag==1){
            System.out.println("Odd chart are: "+oddChars);
        }else{
            System.out.println("Invalid flag entered ");
        }
    }

}
