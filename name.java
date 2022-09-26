import java.util.Scanner;
class Name
{
	String firstName,lastName;
	public Name()
	{
		/*firstName="Leslie";
		lastName="Evans";*/
		this("Leslie","Evans");
	}
	public Name(String f,String l)
	{
		//this(check(f),check(l));//infinite recursion
		firstName=check(f);
		lastName=check(l);
		
		
	}
	public String check(String s)
	{
		Scanner kb=new Scanner(System.in);
			for(int i=0;i<s.length();i++)//!=
			{
				//CHECKS for digits and symbols
				if((Character.isDigit(s.charAt(i))) || (Character.isLetterOrDigit(s.charAt(i))==false))
				{
					System.out.println("name is invalid");
					//re try
					System.out.print("Please type without numbers and/or symbols: ");
					s=kb.next();
					i=0;
					//break;//exit for loop
				}
				/*else//it is a letter
				{
					
				}*/
			}
			//if we get here s is good
			return s;
	}
	
	public String toString()
	{
		return firstName+" "+lastName;
	}
	//check if there are numbers or symbols except '
}