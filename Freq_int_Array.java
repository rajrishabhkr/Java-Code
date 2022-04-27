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
public class Freq_int_Array {
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
        int [] fr = new int [arr.length];  
        int visited = -1;  
        for(int i = 0; i < arr.length; i++)
        {
            int count = 1;  
            for(int j = i+1; j < arr.length; j++)
            {  
                if(arr[i] == arr[j])
                {  
                    count++; 
                    fr[j] = visited;  
                }  
            }  
            if(fr[i] != visited)  
                fr[i] = count;  
        }    
        System.out.println(" Element : Frequency");   
        for(int i = 0; i < fr.length; i++)
        {  
            if(fr[i] != visited)
            {  
                System.out.println("    " + arr[i] + "    :   " + fr[i]);
            }  
        }   
    }
    
}
