class Sarikha3
{
private int x,y;
void fun1(int x,int y)
{
this.x=x;
this.y=y;
}
void fun2()
{
int x,y;
System.out.println(this.x);
System.out.println(this.y);
}
}
class ThisK3
{
public static void main(String []args)
{
Sarikha3 s1=new Sarikha3();
s1.fun1(88,22);
s1.fun2();
}
}

