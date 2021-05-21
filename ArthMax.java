package Hello;

import java.util.*;
public class ArthMax
{
	//Program to Calculate Arthmatic Longest Sub Array
	//Asked Google KickStart
	static void ArthMacticArray(int ar[], int n)
	{
		int previousDifference = ar[1] - ar[0];
		int ans = 2; // current length
		int j = 2; // Loop variable j
		int currentIndex = 2;//To calculate maximum length of sub array
		
		while(j<n)
		{
			if( previousDifference == ar[j]-ar[j-1])//check previous difference is same or not
			{
				currentIndex++;//Increase Current Index by 1
			}
			else
			{
				previousDifference = ar[j] - ar[j-1];
				currentIndex = 2;
			}
			ans = Math.max(ans, currentIndex);
			j++;
		}
		System.out.println("Maximum lenght of Arithmetic SubArray is -> "+ans);
		
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();//Array size
		int ar[] = new int[n];//Initializing array ar
		System.out.println("Enter elements in array");
		for(int i=0; i<n; i++)
		{
			ar[i] = sc.nextInt();
		}
		ArthMacticArray(ar, n);
	}

}
