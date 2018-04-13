import java.util.*;
public class 快速排序
{
    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]= temp;
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int N = 10;
        int[] array = new int[N];
        for(int i = 0; i < array.length; i++)
        {
            array[i] = input.nextInt();

        }
        qsort(array, 0, N - 1);
        Printarray(array, N);
    }

    static void qsort(int p[], int start, int end)
    {//补充完整代码
        if(start < end)
        {
             int mid = partition(p,start,end);
             qsort(p,start,mid-1);
             qsort(p,mid+1,end);

        }
    }

    static int partition(int p[],int start,int end)
    {//补充完整代码
        int less = start - 1;
        int more = end;
        while(start < more)
        {
            if(p[start]  < p[end])
                swap(p,start++,++less);
            else if(p[start] > p[end])
                swap(p,start,--more);
            else
                start++;

        }
        swap(p,more,end);
        return less + 1;

    }

    static void Printarray(int data[], int size)
    {
        int i;
        for(i = 0; i < size; i++)
        {
            System.out.printf("%d ", data[i]);
        }
    }
}
