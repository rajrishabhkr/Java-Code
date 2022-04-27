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
public class Static_Var 
{
    int a=100;
    static int b=200;
    void show()
    {
        int c=a+b;
        System.out.println("Value of A ="+a);
        System.out.println("Value of B ="+b);
        System.out.println("Value of C ="+c);
    }
    void display()
    {
        int d=b-a;
        System.out.println("Value of D ="+d);
    }
    public static void main(String[] args)
    {
        Static_Var x=new Static_Var();
        x.show();
        x.display();
        int e=x.a*b;
        System.out.println("Value of E ="+e);
    }
}
