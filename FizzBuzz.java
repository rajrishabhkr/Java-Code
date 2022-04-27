/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem;

import java.util.Scanner;

/**
 *
 * @author Rishabh
 */
public class FizzBuzz
{
public static void main(String args[])
{
Scanner scanner=new Scanner(System.in);
System.out.print("Enter the number");
int n=scanner.nextInt();
System.out.println("The FizzBuzz ans are:");
for(int i=1; i<n; i++)
{
	if(i%3==0 && i%5==0)
	{
		System.out.print("FizzBuzz");
	}
	else if(i%3==0)
	{
		System.out.print("Fizz");
	}
	else if(i%5==0)
	{
		System.out.print("Buzz");
	}
	else
	{
		System.out.print(i);
	}
	System.out.print(" ");
	}
	scanner.close();
	}
}
