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
public class Palindrome_integer {
    public static void main(String args[]) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter number:");
    int n=scanner.nextInt();
    int r,temp, sum=0 ;
    temp=n;
    while(n>0)
    {
        r=n%10;
        sum=(sum*10)+r;
        n=n/10;
    }
    if(temp==sum)
    {
        System.out.println("Number is Palindrome");
    }
    else
    {
        System.out.println("Not Palindrome");
    }  
}
}