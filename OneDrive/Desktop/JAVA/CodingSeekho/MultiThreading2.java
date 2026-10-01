class Process1 extends Thread
{
public void run()
{
int i;
for(i=1;i<=10;i++)
{
System.out.println("Process1:"+i);
}
}
}
class Process2 extends Thread
{
public void run()
{
int i;
for(i=1;i<=10;i++)
{
System.out.println("Process2:"+i);
}
}
}
class MultiThreading2
{
public static void main(String []args)
{
Process1 p1=new Process1();
Process2 p2=new Process2();
p1.start();
p2.start();
}
} //* output become vary because in java are faster then for loop are executed fastly
      Process1:1
Process2:1
Process1:2
Process2:2
Process1:3
Process2:3
Process1:4
Process2:4
Process1:5
Process2:5
Process1:6
Process2:6
Process1:7
Process2:7
Process1:8
Process2:8
Process1:9
Process2:9
Process1:10
Process2:10*//