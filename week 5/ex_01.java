import java.util.*;

public class Main {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		String[] str = s.split(" ");
		int size = str.length;
		int[] num = new int[size];
		for(int i = 0; i < size; ++i)
		{
			num[i] = Integer.parseInt(str[i]);
		}
		for(int i = 0; i < size; ++i)
			for(int j = 0; j < size - i - 1; ++j)
			{
				if(num[j] > num[j+1])
				{
					int temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
				}
			}
		for(int i = 0; i < size; ++i)
			System.out.print(num[i]+" ");
	}
}