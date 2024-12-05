import java.util.*;
class time 
{
    int hour;
    int min;
    public time(int hour,int min)
    {
        this.hour = hour;
        this.min = min;
    }
    public void add(time t)
    {
        this.min += t.min;
        this.hour += t.hour;
        if(this.min>60)
        {
            this.min-=60;
        }
    }
}
public class timer
{
    public static void main(String args[])
    {
        time t1 = new time(1,30);
        time t2 = new time(10,31);
        t1.add(t2);
        System.out.println("Time after addition is : "+t1.hour+" hours and "+t1.min+" minutes");
    }
}