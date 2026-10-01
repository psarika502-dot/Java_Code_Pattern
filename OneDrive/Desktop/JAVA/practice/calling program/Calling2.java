class Object2
{
int x;
int y;
void main1()
{
x=44;
}
void main2()
{
y=54;
System.out.println(x);
}
}
class Calling2
{
public static void main(String []args)
{
Object2 b1= new Object2();
b1.main1();
b1.main2();
System.out.println("Succesfully execute the program without creating static member variable and function");
}
}