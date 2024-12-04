import java.util.*;
class enqueuee
{ 
    int rear = -1;
    int front = 0;
    public void enqueue()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array::");
        int m = sc.nextInt();
        int[] queue = new int[m];
        if(rear>=m)
        {
            System.out.println("Queue is overflow");
        }
        rear++;
        for(int i=0;i<queue.length;i++)
        {
            System.out.println("enter value for insert::");
            queue[i] = sc.nextInt();
        }
        if(front==0)
        {
            front++;
        }
        if(front == 0)
        {
            System.out.println("Queue is underflow");
        }
        System.out.println("Enter index no for delete::");
        int z = sc.nextInt();
        int x = queue[z];
        queue[z] = 0;
        for(int j=0;j<queue.length;j++)
        {
            System.out.println(j+"'s index value is::"+queue[j]);
        }
    }
}
class queues
{
    public static void main(String[] args)
    {
        enqueuee s = new enqueuee();
        s.enqueue();
        
        // int sw = sc.nextInt();
        // switch(sw)
        // {
        //     case 1 : en 
        //     s.enqueue();
        //     break;
        //     case 2 : de
        //     s.dequeue();
        //     break;
        //     default:
        //         System.out.println("invalid choice");
        //         break;
        // }
    }
}