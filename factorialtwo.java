import java.util.Scanner;

class factorialtwo {
    public static void main(String[] args) {
        Scanner fact = new Scanner(System.in);
        System.out.println("Enter the number to get the factorial of the number: ");
        int number = fact.nextInt();
        
        int result = calculateFactorial(number);
        System.out.println("The factorial of " + number + " is: " + result);
    }

    public static int calculateFactorial(int n) {
        if (n == 1 || n == 0) {
            return 1; 
        } else {
            return n * calculateFactorial(n - 1); 
        }
    }
}
