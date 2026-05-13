package day11;

public class TogglingLetters {

	public static void main(String[] args) {
		String sentence = "HyDeRaBaD hyderabad";
		
		
		String [] words = sentence.split(" ");
		
		for(int i=0;i<sentence.length();i++)
		{
			char ch = sentence.charAt(i);
			if(Character.isLowerCase(ch))
			{
				System.out.print(Character.toUpperCase(ch));
				
			}
			else if(Character.isUpperCase(ch))
			{
				System.out.print(Character.toLowerCase(ch));
				
			}
			else if(ch ==' ')
			{
				System.out.print(" ");
			}
		}
		
		System.out.println();
		
		for (String word : words) {
			for(int i=0;i<word.length();i++)
			{
				char ch = word.charAt(i);
				if(Character.isLowerCase(ch))
				{
					System.out.print(Character.toUpperCase(ch));
				}
				else if(Character.isUpperCase(ch)) {
					System.out.print(Character.toLowerCase(ch));
				}
			}
			System.out.print(" ");
		}
		System.out.println();
		
		System.out.println(words[0].toLowerCase());
		System.out.println(words[1].toUpperCase());

	}
	

}
