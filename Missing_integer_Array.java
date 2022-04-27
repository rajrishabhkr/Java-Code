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
public class Missing_integer_Array {
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value: ");
        int n = sc.nextInt();
        int inpuArray[] = new int[n];
        System.out.println("Enter (n-1) numbers: ");
        for(int i=0; i<=n-2; i++) 
        {
            inpuArray[i] = sc.nextInt();
        }
        int sumOfAll = (n*(n+1))/2;
        int sumOfArray = 0;
        for(int i=0; i<=n-2; i++) 
        {
            sumOfArray = sumOfArray+inpuArray[i];
        }
        int missingNumber = sumOfAll-sumOfArray;
        System.out.println("Missing number is: "+missingNumber);
}
    
}
