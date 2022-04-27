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
public abstract class AbstractXyz 
{
    public abstract void show();
    public abstract void test();
    public abstract void display();
}
abstract class Suraj extends AbstractXyz
{
    public void show()
    {
        System.out.println("Show Method");
    }
}
abstract class Sunil extends Suraj
{
    public void test()
    {
        System.out.println("Test Method");
    }
}
class Anil extends Sunil
{
    public void display()
    {
        System.out.println("Display Method");
    }
    public static void main(String[] args)
    {
        Anil a=new Anil();
        a.show();
        a.test();
        a.display();
    }
}
