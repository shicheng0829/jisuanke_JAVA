import java.util.*;

public class ex_03 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int[][] num = new int[3][3];
		int win = 0;
		for(int i = 0; i < 3; i++)
			for(int j = 0; j < 3; j++)
				num[i][j] = input.nextInt();
		for(int i = 0; i < 3; i++)
		{
			if(num[i][0] == 1 && num[i][1] == 1 && num[i][2] == 1)
				win = 1;
			else if(num[i][0] == 0 && num[i][1] == 0 && num[i][2] == 0)
				win = -1;
		}
		for(int i = 0; i < 3; i++)
		{
			if(num[0][i] == 1 && num[1][i] == 1 && num[2][i] == 1)
				win = 1;
			else if(num[0][i] == 0 && num[1][i] == 0 && num[2][i] == 0)
				win = -1;
		}
		if(num[0][0] == 1 && num[1][1] == 1 && num[2][2] == 1)
			win = 1;
		else if(num[0][0] == 0 && num[1][1] == 0 && num[2][2] == 0)
			win = -1;
		if(num[0][2] == 1 && num[1][1] == 1 && num[2][0] == 1)
			win = 1;
		else if(num[0][2] == 0 && num[1][1] == 0 && num[2][0] == 0)
			win = -1;
		if(win == 0)
			System.out.println("Draw");
		else if(win == 1)
			System.out.println("Bob Win");
		else
			System.out.println("Alice Win");
	}
}