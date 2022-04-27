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
public class Constructor 
{
    public Constructor()
    {
        System.out.println("This is Default Constructor");
    }
    public Constructor(int a, int b)
    {
        System.out.println("This is Parameterized Constructor");
        System.out.println("Value of A="+a);
        System.out.println("Value of B="+b);
    }
    public static void main(String[] args)
    {
        Constructor t1=new Constructor();
        Constructor t2=new Constructor(400,500);
    }   
}