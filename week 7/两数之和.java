import java.util.*;
public class 两数之和
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[1010];
        int[] mp = new int[1010];
        for(int i = 0; i < 1001; ++i)
            mp[i] = -1;
        for(int i = 0; i < n; ++i)
        {
            arr[i] = input.nextInt();
            mp[arr[i]] = i;
        }
        int sum = input.nextInt();
        for(int i = 0; i < n; ++i)
        {
            int temp = sum - arr[i];
            if(temp < 0)
                continue;
            if(mp[temp] != -1)
            {
                System.out.print(++i + " " + ++mp[temp]);
                break;
            }
        }


    }
}
