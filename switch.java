/*1.
import java.util.Scanner;

 public class Switch {
  public static void main(String[] args) {

    char operator;
    Double number1, number2, result;
    Scanner Sc = new Scanner(System.in);
    System.out.println("Choose an operator: +, -, *, or /");
    operator = Sc.next().charAt(0);
    number1 = Sc.nextDouble();
    number2 = Sc.nextDouble();

    switch (operator) {
      case '+':
        result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
        break;
      case '-':
        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
        break;
      case '*':
        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
        break;
      case '/':
        result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }

  }
}
   2. GRADE
 import java.util.Scanner;

public class Switch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the marks: ");
        int marks = sc.nextInt();

        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade: A");
        } else if (marks >= 75 && marks < 90) {
            System.out.println("Grade: B");
        } else if (marks >= 50 && marks < 75) {
            System.out.println("Grade: C");
        } else if (marks >= 0 && marks < 50) {
            System.out.println("Grade: Fail");
        } else {
            System.out.println("Invalid marks");
        }

        sc.close();
    }
}
3. WEEK OR WEEKEND
import java.util.Scanner;
public class Switch{
    public static void main(String[]args){
        Scanner Sc=new Scanner(System.in);
        int day= Sc.nextInt ();
    switch(day){
        case 1:System.out.println("weekday");break;
        case 2:System.out.println("weekday");break;     
        case 3:System.out.println("weekday");break;
        case 4:System.out.println("weekday");break;
        case 5:System.out.println("weekday");break;        
        case 6:System.out.println("weekend");break;
        case 7:System.out.println("weekend");break;
        default:System.out.println("INVALID");
    }
    }
}
4. season
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month number (1-12): ");
        int month = sc.nextInt();

        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println(" Winter");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Summer");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("Monsoon");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println(" Autumn");
                break;

            default:
                System.out.println("Invalid month number");
        }

        
    }
} 5. atm
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        double balance = 10000; 

        System.out.println("---- MINI ATM ----");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");

        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Your Balance is: ₹" + balance);
                break;

            case 2:
                System.out.print("Enter deposit amount: ₹");
                double deposit = sc.nextDouble();
                balance = balance + deposit;
                System.out.println("Amount Deposited Successfully");
                System.out.println("Updated Balance: ₹" + balance);
                break;

            case 3:
                System.out.print("Enter withdrawal amount: ₹");
                double withdraw = sc.nextDouble();
                if (withdraw <= balance) {
                    balance = balance - withdraw;
                    System.out.println("Please collect your cash");
                    System.out.println("Remaining Balance: ₹" + balance);
                } else {
                    System.out.println("Insufficient Balance");
                }
                break;

            case 4:
                System.out.println("Thank you for using the ATM");
                break;

            default:
                System.out.println("Invalid choice");
        }

    }
}*/
    

