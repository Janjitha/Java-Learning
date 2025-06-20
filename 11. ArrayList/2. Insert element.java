QUESTION :

Write a Java program to insert an element into the array list at the first or any position.

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
	  // To add black at 0th position
	  l.add(0,"Black");
	  // to add sandal at 2nd position
	  l.add(2,"Sandal");
	  // to add gray at the last position
	  l.add(l.size(),"Gray");
	  
	  //To convert from arraylist to array
	  String a[] = new String[l.size()];
	  for(int i=0;i<l.size();i++){
	    a[i]=l.get(i);
	    System.out.print(a[i]+" ");
	  }
	}
}

OUTPUT :

Black White Sandal Red Blue Pink Gray 
