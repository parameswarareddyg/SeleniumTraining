package tcsinterviewquestions;

public class PrintMiddleCharactersofString {

	public static void main(String[] args) {
		String text = "Ready";
		int length = text.length();
		System.out.println("Length of String is : "+length);
		if(length%2 == 0)
		{
			System.out.println(text.charAt((length/2)-1)+" "+text.charAt((length/2)));
		}
		else
		{
			System.out.println(text.charAt(length/2));
		}

	}

}
