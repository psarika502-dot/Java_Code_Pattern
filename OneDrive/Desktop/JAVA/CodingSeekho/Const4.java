class Object4
{
int x,y;
Object4()
{
x=22;
y=12;

}
void fun1()
{
x=66;
y=43;
}
void fun2()
{
x=45;
y=11;
}
}
class Const4
{
public static void main(String args[])
{
Object4 b1=new Object4();
b1.fun1();
b1.fun2();
System.out.println(b1.x);
System.out.println(b1.y);
System.out.println(b1.x);
System.out.println(b1.y);
System.out.println(b1.x);
System.out.println(b1.y);
}
}
 

