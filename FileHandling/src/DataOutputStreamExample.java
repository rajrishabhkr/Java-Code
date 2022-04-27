/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rishabh
 */
import java.io.*;
public class DataOutputStreamExample 
{
    public static void main(String args[])
    {
        try
        {
            File f=new File("writeInt.txt");
            FileOutputStream fos=new FileOutputStream(f);
            DataOutputStream dos=new DataOutputStream(fos);
            int i=100; 
            long l=65;
            dos.writeInt(i);
            dos.writeLong(l);
            dos.writeInt(50);
            dos.flush();
            dos.close();
            System.out.println("Success..");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
