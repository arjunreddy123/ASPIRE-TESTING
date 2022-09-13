package Casting;

public class Fish extends Animal
{
     String color;
	public void say()
	{
		System.out.println("Hi i am from child Class");
	}
	public void color()
	{
		System.out.println("Fish Colors are Beautiful");
	}
	

	public static void main(String[] args) 
	{
        Animal a=new Fish();
        a.say();
        a.color();
        
        
        
        
        
	}

}
