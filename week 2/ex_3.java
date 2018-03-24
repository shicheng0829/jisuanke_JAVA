import java.util.*;
public class Main{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		int month = input.nextInt();
		int day = input.nextInt();
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		int[] date = {31,28,31,30,31,30,31,31,30,31,30,31};
		if(isLeapYear)
			date[1] = 29;
		int flag = 1;
		if(month <= 0 || month > 12 || day <= 0 || day > date[month - 1])
			flag = 0;
		System.out.println(flag);
	}
}

//1900 2 29
