/*import java .util.Scanner;
   public class cnn{
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    char ch= sc.next().charAt(0);
     if(ch == 'a'|| ch == 'e' || ch == 'i' || ch =='o'|| ch =='u' ||ch =='A'||ch =='E'||ch =='I'||ch =='O'||ch =='U' ){
         System.out.print("vowels");
     }
     else{
        System.out.print("not vowels");
     }
} 
   
}
import java.util.Scanner;

public class cnn {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase Letter");
        }
        else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase Letter");
        }
        else if (ch >= '0' && ch <= '9') {
            System.out.println("Digit");
        }
        else {
            System.out.println("Special Symbol");
        }
    }
} 
    3.alaphabets or not
import java.util.Scanner;

public class cnn {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (ch>='a' &&  ch <='z' ){
            System.out.println("alhapets");
        }
         else if(ch>='A' &&  ch <='Z'){
            System.out.println("alhapets");
         }
         else {
            System.out.println(" not alhapets");
         }
        }
    }
 4.digits or not
import java.util.Scanner;

public class cnn {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a= sc. nextInt();
        if (a>=0 && a<=9 ){
            System.out.println("digits");
        }
       
         else {
            System.out.println(" not digits");
         }
        }
    }

5.
 import java.util.Scanner;
    public class cnn{
        public static void main(String[]args){
            Scanner sc= new Scanner(System.in);
            char a = sc .next().charAt(0);
            char  b = sc .next().charAt(0);

            if (a==b){
                System.out .println("both are same");
            }
            else {
            
                System.out.println(" both are not same");

            }
        }
    }
        --------------------------------------------------------------------------------------------------------------------------------------------------
    year based
1.    import java.util.Scanner;

public class cnn {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a= sc. nextInt();
        if (a%4==0 && a%100==0 && a%400 ==0 ){
            System.out.println("leap");
        }
       
         else {
            System.out.println(" not leap");
         }
        }
    }
2. century
import java.util.Scanner;

public class cnn {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a= sc. nextInt();
        if ( a%100==0  ){
            System.out.println("century");
        }
       
         else {
            System.out.println(" not century");
         }
        }
    }
        3.first and last
first and last digit same or not
import java.util.Scanner;
    public class cnn{
        public static void main(String[]args){
            Scanner sc= new Scanner(System.in);
            int a = sc .nextInt();
            int  firstdigit= (a/100);
            int lastdigit =(a%100);
            if(firstdigit == lastdigit){
                System.out .println("same");
            }
            else {
            
                System.out.println("  not same");

            }
        }
    }
        4.last digit equal
   import java.util.Scanner;
    public class cnn{
        public static void main(String[]args){
            Scanner sc= new Scanner(System.in);
            int a = sc .nextInt();
            int b= sc .nextInt();
            int  f= (a%10);
            int lastdigit =(b%10);
            if(f== lastdigit){
                System.out .println("same");
            }
            else {
            
                System.out.println("  not same");

            }
        }
    }
        5. year and month 
  import java.util.Scanner;

public class cnn {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();   
        int month = sc.nextInt();  

        if (year <= 0 || month < 1 || month > 12) {
            System.out.println("Invalid year or month");
        } 
        else if (month == 1 || month == 3 || month == 5 || month == 7 ||
                 month == 8 || month == 10 || month == 12) {
            System.out.println("Number of days = 31");
        } 
        else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("Number of days = 30");
        } 
        else if( month ==2 && year%400==0 )
            System.out.println("28 days");
        else {
             System.out.println("29 days");
        }

    }

}        */


