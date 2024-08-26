import java.util.Scanner;
class factorial{
public static void main (String args[])
{
Scanner fact = new Scanner(System.in);
System.out.println("Enter the number to get factorial of the number:- ");
int factorial = fact.nextInt();
int number=1;
for(int i=1;i<=factorial;i++){
number=number*i;
}
System.out.println(number);
}
}