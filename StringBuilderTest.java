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
public class StringBuilderTest 
{
    public static void main(String[] args)
    {
        StringBuilder s=new StringBuilder("Welcome");
        System.out.println("Value of StringBuilder="+s);
        System.out.println("Length of StringBuilder="+s.length());
        System.out.println("Capacity of StringBuilder="+s.capacity());
        System.out.println("Append= "+s.append("Sir"));
        System.out.println("Reverse= "+s.reverse());
    }
}
