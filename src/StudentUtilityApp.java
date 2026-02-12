import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class StudentUtilityApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            // 1. Application Menu
            System.out.println("\n==== STUDENT UTILITY APP ====");
            System.out.println("1. Add Two Numbers");
            System.out.println("2. Check if a number is EVEN or ODD");
            System.out.println("3. Print Numbers from 1 to N");
            System.out.println("4. Display Day of the Week");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();


            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    int num1 = sc.nextInt();
                    System.out.print("Enter second number: ");
                    int num2 = sc.nextInt();
                    int sum = num1 + num2;
                    System.out.println("Result: " + (sum));
                    break;


                case 2:
                    System.out.print("Enter a number: ");
                    int number = sc.nextInt();
                    if (number % 2 == 0) {
                        System.out.println(number + " is EVEN.");
                    } else {
                        System.out.println(number + " is ODD.");
                    }
                    break;


                case 3:
                    System.out.print("Enter a number (N): ");
                    int N = sc.nextInt();
                    System.out.println("Numbers from 1 to " + N + ":");
                    for (int i = 1; i <= N; i++) {
                        System.out.println(i + " ");    
                    }
                    break;

                case 4:
                    System.out.print("Enter a number (1-7) for the day of the week: ");
                    int day = sc.nextInt();
                         
                                switch (day) {
                                    case 1:
                                        
                                        System.out.println("Monday");
                                        break;
                                    case 2:
                                        System.out.println("Tuesday");
                                        break;
                                    case 3:
                                        System.out.println("Wednesday");
                                        break;
                                    case 4:
                                        System.out.println("Thursday");
                                        break;
                                    case 5:
                                        System.out.println("Friday");
                                        break;
                                    case 6:
                                        System.out.println("Saturday");
                                        break;
                                    case 7:
                                        System.out.println("Sunday");
                                        break;
                                    default:
                                        System.out.println("Invalid day");
                                }
            
                
                case 5:
                    System.out.println("Thank you for using the app");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }

        }
        while (choice !=5);

            sc.close();

        }

}