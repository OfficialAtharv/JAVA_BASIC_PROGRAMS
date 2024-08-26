import java.util.Scanner;
class plindrom_even{
	public static void main(String args[])
	{
		int reverse=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check the number is palindrom or not :- ");
		int number = sc.nextInt();
		int temp = number;
		while(number!=0)
		{
			int reminder=number%10;
			reverse = reverse*10+reminder;
			number = number/10;
		}
		if(temp==reverse)
		{
			System.out.println("Yes it is a positive palindrom number "+temp+" = "+reverse);
		}
		else	
		{
			System.out.println("No it is a positive palindrom number "+temp+" = "+reverse);

		}
	}
}