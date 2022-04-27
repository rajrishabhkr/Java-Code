/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Rishabh
 */
public class Maximizing_two_array {
    public static void main(String Args[])
    {
        int n;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter Integer array Size:");
        n=scanner.nextInt();
        
        int[] arr1=new int[n];
        System.out.println("Enter Array 1 number:");
        for (int i=0; i<n; i++)
        {
            arr1[i]=scanner.nextInt();
        }
        int[] arr2=new int[n];
        System.out.println("Enter Array 2 number:");
        for (int i=0; i<n; i++)
        {
            arr2[i]=scanner.nextInt();
        }
        
        int arr3[] = new int[10];
        for(int i = 0; i < arr3.length; i++)
        {
            arr3[i] = 0;
        }
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i = 0; i < arr2.length; i++)
        {
            if(arr3[arr2[i]] == 0)
        {
            arr3[arr2[i]] = 2;
            al.add(arr2[i]);
        }
        }
        for(int i = 0; i < arr1.length; i++)
        {
            if(arr3[arr1[i]] == 0)
        {
            arr3[arr1[i]] = 1;
            al.add(arr1[i]);
        }
        }
        int count = 0;
        for(int j = 9; j >= 0; j--)
        {
            if(count < arr1.length & (arr3[j] == 2 || arr3[j] == 1))
        {
            count++;
        }
        else
        {
            al.remove(Integer.valueOf(j));
        }
        }
        int i = 0;
        for(int x:al)
        {
            arr1[i++] = x;
        }}
 
// Function to print array elements
static void printArray(int[] arr)
{
    for(int x:arr)
    {
        System.out.print(x + " ");
    }
}
}
