import java.util.*;
public class dequeue
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of array::");
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter Value for"+i+"index::");
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter Value For Delete::");
        int m = sc.nextInt();
        int z = arr[m];
        return;
    }
}