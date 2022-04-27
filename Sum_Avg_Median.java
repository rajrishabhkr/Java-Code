/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Rishabh
 */
public class Sum_Avg_Median {
     public static void main(String[] args) 
    {
        int n, sum = 0;
        double average;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number size in array:");
        n = scanner.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the numbers:");
        for(int i = 0; i < n ; i++)
        {
            a[i] = scanner.nextInt();
            sum = sum + a[i];
        }
        System.out.println("Sum:"+ sum);
        average = (double)sum / n;
        System.out.println("Average:"+ average);
        Arrays.sort(a);
        double m=0.0;
        if (a.length % 2 ==0)
        {
            m = (double)(a[n/2] + a[n/2 - 1])/2;
        }
        else
        {
            m = a[(n-1)/2];
        }
        System.out.println("Median:"+ m);        
    }
    
}
