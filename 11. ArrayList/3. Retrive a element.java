QUESTION :

Write a Java program to retrieve an element (at a specified index) from a given array list.

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
	  l.add(0,"Black");
	  l.add(2,"Sandal");
	  l.add(l.size(),"Gray");
	  System.out.println("The l contains : " +l);
	  String first = l.get(0);
	  String second = l.get(2);
	  String last = l.get(l.size()-1);
	  System.out.println("First : " +first);
	  System.out.println("Second : " +second);
	  System.out.println("Last : " +last);
	}
}

OUTPUT :

The l contains : [Black, White, Sandal, Red, Blue, Pink, Gray]
First : Black
Second : Sandal
Last : Gray
