

public class Arjun extends student
{
        void disp()
       {
	       rollno=1;
	       name="Arjun";
	       marks=99;
	       System.out.println("Roll No="+rollno+" "+"Name="+name+" "+"Marks="+marks);
      }
	public static void main(String[] args) 
	{
		
     Arjun r=new Arjun();
      r.input();
      r.disp();
     
	}
;
}
