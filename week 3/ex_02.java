package jisuankeweek2;
import java.util.*;

public class ex_02 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int decimal = input.nextInt();
		int radix = input.nextInt();
		String result = "";
		while(decimal != 0)
		{
			int value = decimal % radix;
			char digit = (char)(value+'0');
			result = digit + result;
			decimal = decimal / radix;
		}
		System.out.println(result);
	}

}
