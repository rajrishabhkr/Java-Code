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
public class Search_Array_integer {
    public static void main(String Args[])
    {
        int n, x, flag=0;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter number size:");
        n=scanner.nextInt();
        System.out.println("Enter Searching number:");
        x=scanner.nextInt();
                
        int[] arr=new int[n];
        System.out.println("Enter numbers of Array:");
        for (int i=0; i<n; i++)
        {
            arr[i]=scanner.nextInt();
        }
        System.out.println("Array elements are: ");
        for (int i = 0; i < arr.length; i++) 
        {     
            System.out.print(arr[i] + " ");     
        } 
        System.out.println();
        
        for(int i = 0; i < n; i++)
        {
            if(arr[i] == x)
            {
                flag = 1;
                break;
            }
            else
            {
                flag = 0;
            }
        }
        if(flag == 1)
        {
            System.out.println("Element found:");
        }
        else
        {
            System.out.println("Element not found");
        }
    }
    
}
