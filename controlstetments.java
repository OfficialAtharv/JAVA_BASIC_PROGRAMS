import java.util.Scanner;
class controlstetments{
public static void main (String args[])
{
Scanner salary = new Scanner(System.in);
System.out.println("Enter your salary here :- ");
double entered_salary = salary.nextDouble();
if (entered_salary >= 50000){
double da = 25;
double hra = 15;
double ta = 7;
double others = 5;
int pf = 2000;
double tds = 10;
double claculated_da = (da/100) * entered_salary;
double calculated_hra = (hra/100) * entered_salary;
double calculated_ta = (ta/100) * entered_salary;
double calculated_others = (others/100) * entered_salary;
double calculated_tds = (tds/100) * entered_salary;
double gross_salary = entered_salary + claculated_da + calculated_hra + calculated_ta + calculated_others + pf - calculated_tds ;

System.out.println("Your Calcualted Salary is :- "+ gross_salary);
}
else if(entered_salary >= 25000 && entered_salary <= 50000){
double da = 15;
double hra = 10;
double ta = 5;
double others = 3;
int pf = 1500;
double tds = 5;
double claculated_da = (da/100) * entered_salary;
double calculated_hra = (hra/100) * entered_salary;
double calculated_ta = (ta/100) * entered_salary;
double calculated_others = (others/100) * entered_salary;
double calculated_tds = (tds/100) * entered_salary;
double gross_salary = entered_salary + claculated_da + calculated_hra + calculated_ta + calculated_others + pf - calculated_tds ;
System.out.println("Your Calcualted Salary is :- "+ gross_salary);
}
else{
double da = 0;
double hra = 0;
double ta = 0;
double others = 0;
int pf = 1500;
double tds = 0;
double claculated_da = (da/100) * entered_salary;
double calculated_hra = (hra/100) * entered_salary;
double calculated_ta = (ta/100) * entered_salary;
double calculated_others = (others/100) * entered_salary;
double calculated_tds = (tds/100) * entered_salary;
double gross_salary = entered_salary + claculated_da + calculated_hra + calculated_ta + calculated_others + pf - calculated_tds ;
System.out.println("Your Calcualted Salary is :- "+ gross_salary);

}
}

}