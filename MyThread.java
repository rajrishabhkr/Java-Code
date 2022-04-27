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
class MyThread extends Thread
{
    synchronized public void run()
    {
        for(int i=0; i<=50; i++)
        {
            System.out.println("Value of I="+i);
        }
    }
}
class Main
{
    public static void main(String[] args)
    {
        MyThread mt=new MyThread();
        Thread t1=new Thread(mt);
        Thread t2=new Thread(mt);
        Thread t3=new Thread(mt);
        t1.start();
        t2.start();
        t3.start();
    }
}
