class Sarikha2
{
private int x,y;
void set1(int x,int y)
{
this.x=x;
this.y=y;
}
void set2()
{
int x=44;
int y=43;
System.out.println(x);
System.out.println(y);
}
}
class ThisK2
{
public static void main(String []args)
{
Sarikha2 s1=new Sarikha2();
s1.set1(33,11);
s1.set2();
}
}

