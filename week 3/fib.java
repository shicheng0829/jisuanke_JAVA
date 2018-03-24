package jisuankeweek2;
import java.util.*;

public class fib {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println(f(n));
		
	}
	
	public static int f(int num)
	{
		if(num == 0)
			return 0;
		else if(num == 1)
			return 1;
		else
			return f(num -1) + f(num - 2);
	}

}
