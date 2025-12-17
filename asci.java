/* 
public class Asci {
    public static void main(String[] args) {
        for(char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");
        }
    }
}



public class Asci {
    public static void main(String[] args) {
        for(char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch + " ");
        }
    }
}

public class Asci {
    public static void main(String[] args) {
        for(char ch = 'z'; ch >= 'a'; ch--) {
            System.out.print(ch + " ");
        }
    }
}


import java.util.Scanner;
public class Asci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char start = sc.next().charAt(0);
        char end = sc.next().charAt(0);
        for(char ch = (char)(start + 1); ch < end; ch++) {
            System.out.print(ch + " ");
        }
    }
}
```


public class Asci {
    public static void main(String[] args) {
        System.out.print("Vowels: ");
        for(char ch='a'; ch<='z'; ch++){
            if("aeiou".indexOf(ch) != -1)
                System.out.print(ch + " ");
        }
        System.out.print("\nConsonants: ");
        for(char ch='a'; ch<='z'; ch++){
            if("aeiou".indexOf(ch) == -1)
                System.out.print(ch + " ");
        }
    }
}

public class Asci{
    public static void main(String[] args) {
        for(char ch='A'; ch<='Z'; ch++){
            System.out.println(ch + " = " + (int)ch);
        }
    }
}



import java.util.Scanner;
public class Asci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bin = sc.next();
        int ones=0, zeros=0;
        for(char c: bin.toCharArray()){
            if(c=='1') ones++;
            else if(c=='0') zeros++;
        }
        System.out.println("1s: " + ones);
        System.out.println("0s: " + zeros);
    }
}


import java.util.Scanner;
public class Asci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Integer.toBinaryString(n));
    }
}


import java.util.Scanner;
public class Asci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bin = sc.next();
        int dec = Integer.parseInt(bin, 2);
        System.out.println(dec);
    }
}

import java.util.Scanner;
public class Asci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        char lower = (char)(ch + 32);
        System.out.println(lower);
    }
}

import java.util.Scanner;
public class Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n >= 10) n /= 10;
        System.out.println(n);
    }
}

import java.util.Scanner;
public class Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n >= 10) n /= 10;
        System.out.println(n % 2 == 0 ? "Even" : "Odd");
    }
}

import java.util.Scanner;
public class Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        boolean found = false;
        while(n > 0){
            if(n % 10 == d){ found = true; break; }
            n /= 10;
        }
        System.out.println(found);
    }
}

import java.util.Scanner;
public class Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int count = 0;
        while(n > 0){
            if(n % 10 == d) count++;
            n /= 10;
        }
        System.out.println(count);
    }
}

import java.util.Scanner;
public class Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean asc = true;
        int prev = 10;
        while(n > 0){
            int d = n % 10;
            if(d > prev){ asc = false; break; }
            prev = d;
            n /= 10;
        }
        System.out.println(asc);
    }
}


import java.util.Scanner;
public class Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean desc = true;
        int prev = -1;
        while(n > 0){
            int d = n % 10;
            if(d < prev){ desc = false; break; }
            prev = d;
            n /= 10;
        }
        System.out.println(desc);
    }
}

import java.util.Scanner;
public class Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int last = n % 10;
        int temp = n, pow = 1;
        while(temp >= 10){ temp /= 10; pow *= 10; }
        int first = temp;
        int middle = (n % pow) / 10;
        int result = last * pow + middle * 10 + first;
        System.out.println(result);
    }
}

import java.util.Scanner;
public class Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] freq = new int[10];
        while(n > 0){ freq[n % 10]++; n /= 10; }
        for(int i=0;i<10;i++)
            if(freq[i] > 0)
                System.out.println(i + " : " + freq[i]);
    }
}



public class Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        while(n > 0){
            int d = n % 10;
            if(d > max) max = d;
            n /= 10;
        }
        System.out.println(max);
    }
}

import java.util.Scanner;
public class Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = 9;
        while(n > 0){
            int d = n % 10;
            if(d < min) min = d;
            n /= 10;
        }
        System.out.println(min);
    }
}
import java.util.Scanner;
public class Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean even=false, odd=false;
        while(n > 0){
            if((n % 10) % 2 == 0) even=true; else odd=true;
            n /= 10;
        }
        if(even && odd) System.out.println("Mixed");
        else if(even) System.out.println("All Even");
        else System.out.println("All Odd");
    }
}

import java.util.Scanner;
public class Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int evenSum=0, oddSum=0;
        while(n > 0){
            int d = n % 10;
            if(d % 2 == 0) evenSum += d; else oddSum += d;
            n /= 10;
        }
        System.out.println(evenSum - oddSum);
    }
}


import java.util.Scanner;
public class Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0, place = 1;
        while(n > 0){
            int d = n % 10;
            if(d != 0){ result += d * place; place *= 10; }
            n /= 10;
        }
        System.out.println(result);
    }
}

import java.util.Scanner;
public class Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sqSum=0, cubeSum=0;
        while(n > 0){
            int d = n % 10;
            sqSum += d*d;
            cubeSum += d*d*d;
            n /= 10;
        }
        System.out.println("Squares Sum: " + sqSum);
        System.out.println("Cubes Sum: " + cubeSum);
    }
}

import java.util.Scanner;
public class Digit {
    static String word(int d){
        String[] w = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        return w[d];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        for(char c : n.toCharArray()){
            System.out.print(word(c - '0') + " ");
        }
    }
}
*/