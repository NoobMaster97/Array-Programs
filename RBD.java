package Hello;

import java.util.*;
//Record Breaking Day
public class RBD 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();//Array Size
		int ar[] = new int[n+1]; //Array of size N+1
		ar[n] = -1;
		System.out.println("Enter elemetns in array");
		for(int i=0; i<n; i++)
		{
			ar[i] = sc.nextInt();
		}
		
		int max = Integer.MIN_VALUE;
		int rbd = 0;
		for(int i=0; i<n; i++)
		{
			if(ar[i]>max && ar[i]>ar[i+1])
			{
				rbd++;
			}
			max = Math.max(max, ar[i]);
		}
		System.out.println(rbd);
	}
}
