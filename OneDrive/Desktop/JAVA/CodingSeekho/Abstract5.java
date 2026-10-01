abstract class Text5
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
abstract void fun3();
Text5()
{
System.out.println("there is first parent's constructor");
}
}
class Read5  extends Text5
{
int z;
void fun4(int z)
{
this.z=z;
}
void fun5()
{
System.out.println(this.z);
}
void fun3()
{
System.out.println("there is a overriding");
}
Read5()
{ 
super();
System.out.println("there is a child constructor");
}
}
class Abstract5
{
public static void main(String []args)
{
System.out.println("below the this keyword used, override and constructor all this type are used");
Read5 r1=new Read5();
r1.fun1(22,11);
r1.fun2();
r1.fun3();
r1.fun4(44);
r1.fun5(); 
}
} // the output become a 
     below the this keyword used ,override and constructor all this type are used
     there is first parent's constructor
     22
     11
     there is a child constructor 
     44