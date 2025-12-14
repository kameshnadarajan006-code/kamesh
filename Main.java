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
*/
import java.util.Scanner;
public class tec{
    public static void main(String[]args){
        Scanner Sc=new Scanner(System.in);
        int a=Sc.nextInt();
        if(a>0)
         System.out.print("positive");
    }
}



