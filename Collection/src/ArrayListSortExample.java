/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author Rishabh
 */
public class ArrayListSortExample 
{
    public static void main(String args[])
    {
        ArrayList al=new ArrayList();
        al.add("1");
        al.add("3");
        al.add("5");
        al.add("2");
        al.add("4");
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        for(int i=0; i<al.size(); i++)
        {
            System.out.println(al.get(i));
        }
    }
}

