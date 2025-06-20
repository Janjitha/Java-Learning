QUESTION :

1. Write a Java program to sort a given array list.
2. Write a Java program to copy one array list into another.
3. Write a Java program to shuffle elements in an array list.
4. Write a Java program to reverse elements in an array list.
5. Write a Java program that swaps two elements in an array list.

PROGRAM :

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<>();
		l.add("White");
		l.add("Red");
		l.add("Blue");
		l.add("Pink");
		System.out.println("Orginal : " +l);
		Collections.sort(l);
		System.out.println("Sorted String : "+l);
		// it shuffles randomly
		Collections.shuffle(l);
		System.out.println("Shuffled String : " +l);
		// to reverse the array with string or int
		Collections.reverse(l);
		System.out.println("Reverse String : "+l);
		// to swap the elements swap white and pink
		Collections.swap(l,0,2);
		System.out.println("Swaped String : "+l);
		// to remove every element
		l.removeAll(l);
		System.out.println("After removal : " +l);
	}
}

OUTPUT :

Orginal : [White, Red, Blue, Pink]
Sorted String : [Blue, Pink, Red, White]
Shuffled String : [Blue, Pink, White, Red]
Reverse String : [Red, White, Pink, Blue]
Swaped String : [Pink, Red, White, Blue]
After removal : []
