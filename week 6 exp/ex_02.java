import java.util.*;
public class Main{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int[] num = new int[10001];
		for(int i = 2; i <= N; i++)
		{
			if(num[i] == 0)
				System.out.println(i);
			for(int j = i * 2; j <= N; j += i)
				num[j] = 1;
		}
	}
}