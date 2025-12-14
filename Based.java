/* 
Based 1. share
public class Based {
    public static void main(String[] args) {
        double totalBill = 900;
        double perPerson = totalBill / 3;
        System.out.println(perPerson);
    }
}
    2 . vote 
   import java.util.Scanner;

public class Based {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Eligible to Vote");
        } else {
            System.out.println("Not Eligible to Vote");
        }
    }
}
    3. 60 
   import java.util.Scanner;

public class Based {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age >= 60) {
            System.out.println("Eligible ");
        } else {
            System.out.println("Not Eligible ");
        }
    }
}
4.
import java.util.Scanner;
class Based {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int battery = sc.nextInt();

        if (battery <= 20)
            System.out.println("Low Battery");
        else if (battery <= 50)
            System.out.println("50% Consumed");
        else
            System.out.println("Battery Full");
    }
}
5.
import java.util.Scanner;
class Based {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();

        if (temp > 100)
            System.out.println("Fever");
        else
            System.out.println("Normal");
    }
}*6.

import java.util.Scanner;
class Based {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        if (marks >= 35)
            System.out.println("Pass");
        else
            System.out.println("Fail");
    }
}
 7.
import java.util.Scanner;
class Based {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        int bill;

        if (units <= 100)
            bill = units * 5;
        else if (units <= 300)
            bill = (100 * 5) + (units - 100) * 5;
        else
            bill = (100 * 5) + (200 * 5) + (units - 300) * 10;

        if (units > 500)
            bill += 100; // surcharge

        System.out.println("Bill Amount: " + bill);
    }
}
    8.
import java.util.Scanner;
class Based {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pin = sc.nextInt();
        int storedPin = 1234;

        if (pin == storedPin)
            System.out.println("PIN Matched. Withdrawal Allowed");
        else
            System.out.println("Invalid PIN");
    }
}
    9.
    import java.util.Scanner;
class Based {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = sc.nextInt();
        int amount = sc.nextInt();

        if (amount <= balance && amount % 100 == 0)
            System.out.println("Withdrawal Successful");
        else
            System.out.println("Invalid Withdrawal");
    }
}
    10.
import java.util.Scanner;
class Based {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String color = sc.next();

        if (color.equalsIgnoreCase("Red"))
            System.out.println("Stop");
        else if (color.equalsIgnoreCase("Yellow"))
            System.out.println("Ready");
        else if (color.equalsIgnoreCase("Green"))
            System.out.println("Go");
    }
}
  11.  import java.util.Scanner;
class Based {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();

        if (amount >= 5000)
            System.out.println("10% Discount");
        else
            System.out.println("No Discount");
    }
}
    12.
    import java.util.Scanner;
class Based {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();

        if (temp < 20)
            System.out.println("Cold");
        else if (temp <= 30)
            System.out.println("Pleasant");
        else
            System.out.println("Hot / Heatwave");
    }
}
    13.
    import java.util.Scanner;
class Based {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();

        if (b > 80)
            System.out.println("Full");
        else if (b >= 30)
            System.out.println("Moderate");
        else
            System.out.println("Low");
    }
}
14.
import java.util.Scanner;
class Based {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age < 12)
            System.out.println("Child Ticket");
        else if (age < 60)
            System.out.println("Adult Ticket");
        else
            System.out.println("Senior Ticket");
    }
}
15.
import java.util.Scanner;
class Based {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int speed = sc.nextInt();

        if (speed > 100)
            System.out.println("Speed Exceeded");
        else
            System.out.println("Speed Normal");
    }
}
16.
import java.util.Scanner;
class Based {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();

        if (num.length() == 10)
            System.out.println("Valid Number");
        else
            System.out.println("Invalid Number");
    }
}
17.
import java.util.Scanner;
class Based {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.next();

        if (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday"))
            System.out.println("Weekend Price");
        else
            System.out.println("Weekday Price");
    }
}
18.
import java.util.Scanner;
class Based {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int liters = sc.nextInt();
        int bill = 0;

        if (liters > 1000 && liters <= 3000)
            bill = ((liters - 1000) / 1000) * 5;
        else if (liters > 3000)
            bill = (2000 / 1000) * 5 + ((liters - 3000) / 1000) * 10;

        System.out.println("Bill: " + bill);
    }
}
19.
import java.util.Scanner;
class Based {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        if (data < 50)
            System.out.println("Low Data");
        else if (data <= 100)
            System.out.println("Half Consumed");
        else
            System.out.println("Data Over");
    }
}
20.
import java.util.Scanner;
class Based {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int speed = sc.nextInt();

        if (speed > 100)
            System.out.println("Over-speeding! Fine imposed.");
        else
            System.out.println("Speed is within limit");
    }
}
*/







