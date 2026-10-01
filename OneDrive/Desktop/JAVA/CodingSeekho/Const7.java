class Object7
{
int x,y;
Object7(int p,int q)
{
x=p;
y=q;
}
Object7()
{
x=33;
y=43;
}
Object7(int r)
{
x=r;
}
}
class Const7
{
public static void main(String args[])
{
Object7 b1= new Object7(5,6);
Object7 b2= new Object7();
Object7 b3= new Object7(77);
System.out.println(b1.x);
System.out.println(b1.y);
System.out.println(b2.x);
System.out.println(b2.y);
System.out.println(b3.x);
}
}
