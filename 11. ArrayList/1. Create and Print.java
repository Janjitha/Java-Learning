QUESTION :

Write a Java program to create an array list, add some colors (strings) and print out the collection.

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
		System.out.print(l);
	}
}

OUTPUT :

[White, Red, Blue, Pink]

-----------------------------------------------------------------------------------------------------

QUESTION :
  
Convert from ArrayList to Array

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
	  //	System.out.print(l);
	  // To convert from ArrayList to Array
	  String a[] = new String[l.size()]; 
    // In arraylist to find the length of the array use l.size()
	  for(int i=0;i<l.size();i++){
	    a[i]=l.get(i);
	    System.out.print(a[i]+" ");
	  }
	}
}

OUTPUT :

White Red Blue Pink 
