import java.util.*;

public class ex_01 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] num = new int[n+1];
		for(int i = 0; i < n; i++)
			num[i] = input.nextInt();
		int m = input.nextInt();
		int max = -101;
		int index = -1;
		for(int i = 0; i < n; i++)
		{
			if(num[i] > max && num[i] <= m)
			{
				max = num[i];
				index = i;
			}
		}
		if(index == -1)
			System.out.println("-1");
		else
			System.out.println(index);


	}

}