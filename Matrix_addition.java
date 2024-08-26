import java.util.Scanner;

public class Matrix_addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

               System.out.print("Enter the size of the square matrix: ");
        int size = sc.nextInt();

                int[][] matrix = new int[size][size];

               System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

                int principalDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

               for (int i = 0; i < size; i++) {
            principalDiagonalSum += matrix[i][i]; 
            secondaryDiagonalSum += matrix[i][size - 1 - i];         }

                System.out.println("Sum of the Principal Diagonal: " + principalDiagonalSum);
        System.out.println("Sum of the Secondary Diagonal: " + secondaryDiagonalSum);

                int totalSum = principalDiagonalSum + secondaryDiagonalSum;
        System.out.println("Total Sum of both Diagonals: " + totalSum);
    }
}
