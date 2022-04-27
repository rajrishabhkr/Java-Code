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
public class FinalVar {
    int a;
    static int b;
    final int c=10;
    void show()
    {
        int d=a+b+c;
        System.out.println("Value of A ="+a);
        System.out.println("Value of B ="+b);
        System.out.println("Value of C ="+c);
        System.out.println("Value of D ="+d);
    }
    public static void main(String[] args)
    {
        FinalVar t=new FinalVar();
        t.show();
    }
}
