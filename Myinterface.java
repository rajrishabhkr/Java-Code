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
public interface Myinterface 
{
    void show();
    void test();
}
interface Myinterface2
{
    void display();
    void abc();
}
class Test implements Myinterface,Myinterface2
{
    public void show()
    {
        System.out.println("Show Method");
    }
    public void test()
    {
        System.out.println("Test Method");
    }
    public void display()
    {
        System.out.println("Display Method");
    }
    public void abc()
    {
        System.out.println("ABC Method");
    }
    public static void main(String[] args)
    {
        Test t=new Test();
        t.show();
        t.test();
        t.display();
        t.abc();
    }
}