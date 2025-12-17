/*import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int a= sc.nextInt();
        int fact=1;
        for(int i=1;i<=a;i++){
            fact=fact*i;
        }
        System.out.println("factorial :"+fact);

    }
}
import java.util.Scanner;
class Main{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt(),count=0;
  while(n>0){
   count++;
   n/=10;
  }
  System.out.println(count);
 }
}
 import java.util.Scanner;
class Main{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt(),prod=1;
  while(n>0){
   prod*=n%10;
   n/=10;
  }
  System.out.println(prod);
 }
}
import java.util.Scanner;
class Main{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt(),rev=0;
  while(n>0){
   rev=rev*10+n%10;
   n/=10;
  }
  System.out.println(rev);
 }
}
import java.util.Scanner;
class Main{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt(),t=n,rev=0;
  while(n>0){
   rev=rev*10+n%10;
   n/=10;
  }
  System.out.println(t==rev?"Palindrome":"Not Palindrome");
 }
}
import java.util.Scanner;
class Main{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt(),t=n,sum=0;
  while(n>0){
   int d=n%10;
   sum+=d*d*d;
   n/=10;
  }
  System.out.println(sum==t?"Armstrong":"Not Armstrong");
 }
}
import java.util.Scanner;
class Main{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt(),b=sc.nextInt(),lcm;
  lcm=(a>b)?a:b;
  while(true){
   if(lcm%a==0 && lcm%b==0) break;
   lcm++;
  }
  System.out.println(lcm);
 }
}
import java.util.Scanner;
class Main{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt(),b=sc.nextInt();
  while(b!=0){
   int t=b;
   b=a%b;
   a=t;
  }
  System.out.println(a);
 }
}
import java.util.Scanner;
class Main{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt(),c=0;
  for(int i=1;i<=n;i++)
   if(n%i==0) c++;
  System.out.println(c==2?"Prime":"Not Prime");
 }
}
import java.util.Scanner;
class Main{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  for(int i=1;i<=n;i++)
   if(n%i==0) System.out.print(i+" ");
 }
}
import java.util.Scanner;
class Main{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt(),sum=0;
  for(int i=1;i<=n;i++)
   if(n%i==0) sum+=i;
  System.out.println(sum);
 }
}
import java.util.Scanner;
class Main{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt(),sum=0;
  for(int i=1;i<=n;i++)
   if(n%i==0) sum+=i;
  System.out.println(sum);
 }
}
import java.util.Scanner;
class Main{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int r=(int)Math.sqrt(n);
  System.out.println(r*r==n?"Perfect Square":"Not Perfect Square");
 }
}
import java.util.Scanner;
class Main{
 static int fact(int n){
  int f=1;
  for(int i=1;i<=n;i++) f*=i;
  return f;
 }
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt(),t=n,sum=0;
  while(n>0){
   sum+=fact(n%10);
   n/=10;
  }
  System.out.println(sum==t?"Strong":"Not Strong");
 }
}
import java.util.Scanner;
class Main{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt(),sum=0;
  for(int i=1;i<n;i++)
   if(n%i==0) sum+=i;
  System.out.println(sum==n?"Perfect":"Not Perfect");
 }
}
import java.util.Scanner;
class Main{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt(),sq=n*n,sum=0;
  while(sq>0){
   sum+=sq%10;
   sq/=10;
  }
  System.out.println(sum==n?"Neon":"Not Neon");
 }
}
import java.util.Scanner;
class Main{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt(),t=n,sum=0;
  while(n>0){
   sum+=n%10;
   n/=10;
  }
  System.out.println(t%sum==0?"Harshad":"Not Harshad");
 }
}
import java.util.Scanner;
class Main{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  System.out.println(n%7==0||n%10==7?"Buzz":"Not Buzz");
 }
}
import java.util.Scanner;
class Main{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt(),sq=n*n;
  System.out.println(String.valueOf(sq).endsWith(String.valueOf(n))?
  "Automorphic":"Not Automorphic");
 }
}
import java.util.Scanner;
class Main{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  while(n>9){
   int sum=0;
   while(n>0){
    sum+=n%10;
    n/=10;
   }
   n=sum;
  }
  System.out.println(n==1?"Magic":"Not Magic");
 }
}
import java.util.Scanner;
class Main{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  while(n%3==0) n/=3;
  System.out.println(n==1?"Yes":"No");
 }
}
import java.util.Scanner;
class Main{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt(),b=sc.nextInt(),res=0;
  for(int i=1;i<=b;i++) res+=a;
  System.out.println(res);
 }
}
import java.util.Scanner;
class Main{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int m=sc.nextInt(),n=sc.nextInt(),res=1;
  for(int i=1;i<=n;i++) res*=m;
  System.out.println(res);
 }
}
*/
