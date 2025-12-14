/* 

public class Main {
    public static void main(String[]args){
        System.out.println("hello");
    }
}
relational
import java.util.Scanner;
public class Main {
    public static void main(String []args){
        Scanner Sc=new Scanner(System.in);
        int a= Sc.nextInt();
        int b= Sc.nextInt();
        System.out.println(a>b);
        System.out.println(a<b);
        Sc.close();
    }
}
logical
import java.util.Scanner;
public class Main {
    public static void main(String []args){
        Scanner Sc=new Scanner(System.in);
        int a= Sc.nextInt();
        int b= Sc.nextInt();
        System.out.println(a>0 && a%2==0);
        System.out.println(a>=0 || a%5!=0 );
        System.out.println(!(a>10));
        Sc.close();
    }
}assignment
import java.util.Scanner;
public class Main {
    public static void main(String []args){
        Scanner Sc=new Scanner(System.in);
        int a= Sc.nextInt();
        int b= Sc.nextInt();
        System.out.printf("%d %d",a,b);
    }
}arithemathic
import java.util.Scanner;
public class Main {
    public static void main(String []args){
        Scanner Sc=new Scanner(System.in);
        int a= Sc.nextInt();
        int b= Sc.nextInt();
        System.out.println(a+b);
        System.out.println(a-b);
        Sc.close();
    }
}
import java.util.Scanner;
public class Main {                                     
    public static void main(String []args){                           
        Scanner Sc=new Scanner(System.in);
        int a= Sc.nextInt();
        int b= Sc.nextInt();--------------need to do.
        //System.out.println(a^b);
        //System.out.println(a&b);
       // System.out.println(a!=b);
       System.out.println(~a);
    }
}
import java.util.Scanner;
public class Main {                                     
    public static void main(String []args){                           
        Scanner Sc=new Scanner(System.in);
        int a= Sc.nextInt();
        System.out.println(a<<2);

    }
}in and de
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner Sc=new Scanner(System.in);
        int a=Sc.nextInt();
        System.out.print(a++ + a++ + a+5 + a-- - a++);

    }
}conditional 
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner Sc=new Scanner(System.in);
        int a=Sc.nextInt();
        int b= Sc.nextInt();
         System.out.print((a>b)?"positive":"negative");
    }
}
if con
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner Sc=new Scanner(System.in);
        int a=Sc.nextInt();
        if(a>0)
         System.out.print("positive");
    }
}
if else
import java.util.Scanner;
public class M{
    public static void main(String[]args){
        Scanner Sc=new Scanner(System.in);
        int a= Sc.nextInt ();
        if(a>0){
         System.out.println("positive");
        }
        else{
        
            System.out.println("negative");
        }
    }
}
import java.util.Scanner;
public class M{
    public static void main(String[]args){
        Scanner Sc=new Scanner(System.in);
        int a= Sc.nextInt ();
        if((a&1)==0){
         System.out.println("even");
        }
        else{
           System.out.println("odd");
        }
    }
}
import java.util.Scanner;
public class M{
    public static void main(String[]args){
        Scanner Sc=new Scanner(System.in);
        int a= Sc.nextInt ();
        int b= Sc.nextInt ();
        int c= Sc.nextInt ();

        if((a>b&& a>c)){
         System.out.println(a);
        }
        else if(b>c){
           System.out.println(b);
        }
        else{
           System.out.println(c);
    }
}
}
IF ELSE IF
import java.util.Scanner;
public class M{
    public static void main(String[]args){
        Scanner Sc=new Scanner(System.in);
        int a= Sc.nextInt ();
        

        if(a%2==0){
            if(a%3==0)
         System.out.println("Even and 3 multiple");
        
        else 
           System.out.println("Even not 3 multiple");
    }
         else {
           System.out.println("odd number");
}
    }
}
    if LADDER
import java.util.Scanner;
public class M{
    public static void main(String[]args){
        Scanner Sc=new Scanner(System.in);
        int day= Sc.nextInt ();
        if(day==1)System.out.println("Monday");
        else if(day==2)System.out.println("Tuesday");
        else if(day==3)System.out.println("wednesday");
        else if(day==4)System.out.println("Thursday");
        else if(day==5)System.out.println("friday");
        else if(day==6)System.out.println("saturday");
        else if(day==7)System.out.println("sunday");
        else System.out.println("No day");
    }
}
    switch
import java.util.Scanner;
public class M{
    public static void main(String[]args){
        Scanner Sc=new Scanner(System.in);
        int day= Sc.nextInt ();
    switch(day){
        case 1:System.out.println("monday");break;
        case 2:System.out.println("tuesday");break;     
        case 3:System.out.println("wednesday");break;
        case 4:System.out.println("thursday");break;
        case 5:System.out.println("friday");break;        
        case 6:System.out.println("saturday");break;
        case 7:System.out.println("sunday");break;
        default:System.out.println("no day");
    }
    }
}*/












