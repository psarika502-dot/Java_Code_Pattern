abstract class Text3
{
int x,y;
void fun1()
{
}
abstract void fun2();
}
class Read2 extends Text3
{
void fun2()
{
System.out.println("child's function is executed");
}
}
class Abstract3
{
public static void main(String []args)
{
Read2 r1=new Read2();
r1.fun2();
}
} // output become child'd function is executed
  //it is possible oveladding function  
  //and the first abstract function is fun1() could contain the body of these function and we write the abstract void Read2(); and not to write the {} thses braces.
