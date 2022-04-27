/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author Rishabh
 */
public class ArrayListUsingIterator 
{
    public static void main(String args[])
    {
        ArrayList al=new ArrayList();
        al.add("Patna");
        al.add("Book");
        al.add("Delhi");
        al.add(88);
        al.add('P');
        al.add(99.25f);
        al.add(new Object());
        System.out.println("ArrayList Contains.."+al);
        ListIterator itr=al.listIterator();
        System.out.println("Iterating through ArrayList element in forward direction...");
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println("Iterating through ArrayList element in backward direction..");
        while(itr.hasPrevious())
        {
            System.out.println(itr.previous());
        }
    }
}
