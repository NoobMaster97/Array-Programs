package Hello;

import java.util.*;
public class MaxIndex
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size");
		int n = sc.nextInt();//Input Array Size
		int ar[] = new int[n];//Initialing Array ar
		System.out.println("Enter Elements in Array");
		for(int i=0; i<n; i++)
		{
			ar[i] = sc.nextInt();
		}
		int max = Integer.MIN_VALUE;
		System.out.println("Printing Max Elements");
		for(int i=0; i<n; i++)
		{
			max = Math.max(max, ar[i]);
			System.out.println(max);
		}
		
		
		
	}
}
