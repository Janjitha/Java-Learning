QUESTION :

Write a Java program to extract a portion of an array list.
  
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
		//dont mention arraylist it shows error use only list
		List<String> l1 = l.subList(0,2);
		System.out.print(l1);
	}
}

OUTPUT :

Orginal : [White, Red, Blue, Pink]
[White, Red]
