import java.util.*;
public class 选择排序
{
    public static void selection_sort(int[] num)
    {
        for(int i = 0; i < 10; ++i)
        {
            int minindex = i;
            for (int j = i; j < 10; ++j)
            {
                minindex = num[j] < num[minindex] ? j : minindex;

            }
            swap(num,i,minindex);
        }
    }
    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]= temp;
    }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int[] num = new int[10];
        for(int i = 0; i < 10; ++i)
        {
            num[i] = input.nextInt();
        }
        selection_sort(num);
        for(int i = 0; i < 10; ++i)
        {
            System.out.println(num[i]);
        }

    }

}
