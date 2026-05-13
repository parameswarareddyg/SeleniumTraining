package tcsinterviewquestions;

/* constructor is a special method used to initialise objects when it is created
 * it is automatically called when object is created using new keyword
 * KeyPoints : 
 * Constructor name is same as class name
 * Constructor does not have any return type
 * it is used to initialise objects
 * it automatically called when object is created using new keyword
 * 
 * Types of Constructor
 * implicit constructor or Default constructor
 * no argument constructor
 * parameterised constructor
 * 
*/

class DefaultConstructor
{
	public void display()
	{
		System.out.println("Default Constructor Called");
	}
}

class NoArgumentConstructor{
	public NoArgumentConstructor()
	{
		System.out.println("No Argument Constructor");
	}
}

class ParameterisedConstructor{
	public ParameterisedConstructor(String username,String Passwor)
	{
		
	}
}
public class ConstructorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
