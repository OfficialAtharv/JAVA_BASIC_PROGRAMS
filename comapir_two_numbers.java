import java.util.Scanner;

class comapir_two_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.println("Enter the two numbers to compare: ");
            int first = sc.nextInt();
            int second = sc.nextInt();

            if (first > second) {
                System.out.println(first + " is greater than " + second);
            } else if (first < second) {
                System.out.println(first + " is smaller than " + second);
            } else {
                System.out.println("Both numbers are the same");
            }

       System.out.print("Do you want to compare another pair of numbers? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        sc.close();
    }
}
