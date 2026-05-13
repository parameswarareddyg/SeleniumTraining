package day12;

public class PrintMiddleCharacter {
	public static void main(String[] args) {
		String sentence = "parameshw";
		int length = sentence.length();
		if(sentence.length() %2 ==0)
		{
			System.out.println(sentence.charAt((length/2)-1)+" , "+sentence.charAt(length/2));
		}
		else
		{
			System.out.println(sentence.charAt((length)/2));
		}
	}
}
