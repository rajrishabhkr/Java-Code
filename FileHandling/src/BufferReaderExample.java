/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
/**
 *
 * @author Rishabh
 */
public class BufferReaderExample 
{
    public static void main(String args[])
    {
        try
        {
            File f=new File("test.txt");
            FileReader fr=new FileReader(f);
            BufferedReader br=new BufferedReader(fr);
            int i;
            while((i=br.read())!=-1)
            {
                System.out.println((char)i);
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    
}
