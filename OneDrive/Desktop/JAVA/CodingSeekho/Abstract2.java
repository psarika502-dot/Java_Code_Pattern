abstract class Text2
{
int x,y;
void fun1()
{
}
abstract void fun2()
{
}
}
class Read1 extends Text2
{
int z;
void fun3()
{
}
}
class Abstract2 
{
public static void main(String []args)
{
Read1 r1=new Read1();
}
}
  // output become a error: abstract methods cannot have a body
abstract void fun2()
    and 2 error is a Read1 is not abstract and does not override abstract method
fun2() in Text2
its meand we can create the abstract fun2() function and we can create the child function then we create the object but all parent function is access and in parent function is present the abstact function . we create function is abstract the compursory create the class is abstract or override method created.