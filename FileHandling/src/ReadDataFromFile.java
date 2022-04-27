/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
/**
 *
 * @author Rishabh
 */
public class ReadDataFromFile 
{
    public static void main(String args[])
    {
        try
        {
            FileInputStream fin=new FileInputStream("writeData.txt");
            DataInputStream din=new DataInputStream(fin);
            int i=din.readInt();
            long l=din.readLong();
            boolean b=din.readBoolean();
            short s=din.readShort();
            char c=din.readChar();
            float f=din.readFloat();
            double d=din.readDouble();
            byte y=din.readByte();
            System.out.println("int:"+i);
            System.out.println("long:"+l);
            System.out.println("boolean:"+b);
            System.out.println("short:"+s);
            System.out.println("char:"+c);
            System.out.println("float:"+f);
            System.out.println("double:"+d);
            System.out.println("byte:"+y);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
