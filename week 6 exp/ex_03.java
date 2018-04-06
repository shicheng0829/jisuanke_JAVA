import java.util.*;
public class Main{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int M = input.nextInt();
		int N = input.nextInt();
		int T = input.nextInt();
		int[][] num = new int [200][200];
		for(int i = 0; i < M; ++i)
			for(int j = 0; j < N; ++j)
				num[i][j] = input.nextInt();
		if(T == 1)
			for(int i = M-1; i >= 0; --i)
			{
				for(int j = 0; j < N; ++j)
				{
					System.out.print(num[i][j]+" ");
					if(j == N-1)
						System.out.println();
				}
			}
		else if(T == 0)
			for(int i = 0; i < M; ++i)
			{
				for(int j = N-1; j >= 0; --j)
				{
					System.out.print(num[i][j]+" ");
					if(j == 0)
						System.out.println();
				}
			}

	}
}