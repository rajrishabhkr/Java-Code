/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package problem;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Rishabh
 */
public class FibonacciNumber 
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your Number=");
        int n = scanner.nextInt();
        int first = 1, second = 1, third=0;
        for(int i=2 ; i<=n ;i++)
        {
            third = second + first;
            first = second;
            second = third;
        }
        System.out.println(third);
    }
}
