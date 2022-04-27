/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author Rishabh
 */
public class SynchronizedListFromArrayList 
{
    public static void main(String args[])
    {
        ArrayList al=new ArrayList();
        al.add("fggf");
        al.add("eee");
        al.add("ccc");
        al.add("ilcmj");
        al.add("bgr");
        al.add("uyyt");
        al.add("pqq");
        System.out.println(al);
        List list=Collections.synchronizedList(al);
        System.out.println(list);
    }
}
