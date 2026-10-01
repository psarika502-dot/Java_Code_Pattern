class Text4
{
int x,y;
void fun1()
{
}
Text4()
{
System.out.println("Parent's constructor is executed");
}
}
class Read3 extends Text4
{
void fun2()
{
}
Read3()
{
System.out.println("child's constructor is executed");
}
}
class Abstract4
{
public static void main(String []args)
{
Read3 r1=new Read3();
}
} //output become a Parent's constructor is executed and second line output is child's            constructor is executed
    