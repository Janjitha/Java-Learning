import java.util.Scanner;
public class DecimalToBinary 
{
    public static void main(String[] args) 
    {
        int n;
        String x = "";
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Decimal Number: ");
        n = s.nextInt(); 
        if (n == 0) { // Special case for 0
            System.out.println("0");
            return;
        }
        while(n > 0)
        {
            int a = n % 2;
            x = a + x; // Prepend binary digit
            n = n / 2;
        }
        System.out.println("Binary: " + x);
    }
}

Input:
Enter the Decimal Number: 10

Processing Steps:
10 % 2 = 0, x = "0"
5 % 2 = 1, x = "10"
2 % 2 = 0, x = "010"
1 % 2 = 1, x = "1010"

Output:
Binary: 1010

======================================================

public class Main
{
	public static void main(String[] args) {
	    int n=8;
	    String s = "";
	    while(n>0){
	        int r = n%2;
	        s=r+s;
	        n=n/2;
	    }
		System.out.println(s);
	}
}
