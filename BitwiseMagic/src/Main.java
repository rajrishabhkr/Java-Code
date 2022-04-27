import java.util.*;
import java.lang.*;
import java.io.*;

public class Main 
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0)
        {
            int n=sc.nextInt();
            Solution ob=new Solution();
            System.out.println(ob.getFirstSetBit(n));
        }
    }
}

class Solution
{
    public static int getFirstSetBit(int n)
    {
        int res=0;
        while(n>0)
        {
            int x=0;
            x=n%2;
            n=n/2;
            res++;
            if(x==1)
            break;
        }
        return res;
    }
}