import java.util.Scanner;
public class avarage{
public static void main (String args[])
{
System.out.println("The program to find the average of given five numbers: ");
Scanner sc = new Scanner(System.in);
System.out.println("Enter Five Numbers One By One To Find Avarage :- ");
int first = sc.nextInt();
int second = sc.nextInt();
int third = sc.nextInt();
int fourth = sc.nextInt();
int fifth = sc.nextInt();

int sum = first + second + third + fourth + fifth;
int total_avarage = sum / 5; 
System.out.println("The avarage of given numbers is :-"+total_avarage);

}
}