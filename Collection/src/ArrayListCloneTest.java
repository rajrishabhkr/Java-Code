/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author Rishabh
 */
public class ArrayListCloneTest 
{
    public static void main(String args[])
    {
        ArrayList al=new ArrayList();
        al.add("First");
        al.add(66);
        al.add('A');
        al.add("Random");
        al.add("Bihar");
        System.out.println("Actual ArrayList :"+al);
        ArrayList copy=(ArrayList)al.clone();
        System.out.println("Cloned ArrayList:"+copy);
    }
}

