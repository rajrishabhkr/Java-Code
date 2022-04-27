/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rishabh
 */
import java.io.*;
public class BufferWriterExample 
{
    public static void main(String args[])throws Exception
    {
        File f=new File("ram.txt");
        FileWriter writer=new FileWriter(f);
        BufferedWriter bw=new BufferedWriter(writer);
        bw.write("Welcome Sir");
        bw.write("\nHello how are you");
        bw.write("\nfine");
        bw.write("\nwhat about you");
        bw.write("\nfine");
        bw.flush();
        bw.close();
        System.out.println("Success..");
    }
}