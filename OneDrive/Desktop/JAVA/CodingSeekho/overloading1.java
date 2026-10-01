class Demo1
{
int x,y;
void fun1(int p)
{ 
System.out.println("the first arguments");
}
void fun1(int m,int n)
{
System.out.println("two arguments");
}
}
class overloading1
{
public static void main(String []args)
{
System.out.println("this is the overloading method");
Demo1 d1=new Demo1();
d1.fun1(22,11);
}
}   // this is the overloading method 
    // two arguments

