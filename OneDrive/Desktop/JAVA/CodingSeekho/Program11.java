class Test7
{
private static int x;
static void set1()
{
x=11;
}
}
class Program11
{
public static void main(String args[])
{
Test7.set1();
System.out.println(x);
}
}