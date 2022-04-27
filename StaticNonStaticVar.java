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
public class StaticNonStaticVar {
    int a=10;
    static int b=20;
    void show()
    {
        System.out.println("Value of A ="+a);
        System.out.println("Value of B ="+b);
    }
    void change()
    {
        a++;
        b++;
    }
    public static void main(String[] args)
    {
        StaticNonStaticVar p1=new StaticNonStaticVar();
        StaticNonStaticVar p2=new StaticNonStaticVar();
        p1.show();
        p2.show();
        p1.change();
        p1.show();
        p2.show();

        p2.change();
        p1.show();
        p2.show();
        p1.change();
        p1.show();
        p2.show();
        p2.change();
        p1.show();
        p2.show();
        p1.change();
        p1.show();
        p2.show();

        p2.change();
        p1.show();
        p2.show();

    }
}
