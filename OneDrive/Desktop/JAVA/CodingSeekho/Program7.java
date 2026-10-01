class Test4
{
int x;
int y;
void set1()
{
System.out.println("A");
}
void set2()
{
System.out.println("B");
}
}
class Program7
{
public static void main(String args[])
{
System.out.println("c");
Test4 t1=new Test4();
t1.x=5;
System.out.println("c");
System.out.println(t1.y);
}
}
