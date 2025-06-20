QUESTION :

Write a Java program to update an array element by the given element.

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
	  // sandal is changed or updated to black
	  String upd = l.set(2,"Black");
	  System.out.println("Updated : " +l);
	}
}

OUTPUT :

The l contains : [Black, White, Sandal, Red, Blue, Pink, Gray]
Updated : [Black, White, Black, Red, Blue, Pink, Gray]
