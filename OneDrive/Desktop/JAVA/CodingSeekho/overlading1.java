class Demo1
{
int x,y;
void f1(int x)
{
System.out.println("In demo class ");
}
}
class Demo2 extends Demo1
{
void f1(int x)
{
System.out.println("In demo class");
}
}
class overlading1
{
public static void main(String []args)
{
System.out.println("this is the first overlading class and there is a same function but different in class");
Demo2 d1=new Demo2();
d1.fun1(22);
}
}