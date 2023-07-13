import java.util.Scanner;

public class SalesBarChart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Programmer: Dat Vo");
        System.out.println("Lab 17.3: 28-06-2023 @ ");
        System.out.print("\nEnter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        double[] sales = new double[5];

        for (int i = 0; i < sales.length; i++) {
            System.out.print("Enter today's sales for store " + (i + 1) + ": ");
            sales[i] = input.nextDouble();
        }

        System.out.println("\n" + name + ", here is the SALES BAR CHART");

        for (double sale : sales) {
            System.out.print("\t\t");

            int asterisksCount = (int) (sale / 100);

            for (int j = 0; j < asterisksCount; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        input.close();
    }
} 