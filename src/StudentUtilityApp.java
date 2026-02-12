import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class StudentUtilityApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            // 1. Application Menu
            System.out.println("\n==== Application Menu ====");
            System.out.println("1. Add Two Numbers");
            System.out.println("2. Check if a number is EVEN or ODD");
            System.out.println("3. Print Numbers from 1 to N");
            System.out.println("4. Display Day of the Week");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();







        }
        while (choice !=5);

            sc.close();

        }

}