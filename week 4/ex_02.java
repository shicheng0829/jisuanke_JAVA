import java.util.*;

public class ex_02 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] num = new int[n];
		for(int i = 0; i < n; i++)
			num[i] = input.nextInt();
		Arrays.sort(num);
		System.out.print(num[0] + " ");
		for(int i = 1; i < n; i++)
		{
			if(num[i] != num[i-1])
				System.out.print(num[i] + " ");
		}

	}

}