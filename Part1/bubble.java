import java.util.*;
public class bubble 
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Size Of Array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter Values in array:");
			arr[i]=sc.nextInt();
		}
        int temp=0;
        for(int i=0;i<size-1;i++)
        {
            for(int j=0;j<size-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("sorted array is:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}