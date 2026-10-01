class Lab1 //this is multilevel inheritance
{
int x,y;
void chemistry()
{
System.out.println("chemistry teacher is a wasu mam");
}
void math()
{
System.out.println("math teacher is a nita mam");
}
}
class Lab2 extends Lab1
{
void physics()
{
System.out.println("physics teacher is a nayna mam");
}
}
class Lab3 extends Lab2
{
void dm()
{
System.out.println("DM teacher is a parde mam");
}
}
class Inheritance2
{
public static void main(String []args)
{
System.out.println("all teacher name is in below and these teacher is my best teacher in my life");
Lab2 l1=new Lab2();
l1.chemistry();
l1.math();
l1.physics();
Lab3 l2=new Lab3();
l2.chemistry();
l2.math();
l2.physics();
l2.dm();
}
}
