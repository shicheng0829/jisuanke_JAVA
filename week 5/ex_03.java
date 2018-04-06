import java.util.*;

public class ex_03 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int[] num = new int[N];
		for(int i = 0; i < N; ++i)
		{
			num[i] = input.nextInt();
		}
		int[] dp = new int[N];
		int[] result = new int[100];
		for(int i = 0; i < N; i++)
			result[i] = 0;
		dp[N-1] = 1;
		int max = 0;
		int index = 0;
		for(int i = N-2; i >= 0; i--)
		{
			for(int j = i+1;j < N; j++)
			{
				if(dp[j] > max && num[j] < num[i]) //这句要注意有个num[i] > num[j]的条件
				{
					max = dp[j];
					index = j;

				}
			}
			if(num[i] > num[index])
			{
				dp[i] = max + 1;
				result[i] = index;
			}
			else
				dp[i] = max;
		}
		int i;
		for(i = 0; i < N; i++)
		{
			if(result[i] != 0)
				break;
		}
		while(i < N && result[i] != 0)
		{
			System.out.print(num[i] + " ");
			i = result[i];
			
		}
		System.out.print(num[i]);
	}
}
/*
用例输入：
10
1 2 3 4 5 6 7 6 9 -1

用例正确输出：
7 6 -1

你的输出：
9 -1
*/

