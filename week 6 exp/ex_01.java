import java.util.*;
public class Main{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int big = 1;
		int small  = 0;
		int result;
		for(int i = 1; i < N; i++)
		{
			result = big + small;
            small = big;
			big = result;
		}
        System.out.print(result);

	}
}