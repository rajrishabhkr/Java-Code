/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rishabh
 */
import java.io.*;
public class FileOutputStreamExample 
{
    public static void main(String args[])
    {
        try
        {
            File f=new File("testout.txt");
            FileOutputStream fout=new FileOutputStream(f);
            fout.write(65);
            fout.write(66);
            fout.write(67);
            fout.write(68);
            fout.write(75);
            fout.write(80);
            fout.write(85);
            fout.write('A');
            System.out.println("Success..");   
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
