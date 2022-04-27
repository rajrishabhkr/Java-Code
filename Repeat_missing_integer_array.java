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
public class Repeat_missing_integer_array {
    public static void main(String Args[])
    {
        int n;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter Integer array Size:");
        n=scanner.nextInt();
        
        int[] arr=new int[n];
        System.out.println("Enter Array number:");
        for (int i=0; i<n; i++)
        {
            arr[i]=scanner.nextInt();
        }
        System.out.println("Elements in Array are:");
        for (int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");   
        }
        System.out.println();
        
        System.out.println("The repeating element is: ");
        for (int i = 0; i < n; i++) 
        {
            int abs_val = Math.abs(arr[i]);
            if (arr[abs_val - 1] > 0){
                arr[abs_val - 1] = -arr[abs_val - 1];
            }else{
                System.out.println(abs_val);
            }
        }
//      Exception  Number between 1 to n..
        System.out.println("The missing element is: ");
        for (int i = 0; i < n; i++) 
        {
            if (arr[i] > 0)
            {
                System.out.println(i + 1);
            }
        }
        
    }   
}
