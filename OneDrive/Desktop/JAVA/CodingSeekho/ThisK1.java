class Sarikha1
{
private int x,y;
void f1(int x, int y)
{
this.x=x;
this.y=y;
}
void f2()
{
System.out.println(x);
System.out.println(y);
}
}
class ThisK1 //this keyword
{
public static void main(String []args)
{
System.out.println("This keyword is used to name comflicting");
Sarikha1 s1=new Sarikha1();
s1.f1(55,44);
s1.f2();
}
}
