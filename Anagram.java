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
public class Anagram {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        String a= scanner.nextLine();
        String b= scanner.nextLine();
        scanner.close();
        int a1=a.length();
        int b1=b.length();
        if (a1 != b1)
        {
            System.out.println("Not Anagrams");
            return;
        }
        String a2=a.toLowerCase();
        String b2=b.toLowerCase();
        int[] freq1Array= new int[26];
        int[] freq2Array= new int[26];
        for (int i=0; i<a1; i++)
        {
            char ch1= a2.charAt(i);
            freq1Array[ch1-'a']++;
            
            char ch2= b2.charAt(i);
            freq2Array[ch2-'a']++;
        }
        for (int i=0; i<26; i++)
        {
            if (freq1Array[i]!=freq2Array[i])
            {
                System.out.println("Not Anagrams");
                return;
            }
        }
        System.out.println("Anagrams");
    }
}
