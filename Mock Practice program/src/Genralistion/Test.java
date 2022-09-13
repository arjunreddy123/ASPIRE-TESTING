package Genralistion;

public class Test 
{
	public static void main(String[] args) 
	{
		System.out.println("***Medical groups subjects***");
		MedicalGroup m= new MedicalGroup();
		m.physics();
		m.chemistry();
		m.biology();
		m.english();
		
		System.out.println("***Engineering groups subjects***");
		EngineeringGroup e= new EngineeringGroup();
		e.physics();
		e.chemistry();
		e.mathematics();
		e.english();
		
		System.out.println("***Arts groups subjects***");
		Arts a= new Arts();
		a.english();
		a.history();
		a.politicalScience();
	}

}
