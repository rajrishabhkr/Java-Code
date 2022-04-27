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
public class StringBufferTest 
{
    public static void main(String[] args)
    {
        StringBuffer s=new StringBuffer("Welcome");
        System.out.println("Value of StringBuffer="+s);
        System.out.println("Length of StringBuffer="+s.length());
        System.out.println("Insert H ="+s.insert(5, 'H'));
        System.out.println("Delete from H="+s.delete(5,'H'));
        System.out.println("After reverse="+s.reverse());
    }
}
