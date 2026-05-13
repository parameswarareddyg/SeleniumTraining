package day12;

public class SumOfDigit {

	public static void main(String[] args) {
		int number = 12345;
		int sum =0;
		while(number != 0)
		{
			int rem = number % 10;
			sum +=rem;
			number = number/10;
		}
		System.out.println("Sum of digits is : "+sum);
	}

}
