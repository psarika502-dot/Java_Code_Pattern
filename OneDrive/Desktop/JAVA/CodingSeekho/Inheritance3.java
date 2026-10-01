
class Subject1
{
int x;
int y;
void datastructure()
{
System.out.println("This is the DS teacher");
}
void discretemathematics()
{
System.out.println("This is the DM teacher");
}
}
class Subject2 extends Subject1
{
int m;
void programminglanguage()
{
System.out.println("This is the oop mam");
}
}
class Subject3 extends Subject1
{
void mathematics()
{
System.out.println("This the mathematics teachers");
}
}
class Inheritance3
{
public static void main(String []args)
{
System.out.println("This is tha all teachers");
Subject3 s1=new Subject3();
s1.datastructure();
s1.discretemathematics();
s1.mathematics();
}
}
