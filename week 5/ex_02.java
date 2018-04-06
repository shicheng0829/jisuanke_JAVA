import java.util.*;

public class Main {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int m = input.nextInt();
		int[] A = new int[m];
		for(int i = 0; i < m; ++i)
		{	
			A[i] = input.nextInt();
		}		
		int n = input.nextInt();
		int[] B = new int[n];
		for(int i = 0; i < n; ++i)
		{	
			B[i] = input.nextInt();
		}
		int[] num = new int[m+n];
		for(int i = 0; i < m; ++i)
			num[i] = A[i];
		for(int i = 0; i < n; ++i)
			num[i+m] = B[i];
		Arrays.sort(num);
		if((m+n)%2==0)
			System.out.printf("%.5f",(double)(num[(m+n)/2-1] + num[(m+n)/2])/2.0);
		else
			System.out.printf("%.5f",(double)num[(m+n)/2]);

	}
}