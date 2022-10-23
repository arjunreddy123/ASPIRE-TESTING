
public class Person 
{
int age=21;
int weight=56;
String color="light";

void eat() 
{
	System.out.println("Iam Eating");
	
}
void sleep()
{
	System.out.println("Iam Sleeeping");
	
}
	public static void main(String[] args) 
	{
		Person p=new Person();
		System.out.println("Person Age is:"+p.age);
		System.out.println("Person Weight is:"+p.weight);
		System.out.println(p.color);
		p.eat(); 
		p.sleep();
	}

}
