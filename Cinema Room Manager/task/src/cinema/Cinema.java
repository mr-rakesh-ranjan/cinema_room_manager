package cinema;
import java.util.Scanner;
public class Cinema {

    public static void main(String[] args) {
        System.out.print("Cinema:\n ");
        for(int i = 1; i <= 8; i++){
            System.out.print(" " + i);
        }
        System.out.print('\n');
        for(int rows = 1; rows <= 7; rows++) {
            System.out.print(rows);
            for(int cols = 1; cols <= 8; cols++) {
                System.out.print(" S");
            }
            System.out.print('\n');
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter the number of rows:");
        int qtyOfRows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int qtyOfCols = scanner.nextInt();
        int totalIncome;
        if (qtyOfRows * qtyOfCols <= 60) {
            totalIncome = qtyOfRows * qtyOfCols * 10;
        } else {
           totalIncome = qtyOfRows/2 * qtyOfCols * 10 + (qtyOfRows - qtyOfRows/2) * qtyOfCols * 8;
        }
        System.out.println("Total income:\n$" + totalIncome);
    }
}