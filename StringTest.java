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
public class StringTest 
{
    public static void main(String[] args)
    {
        String s="Welcome";
        System.out.println("Value of String="+s);
        System.out.println("Length of String="+s.length());
        System.out.println("Index of e="+s.indexOf('e'));
        System.out.println("Last index of e="+s.lastIndexOf('e'));
        System.out.println("After replace the required String="+s.replace('W', 'T'));
        System.out.println("After replace all="+s.replaceAll("Wel", "Hello"));
        System.out.println("Character at 4="+s.charAt(4));
        System.out.println("After concat="+s.concat("Sir"));
    }
}
