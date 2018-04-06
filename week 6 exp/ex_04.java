import java.util.*;
public class Main{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] num = new int[5000];
		int[] dp = new int[5000];
		for(int i = 0; i < n; ++i)
			num[i] = input.nextInt();
		for(int i = 0; i < n; ++i)
			dp[i] = 1;		
		for(int i = 1; i < n; ++i)
		{
			int max = 0;
			for(int j = 0; j < i; ++j)
			{
				if(dp[j] > max && num[i] >= num[j])
				{	
					max = dp[j];
				}
			}
			dp[i] = max + 1;
		}
		int max = 0;
		for(int i = 0; i < n; ++i)
		{
			if(dp[i] > max)
			max = dp[i];
		}

		System.out.print(max);
	}
}