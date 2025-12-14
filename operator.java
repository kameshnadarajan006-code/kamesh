
/*1.greatest two
import java.util.Scanner;
public class operator {
    public static void main(String[]args){
        Scanner Sc= new Scanner(System.in);
        int a = Sc. nextInt();
        int b = Sc. nextInt();
        if (a>b)
        {
            System.out.print(a);

        }
        else {
            System.out.println(b);
        }

        }
            
    }
2.smallest two
import java.util.Scanner;
public class operator {
    public static void main(String[]args){
        Scanner Sc= new Scanner(System.in);
        int a = Sc. nextInt();
        int b = Sc. nextInt();
        if (a<b)
        {
            System.out.print(a);

        }
        else {
            System.out.println(b);
        }

        }
        
            
    }
        3.even or odd
   import java.util.Scanner;
public class operator {
    public static void main(String[]args){
        Scanner Sc= new Scanner(System.in);
        int a = Sc. nextInt();

        if (a%2==0)
        {
            System.out.print("even");

        }
        else {
            System.out.println("odd");
        }

    }         
    }
    4. difference of two number is odd or even
   
    import java.util.Scanner;
    public class operator{
        public static void main(String[]args){
       Scanner sc= new Scanner(System.in);
       int a= sc. nextInt();
       int b= sc. nextInt();
       int difference = (a- b) ;
    if (difference %2 ==  0){
        System.out.println("even");
    }
    else{
        System.out.println("odd");
    }
}
    }
5.3 or non digit number
 import java.util.Scanner;
   public class operator{
    public static void main(String[]args){
        Scanner sc= new Scanner (System.in);
            int a= sc .nextInt();
            if (a>=100 && a<=999){
              System.out.println("it is a 3 digit");
            }
            else{
                System.out.println("it is not a 3 digit");
            }
        }
    }
   6. greatest of 3 values
  import java.util.Scanner;
    public class operator{
        public static void main(String[]args){
            Scanner sc= new Scanner(System.in);
            int a = sc .nextInt();
            int b = sc.nextInt();
            int c=  sc.nextInt();
            if(a>b && a>c){
                System.out .println("a");
            }
            else if ( b>c)
            {
                System.out.println("b");

            }
             else{
                System.out.println("c");
            }

        }
    }
        7. smallest of 3 values
   import java.util.Scanner;
    public class operator{
        public static void main(String[]args){
            Scanner sc= new Scanner(System.in);
            int a = sc .nextInt();
            int b = sc.nextInt();
            int c=  sc.nextInt();
            if(a<b && a<c){
                System.out .println("a");
            }
            else if ( b>c)
            {
                System.out.println("b");

            }
             else{
                System.out.println("c");
            }

        }
    }8. last digit is divisle of 3
   import java.util.Scanner;
    public class operator{
        public static void main(String[]args){
            Scanner sc= new Scanner(System.in);
            int a = sc .nextInt();
            int lastdigit= (a%10);
            if(lastdigit %3 ==0){
                System.out .println("divisble of 3");
            }
            else {
            
                System.out.println(" not divisble of 3");

            }
        }
    }
   9.by using bitwise odd or even
   import java.util.Scanner;
    public class operator{
        public static void main(String[]args){
            Scanner sc= new Scanner(System.in);
            int a = sc .nextInt();
            if((a&1) ==0){
                System.out .println("even");
            }
            else {
            
                System.out.println(" odd");

            }
        }
    }
   10 .sum of two odd or even
   import java.util.Scanner;
    public class operator{
        public static void main(String[]args){
            Scanner sc= new Scanner(System.in);
            int a = sc .nextInt();
            int b = sc .nextInt();
            if((a+b) ==0){
                System.out .println("even");
            }
            else {
            
                System.out.println(" odd");

            }
        }
    }
        11. first digit is even or odd
    import java.util.Scanner;
    public class operator{
        public static void main(String[]args){
            Scanner sc= new Scanner(System.in);
            int a = sc .nextInt();
            int firstdigit= (a/100);
            if(firstdigit %2 ==0){
                System.out .println("even");
            }
            else {
            
                System.out.println(" odd");

            }
        }
    }
        12. last digit is even or odd
    import java.util.Scanner;
    public class operator{
        public static void main(String[]args){
            Scanner sc= new Scanner(System.in);
            int a = sc .nextInt();
            int lastdigit= (a%10);
            if (lastdigit %2 ==0){
                System.out .println("even");
            }
            else {
            
                System.out.println(" odd");

            }
        }
    }
   13. zero,positive,negative
   import java.util.Scanner;
    public class operator{
        public static void main(String[]args){
            Scanner sc= new Scanner(System.in);
            int a = sc .nextInt();
            if(a>0){
                System.out .println("positive");
            }
            else if ( a<0)
            {
                System.out.println("negative");

            }
             else{
                System.out.println("zero");
            }

        }
    }
14. divisble of 3 and 5
 import java.util.Scanner;
    public class operator{
        public static void main(String[]args){
            Scanner sc= new Scanner(System.in);
            int a = sc .nextInt();
        
            if(a %3 ==0 && a%5 ==0){
                System.out .println("divisble of 3 and 5");
            }
            else {
            
                System.out.println(" not divisble of 3 and 5");

            }
        }
    }

   15. divisble of 3 either 7
  import java.util.Scanner;
    public class operator{
        public static void main(String[]args){
            Scanner sc= new Scanner(System.in);
            int a = sc .nextInt();
        
            if(a %3 ==0 || a%7 ==0){
                System.out .println("divisble of 3 either 5");
            }
            else {
            
                System.out.println(" not divisble of 3 either 5");

            }
        }
    }
        16. 2 and 5 but not 8
   import java.util.Scanner;
    public class operator{
        public static void main(String[]args){
            Scanner sc= new Scanner(System.in);
            int a = sc .nextInt();
        
            if(a %2 ==0 && a%5 ==0 &&  a% 8 !=0){
                System.out .println("divisble of 2 and 5  by not 8");
            }
            else {
            
                System.out.println(" not divisble of 2 and 5 by not 8");

            }
        }
    }
17 .last are same or not
  import java.util.Scanner;
    public class operator{
        public static void main(String[]args){
            Scanner sc= new Scanner(System.in);
            int a = sc .nextInt();
            int b = sc .nextInt();

            int lastdigit= (a%10);
            int l= (b%10);
            if (lastdigit == l){
                System.out .println("both are same");
            }
            else {
            
                System.out.println(" both are not same");

            }
        }
    }


18 . 1d 2d 3d
  import java.lang.foreign.SymbolLookup;
import java.util.Scanner;
    public class operator{
        public static void main(String[]args){
            Scanner sc= new Scanner(System.in);
            int a = sc .nextInt();
            if (a>=0 && a<=9){
                System.out .println(" 1 d");
            }
            else if (a>=10 && a<=99) {
                System.out.println("2 d");
            }
            else if(a>=100 && a<=999)
            
                System.out.println("3 d");
            else
            {
                System.out.println("no value");
            }

            }
        }
    
   19 .product of po or ne
    import java.util.Scanner;
    public class operator{
        public static void main(String[]args){
            Scanner sc= new Scanner(System.in);
            int a = sc .nextInt();
            int b = sc. nextInt();
            int c=(a*b);
            if(a>=0){
                System.out .println("positive"+ "the value is po");
            }
             else 
            {
                System.out.println("negative");

            }
        }
    }

import java.util.Scanner;
 public class operator{
    public static void main (String[]args)
    {
        Scanner sc=new Scanner(System.in);
    char ch =sc.next().charAt(0);
    System.out.println((int)ch);
     if( (ch%2)==0)
      {
        System.out.println("even");
      }
      else{
        System.out.println("odd");
      }



    }
}*/




    
 