/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rishabh
 */
import java.io.*;
public class PrintWriterExample 
{
    public static void main(String args[]) throws Exception
    {
        File f1=new File("C:\\kundan");
        boolean iscreated = f1.mkdirs();
        System.out.println(iscreated);
        File f=new File("C:\\kundan\\System1.txt");
        PrintWriter pw=new PrintWriter(f);
        pw.println("Welcome Sir");
        pw.println("Hello how are you?");
        pw.println("fine");
        pw.println("what about you?");
        pw.println("fine");
        pw.flush();
        pw.close();
        System.out.println("Success..");
    }
}
