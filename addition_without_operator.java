import java.util.Scanner;
class addition_without_operator{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter two numbers for addition with out arithmetic operator in java :- ");
		int first_number=sc.nextInt();
		int second_number=sc.nextInt();
		int a =first_number;
		for(int i=0;i<second_number;i++)
		{
			a++;
			
		}
		System.out.println("first number "+first_number+" second number "+second_number);
		System.out.println(a);
	}
}