/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
/**
 *
 * @author Rishabh
 */
public class FileReaderExample 
{
    public static void main(String args[])
    {
        try
        {
            File f=new File("abc.txt");
            FileReader fr=new FileReader(f);
            int i;
            while((i=fr.read())!=-1)
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
