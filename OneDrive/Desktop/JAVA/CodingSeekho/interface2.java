interface I1
{ 
int x=11; //in interface by default variable is final, public and static.
int y=12;
void fun1(); //In interface by default function is public and abstract. in abstract thereis         
               //no body
static void fun2()
{
System.out.println(x);
}
}
interface I2 extends I1
{ 
int x=77;
static void fun2()
{
System.out.println(x);
}
void fun4();
} 
class C1 implements I2
{
public void fun1()
{
System.out.println("first overlarride");
}
public void fun4()
{
System.out.println("Second overriding");
}
}
class Interface2
{
public static void main(String []args)
{

C1 c1=new C1();
c1.fun1();
c1.fun4();
I2.fun2();
I1.fun2();
}
}   