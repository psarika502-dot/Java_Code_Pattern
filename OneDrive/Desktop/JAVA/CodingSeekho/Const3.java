class Object3
{
int x,y;
Object3()
{
x=33;
y=11;
}
void fun1()
{
x=12;
y=88;
}
}
class Const3
{
public static void main(String []args)
{
Object3 b1= new Object3();
System.out.println(b1.x);
System.out.println(b1.y);
}
}