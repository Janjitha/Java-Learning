QUESTION :

Write a Java program to remove the elements from an array list

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
		l.remove(2);
		System.out.println("Changed : " +l);
	}
}

OUTPUT :

Orginal : [White, Red, Blue, Pink]
Changed : [White, Red, Pink]
