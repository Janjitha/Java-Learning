QUESTION :
3. Write code of Greatest Common Divisor 
  
This problem asks to find the Greatest Common Divisor (GCD) of two given numbers. The GCD of two numbers is the largest positive integer that divides both numbers without leaving a remainder.
The Euclidean algorithm is a popular method for efficiently computing the GCD.
  
Example: Find GCD of 36 and 60:
The common divisors of 36 and 60 are 1, 2, 3, 4, 6, 9, 12, 18, 36 and 1, 2, 3, 4, 5, 6, 10, 12, 15, 20, 30, 60.
The largest common divisor is 12.

SOLUTION : 

public class Main {
    public static void main(String[] args) {
        int a = 36;  // First number
        int b = 60;  // Second number

        int x = a;   // Copy of a
        int y = b;   // Copy of b

        // Euclidean Algorithm to find GCD
        while (y != 0) {
            int temp = y;   // Store y temporarily
            y = x % y;      // Update y to remainder of x divided by y
            x = temp;       // Update x to old y
        }

        System.out.println("GCD of " + a + " and " + b + " is: " + x);
    }
}

OUTPUT :

GCD of 36 and 60 is: 12

//=========================================================================================================

SOLUTION (not efficient ) :

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int a = 36;
	    int b = 60;
	    ArrayList<Integer> l1 = new ArrayList<>();
	    ArrayList<Integer> l2 = new ArrayList<>();
	    for(int i=1;i<a;i++){
	        if(a%i==0){
	            l1.add(i);
	        }
	    }
	    for(int i=1;i<b;i++){
	        if(b%i==0){
	            l2.add(i);
	        }
	    }
	    int gcd=1;
	    for (int f : l1) {
            if (l2.contains(f)) {
                gcd = f; 
            }
        }
	    System.out.println(l1);
	    System.out.println(l2);
	    System.out.println(gcd);
	}
}

OUTPUT :

[1, 2, 3, 4, 6, 9, 12, 18]
[1, 2, 3, 4, 5, 6, 10, 12, 15, 20, 30]
12
