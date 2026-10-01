class Test1
{
static void display1()
{
System.out.println("color");
}
static void display2()
{
System.out.println("pen");
}
}
class Program4
{
public static void main(String args[])
{
System.out.println("pencil");
Test1 t1= new Test1();
t1.display1();
t1.display1();
t1.display2();
t1.display1();
t1.display1();
}
}
