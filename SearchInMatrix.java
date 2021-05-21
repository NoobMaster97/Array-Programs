package Hello;

import java.util.*;
//Program to find an element in matrixx with O(n) time complexity LINEAR TIME
public class SearchInMatrix
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Matrix is ->");
		int n = sc.nextInt();
		int ar[][] = new int[n][n];
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				ar[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter Element to be searched");
		int a = sc.nextInt();
		int r=0, c=n-1;
		while(r<n && c>=0)
		{
			if(ar[r][c] == a)
			{
				System.out.println("Element is foundend and is present at->"+(r+1)+" "+(c+1));
				break;
			}
			else if(ar[r][c] > a)
			{
				c--;
			}
			else
			{
				r++;
			}
		}
	}
}
