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
public class Rotating_array {
    public static void main(String Args[]){
        int n, k;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter number size:");
        n=scanner.nextInt();
        System.out.println("Enter K value:");
        k=scanner.nextInt();
                
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
        
        int j, last;
        for(int i = 0; i < k; i++)
        {     
            last = arr[arr.length-1];    
            for(j = arr.length-1; j > 0; j--)
            {   
                arr[j] = arr[j-1];    
            }        
            arr[0] = last;    
        }    
        System.out.println();   
        System.out.println("Array after rotation: ");    
        for(int i = 0; i< arr.length; i++)
        {    
            System.out.print(arr[i] + " ");    
        }    
    }
    
}
