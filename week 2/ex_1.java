import java.util.*;
public class Main{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double xigua = input.nextDouble();
		double taozi = input.nextDouble();
		double putao = input.nextDouble();
		double pingguo = input.nextDouble();
		double xiguap = 1.2;
		double taozip = 3.5;
		double putaop = 4.5;
		double pingguop = 5;
		double sum;
		sum = xigua * xiguap + taozi * taozip + putao * putaop + pingguo * pingguop;
		System.out.println(Math.round(xigua * xiguap * 10) / 10.0);
		System.out.println(Math.round(taozi * taozip * 10) / 10.0);
		System.out.println(Math.round(putao * putaop * 10) / 10.0);
		System.out.println(Math.round(pingguo * pingguop * 10) / 10.0);
		System.out.println(Math.round(sum * 10) / 10.0);
	}
}