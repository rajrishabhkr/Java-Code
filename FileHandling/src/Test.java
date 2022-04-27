/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rishabh
 */
import java.io.*;
public class Test implements Serializable
{
    int a;
    int b;
    public Test(int a, int b)
    {
        this.a=a;
        this.b=b;
    }
    void show()
    {
        System.out.println("Value of A="+a);
        System.out.println("Value of B="+b);
    }
    void change(int m,int n)
    {
        a=m;
        b=n;
    }
    public static void main(String args[]) throws Exception
    {
        Test t=new Test(400,500);
        t.show();
        FileOutputStream fos=new FileOutputStream("xyz.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(t);
        t.change(10,20);
        t.show();
    }  
}