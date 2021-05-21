package Hello;

import java.util.*;
public class MatrixMulti
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Inputs ->");
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int a[][] = new int[n][m];
		int b[][] = new int[m][k];
		int c[][] = new int[n][k];
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<m; i++)
		{
			for(int j=0; j<k; j++)
			{
				b[i][j] = sc.nextInt();
			}
		}
		System.out.println("Multiplying Matrix");
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<k; j++)
			{
				for(int l=0; l<m; l++)
				{
					c[i][j] = c[i][j] + (a[i][k] * b[k][j]);
				}
			}
		}
		
		System.out.println("Multiplication is ->");
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<k; j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}
