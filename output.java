/* 
1.pass or fail
import java.util.Scanner;
public class Mone {
    public static void main(String []args){
        Scanner Sc= new Scanner(System.in);
        int a= Sc .nextInt();
        System.out.println((a>50)?"postive":"negative");

    }
    
}
    2.number is positive or negative...
import java.util.Scanner;
public class Mone {
    public static void main(String []args){
        Scanner Sc= new Scanner(System.in);
        int a= Sc .nextInt();
        System.out.println((a>=1)?"postive":"negative");

    }
    
}
    3.greatest of three numbers..

import java.util.Scanner;
public class Mone {
    public static void main(String []args){
        Scanner Sc= new Scanner(System.in);
        int a= Sc .nextInt();
         int b= Sc .nextInt();
         int c= Sc .nextInt();

        System.out.println((a>b && a>c)?a:( b>c)?b:(c));
    }
}
4. equal of two numbers

import java.util.Scanner;
public class Mone {
    public static void main(String []args){
        Scanner Sc= new Scanner(System.in);
        int a= Sc .nextInt();
         int b= Sc .nextInt();
         Boolean c=(a==b);
        System.out.println((c));
    }
}

5. average three numbers
import java.util.Scanner;
public class Mone {
    public static void main(String []args){
        Scanner Sc= new Scanner(System.in);
        int a= Sc .nextInt();
         int b= Sc .nextInt();
         int c= Sc .nextInt();

        System.out.println((a+b+c)/3);
    }
}
    6.cube
import java.util.Scanner;
public class Mone {
    public static void main(String []args){
        Scanner Sc= new Scanner(System.in);
        int a= Sc .nextInt();
        

        System.out.println((a*a*a));
    }
}

7.square
import java.util.Scanner;
public class Mone {
    public static void main(String []args){
        Scanner Sc= new Scanner(System.in);
        int a= Sc .nextInt();
        

        System.out.println((a*a));
    }
}
    8.sum
import java.util.Scanner;
public class Mone {
    public static void main(String []args){
        Scanner Sc= new Scanner(System.in);
        int a= Sc .nextInt();
        int b= Sc .nextInt();

        System.out.println((a+b));
    }
}
    9.differences

import java.util.Scanner;
public class Mone {
    public static void main(String []args){
        Scanner Sc= new Scanner(System.in);
        int a= Sc .nextInt();
        int b= Sc .nextInt();

        System.out.println((a-b));
    }
}
    10.remainder
import java.util.Scanner;
public class Mone {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println(a/b);
    }
}
    10. quotient
import java.util.Scanner;
public class Mone {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println(a%b);
    }
}
    11. product
import java.util.Scanner;
public class Mone {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println(a*b);
    }
}
    12. swap the value by using the third
import java.util.Scanner;
public class Mone {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c=b;
        System.out.println(c);
        System.out.println(b=a);
    }
}
    13.swap the value by  without using the third
import java.util.Scanner;
public class Mone {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println(b);
        System.out.println(b=a);
    }
}
    15.remainder
import java.util.Scanner;
public class Mone {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        System.out.println(a%10);
    }
}
    16.quotient
import java.util.Scanner;
public class Mone {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        System.out.println(a/10);
    }
}
    17.sum of first and last number
import java.util.Scanner;
public class Mone {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        String s=Integer.toString(a);
        char ch=s.charAt(0);
        int c = Integer.parseInt(Character.toString(ch));
        int b=a%10;
        System.out.println(c+b);
    }
}
    18.absolute
import java.util.Scanner;
public class Mone {
    public static void main(String []args){
        Scanner Sc= new Scanner(System.in);
        int a= Sc .nextInt();
        System.out.println((0<a)?a:"invalid");
    }
}
19.middle number
import java.util.Scanner;
public class Mone {
    public static void main(String []args){
        Scanner Sc= new Scanner(System.in);
        int a= Sc .nextInt();
        int b=a%100;
        System.out.println(b/10);
    }
}
20.
import java.util.Scanner;

public class Mone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Condition: n > 0 AND (n & (n - 1)) == 0
        if (n > 0 && (n & (n - 1)) == 0) {
            System.out.println("YES, it is a power of 2");
        } else {
            System.out.println("NO, it is not a power of 2");
        }
    }
*/

















