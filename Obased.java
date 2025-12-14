/* 1. 
    import java.util.Scanner;
class DiscountPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price = sc.nextDouble();
        double discount = sc.nextDouble(); // in percentage
        double finalPrice = price - (price * discount / 100);
        System.out.println(finalPrice);
    }
}


2.
import java.util.Scanner;
class MinutesToSeconds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minutes = sc.nextInt();
        System.out.println(minutes * 60);
    }
}


3.
import java.util.Scanner;
class SplitBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bill = sc.nextInt();
        System.out.println(bill / 3);
    }
}
4.
import java.util.Scanner;
class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int speed = sc.nextInt();
        int time = sc.nextInt();
        System.out.println(speed * time);
    }
}
    5.
    import java.util.Scanner;
class KmToMeters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int km = sc.nextInt();
        System.out.println(km * 1000);
    }
}
6.
import java.util.Scanner;
class BytesToBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bytes = sc.nextInt();
        System.out.println(bytes * 8);
    }
}
7.
import java.util.Scanner;
class Candies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int candies = sc.nextInt();
        int people = sc.nextInt();
        System.out.println(candies / people);
    }
}
8.
import java.util.Scanner;
class Cakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int trays = sc.nextInt();
        int cakesPerTray = sc.nextInt();
        System.out.println(trays * cakesPerTray);
    }
}
9.
import java.util.Scanner;
class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int t = sc.nextInt();
        int r = sc.nextInt();
        System.out.println((p * t * r) / 100);
    }
}
10.
import java.util.Scanner;
class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int basic = sc.nextInt();
        int hra = sc.nextInt();
        int da = sc.nextInt();
        System.out.println(basic + hra + da);
    }
}
11.
import java.util.Scanner;
class SellingPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cost = sc.nextInt();
        int profit = sc.nextInt();
        System.out.println(cost + profit);
    }
}
12.
import java.util.Scanner;
class CostPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int selling = sc.nextInt();
        int loss = sc.nextInt();
        System.out.println(selling - loss);
    }
}
13.
import java.util.Scanner;
class Mangoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int qty = sc.nextInt();
        int payQty = qty - (qty / 4);
        System.out.println(price * payQty);
    }
}
14.
import java.util.Scanner;
class Pens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int qty = sc.nextInt();
        int sets = qty / 5;
        int remaining = qty % 5;
        int totalPensToPay = (sets * 3) + remaining;
        System.out.println(totalPensToPay * price);
    }
}
15.
import java.util.Scanner;
class ATMNotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        System.out.println("2000 : " + (amount / 2000));
    }
}
