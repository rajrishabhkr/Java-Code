/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
/**
 *
 * @author Rishabh
 */
public class DeserializationTest 
{
    public static void main(String args[]) throws Exception
    {
        FileInputStream fis=new FileInputStream("xyz.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Test t=(Test)ois.readObject();
        t.show();
    }
    
}
