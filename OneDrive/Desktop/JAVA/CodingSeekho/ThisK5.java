class Sarikha5
{
int x,y;
void display1(int x,int y)
{
this.x=x;
this.y=y;
}
void display2()
{
System.out.println(this.x);
System.out.println(this.y);
}
}
class Saru2 extends Sarikha5
{
int x,y;
void display3(int x,int y)
{
super.x=x;
super.y=y;
}
void display4()
{
System.out.println(super.x);
System.out.println(super.y);
}
}
class ThisK5
{
public static void main(String []args)
{
Saru2 s1=new Saru2();
s1.display1(44,33);
s1.display4();
}
}

