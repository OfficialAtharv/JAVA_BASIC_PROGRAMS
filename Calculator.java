import java.util.Scanner;
public class Calculator{
public static void main(String args[]){
Scanner reader = new Scanner(System.in);
System.out.println("Enter Two Numbers :- ");
double first_value = reader.nextDouble();
double second_value = reader.nextDouble();
System.out.println("Enter an Operation (+,-,*,/):- ");
char operator = reader.next().charAt(0);
double result; 
 
switch(operator){
case '+':
result = first_value + second_value;
break;
case '-':
result = first_value - second_value;
break;
case '*':
result = first_value * second_value;
break;
case '/':
result = first_value / second_value;
System.out.println("The remender is :- "+first_value%second_value);
break;
default:
System.out.println("Please Enter an valid Input :(");
return;
}
System.out.printf("%.1f %c %.1f = %.1f", first_value , operator ,second_value,result );
}
}