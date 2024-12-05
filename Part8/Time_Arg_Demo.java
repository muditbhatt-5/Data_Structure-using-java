import java.util.*;
class Time
{
int hour,minutes,second;
public Time(int hour,int minutes,int second)
{
this.second=second;
this.minutes=minutes;
this.hour=hour;
}
void add(Time t)
{
this.second+=second;
if(this.second>=60)
{
this.minutes++;
this.second-=60;
}
this.minutes += t.minutes;
if(this.minutes>=60)
{
this.hour++;
this.minutes-=60;
}
this.hour +=t.hour;
}
}
class Time_Arg_Demo
{
public static void main(String[] args) 
{
Time t1=new Time(11,59,55);
Time t2=new Time(0,0,5);
t1.add(t2);
System.out.println(t1.hour +":" + t1.minutes + ":" + t1.second);
}
}