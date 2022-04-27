/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author Rishabh
 */
public class ArrayListReplaceElement 
{
    public static void main(String args[])
    {
        ArrayList al=new ArrayList();
        al.add("Hello");
        al.add("Book");
        al.add("Pen");
        al.add("Pencil");
        System.out.println("Data in List="+al);
        al.set(1,"10");
        System.out.println("After Replace data in List :"+al);
        System.out.println("Size of ArrayList="+al.size());
        System.out.println("ArrayList contains data after Replace :");
        for(int index=0; index<4; index++)
        {
            System.out.println(al.get(index));
        }
    }
}

