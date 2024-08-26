import java.util.Scanner;
class addition_of_digits{
	public static void main(String args[])
	{	int m, n, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the positive number to get the addition of each digit");
		m = sc.nextInt();
		 while(m > 0)
       		 {
            		n = m % 10;
           	 	sum = sum + n;
            		m = m / 10;
        	 }

		System.out.println("The number is "+sum);
	}
}