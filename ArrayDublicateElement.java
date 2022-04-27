/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package problem;
import java.util.*;
/**
 *
 * @author Rishabh
 */
public class ArrayDublicateElement 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter n numbers: ");
        for(int i=0; i<n; i++) 
        {
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if(arr[i]==arr[j])
                    System.out.println(arr[j]);
            }
        }
    }
    
}
