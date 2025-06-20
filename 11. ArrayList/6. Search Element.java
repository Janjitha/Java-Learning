QUESTION :

Write a Java program to search for an element in an array list.

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
		if(l.contains("Red")){
		  System.out.println("Red is inside the l");
		}
		else{
		  System.out.println("Not present");
		}
	}
}

OUTPUT :

Orginal : [White, Red, Blue, Pink]
Red is inside the l
