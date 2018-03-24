import java.util.*;
public class Main{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		double p;
		if(N <= 3)
			p = 13;
		else 
			p = 13 + 2.3 * (N - 3);
		p++;
		System.out.println(Math.round(p));
	}
}

