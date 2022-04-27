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
public class Reverse_array_integer {
    public static void main(String Args[]){
    int n;  
    Scanner scanner=new Scanner(System.in);  
    System.out.print("Enter the number size of elements: ");    
    n=scanner.nextInt();  
    int[] arr = new int[n];  
    System.out.println("Enter the number of the array: ");
    for(int i=0; i<n; i++)  
    {
        arr[i]=scanner.nextInt();  
    }
    System.out.println("Array elements are: "); 
    for (int i = 0; i < arr.length; i++) 
    {
        System.out.print(arr[i] + " ");  
    }  
    System.out.println();  
    System.out.println("Array in reverse order: ");    
    for (int i = arr.length-1; i >= 0; i--) 
    {
        System.out.print(arr[i] + " ");  
    }  
}
    
}
