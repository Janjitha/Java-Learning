import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    String s = "javavvvba";
	    //output : a
	    HashMap<Character,Integer> h = new HashMap<>();
	    for(char c:s.toCharArray()){
	        h.put(c,h.getOrDefault(c,0)+1);
	    }
	    // Maximum frequency in the string
	    int max=0;
	    char r =' ';
	    for(char c:h.keySet()){
	        if(h.get(c)>max){
	            max=h.get(c);
	            r=c;
	        }
	    }
	    System.out.println(r);       
	    // output: v
//=======================================================
	    //Print Duplicate values
	    for(char c:h.keySet()){
	        if(h.get(c)>1){
	            System.out.println(c);
	            //output: a v
	        }
	    }
//=======================================================	    
	    //print the frequency which has value 1
	    for(char t:h.keySet()){
	        if(h.get(t)==1){
	            System.out.print(t+" ");
	            //output : b j 
	        }
	    }
	}
}
