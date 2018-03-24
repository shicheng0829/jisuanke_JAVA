package jisuankeweek2;
import java.util.*;

public class ex_03 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int gcd = 1;
		int k = 2;
		while(k <= n1 && k <= n2)
		{
			if(n1 % k == 0 && n2 % k == 0)
				gcd = k;
			k++;
		}
		int lcm = n1 * n2 / gcd;
		System.out.println(gcd);
		System.out.println(lcm);
	}

}
