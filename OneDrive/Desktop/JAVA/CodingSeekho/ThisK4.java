class Sarikha4
{
int x,y;
void fun1(int x,int y)
{
this.x=x;
this.y=y;
}
void fun2()
{
System.out.println(this.x);
System.out.println(this.y);
}
}
class Saru1 extends Sarikha4
{
int x,y;
void fun3(int x,int y)
{
this.x=x;
this.y=y;
}
void fun4()
{
System.out.println(x);
System.out.println(y);
}
}
class ThisK4
{
public static void main(String []args)
{
Saru1 s1=new Saru1();
s1.fun1(33,44);
s1.fun2();
s1.fun3(22,11);
s1.fun4();
}
}


