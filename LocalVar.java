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
public class LocalVar {
    int a;
    static int b;
    void show()
    {
        int c=10;
        int d=10;
        System.out.println("Value of A ="+a);
        System.out.println("Value of B ="+b);
        System.out.println("Value of C ="+c);
        System.out.println("Value of D ="+d);
    }
    public static void main(String[] args)
    {
        LocalVar a=new LocalVar();
        a.show();
    }
}
