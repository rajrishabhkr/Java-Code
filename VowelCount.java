/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem;

/**
 *
 * @author Rishabh
 */
public class VowelCount {
    public static void main(String args[])
    {
        String s="I Love My India";
        String[] s1 = s.split("[aeiouAEIOU]");
        for(String s2:s1)
        {
            System.out.println(s2);
        }
        System.out.println("Number of vowel = "+(s1.length+1));
    }
    
}
