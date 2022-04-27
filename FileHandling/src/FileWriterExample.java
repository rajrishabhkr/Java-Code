import java.io.*;
public class FileWriterExample 
{
    public static void main(String args[])
    {
        try
        {
            File f=new File("test1.txt");
            FileWriter fw=new FileWriter(f);
            fw.write("Welcome Sir");
            fw.write("\nHello how are you");
            // \n for new line
            fw.write("\nFine");
            fw.write("\nWhat about you");
            fw.write("\nfine");
            fw.flush();
            fw.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Success--");
    }
}
