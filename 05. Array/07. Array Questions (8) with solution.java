1. Given an array and two positions, do swap those elements at those two positions. If the position mention exceeds index limit, then print "Invalid".

CODE:

import java.util.*;
public class Swap_Array_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int n =sc.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter the elements : ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		//int arr[]= {1,2,3,4,5};
		System.out.print("Enter Position 1 & Position 2 : ");
		int p1=sc.nextInt();
		int p2=sc.nextInt();
		
		if(p1<arr.length && p2<arr.length&& p1>=0 && p2>=0) {
		arr[p1]=arr[p1]+arr[p2];
		arr[p2]=arr[p1]-arr[p2];
		arr[p1]=arr[p1]-arr[p2];
		System.out.print("Swapped Elements : ");
		for(int i:arr) {
		System.out.print(i+" ");
		}
		}
		else {
			System.out.println("Invalid");
		}
	  }
	}

INPUT:
Enter the size of the array : 5
Enter the elements : 1 2 3 4 5
Enter Position 1 & Position 2 : 0 2

OUTPUT:
Swapped Elements : 3 2 1 4 5 

==================================================================================================================================================================
  
  2.Write a program to complete the function replace_ele() , which receives number of elements and array ,  do replace every element in   
the array with the sum of  every other element and return the same array. Note:Dont use extra arrays

CODE:

import java.util.*;
public class Replace_element_return_sum_02 {
	    public static void replaceEle(int n, int[] arr) {
	        int totalSum = 0;
	        for (int i = 0; i < n; i++) {
	            totalSum += arr[i];
	        }
	        for (int i = 0; i < n; i++) {
	            arr[i] = totalSum - arr[i];
	        }
	        for (int i = 0; i < n; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        int[] arr = new int[n];
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }
	        replaceEle(n, arr);	        
	    }
	}

INPUT:
5
1 2 3 4 5

OUTPUT:
14 13 12 11 10 

=======================================================================================================================================================================

  3. Write a program to complete the function sum_of_right_side_ele(), which receives number of elements and array ,  
do replace every element in the array with the sum of  its right side elements and return the same array. Note:Dont use extra arrays

CODE:

import java.util.*;
public class sum_of_rightside_element_03 {
			public static void sum_of_right_side_ele(int n, int[] arr) {
		        int totalSum = 0;

		        for (int i = n - 1; i >= 0; i--) {
		            int temp = arr[i];
		            arr[i] = totalSum;
		            totalSum += temp;
		        }
		        for (int i = 0; i < n; i++) {
		            System.out.print(arr[i] + " ");
		        }
		    }
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        int n = scanner.nextInt();
		        int[] arr = new int[n];

		        for (int i = 0; i < n; i++) {
		            arr[i] = scanner.nextInt();
		        }
		        sum_of_right_side_ele(n, arr);		        
		    }
		}


INPUT:
5
1 2 3 4 5

OUTPUT:
14 12 9 5 0 

==============================================================================================================================================================================

  4. Write a program to complete the function sum_of_left_side_ele(), which receives number of elements and array ,  do replace every       
element in the array with the sum of  its left side elements and return the same array. Note:Dont use extra arrays

CODE:

import java.util.Scanner;
public class sum_of_leftside_element_04 {
	    public static void sum_of_left_side_ele(int n, int[] arr) {
	        int totalSum = 0;
	        for (int i = 0; i < n; i++) {
	            int temp = arr[i];
	            arr[i] = totalSum;
	            totalSum += temp;
	        }
	    }
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        int[] arr = new int[n];
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }
	        sum_of_left_side_ele(n, arr);
	        for (int i = 0; i < n; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }
	}

INPUT:
5
1 2 3 4 5

OUTPUT:
0 1 3 6 10 

============================================================================================================================================================================

  5.Given the size of array and array values to function Array_multiplication() , do complete the function by replacing every 
element by the product of previous and next element for all index.

CODE:

import java.util.*;
public class replace_elements_with_multiplication_05 {	
	static void modify(int arr[], int n)
		{			
			if (n <= 1)
				return;			
			int prev = arr[0];
			arr[0] = arr[0] * arr[1];		
			for (int i=1; i<n-1; i++)
			{				
				int curr = arr[i];				
				arr[i] = prev * arr[i+1];				
				prev = curr;
			}			
			arr[n-1] = prev * arr[n-1];
		}		
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the size of the array: ");
			int n = sc.nextInt();
			int arr[] = new int[n];
			System.out.println("Enter " + n + " elements:");
			for(int i = 0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			modify(arr, n);
			for (int i=0; i<n; i++)
			System.out.print(arr[i]+" ");
		}
	}

INPUT:
Enter the size of the array: 5
Enter 5 elements:
1 2 3 4 5

OUTPUT:
2 3 8 15 20

================================================================================================================================================================================

    6.Given the size of array and array values to function arr_reverse(), write a code to reverse the given array.

CODE:

import java.util.Scanner;
public class reverse_array_06 {
	    public static void arr_reverse(int n, int[] arr) {
	        int start = 0;
	        int end = n - 1;
	        while (start < end) {
	            int temp = arr[start];
	            arr[start] = arr[end];
	            arr[end] = temp;
	            start++;
	            end--;
	        }
	    }
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of elements: ");
	        int n = scanner.nextInt();
	        int[] arr = new int[n];
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }
	        arr_reverse(n, arr);
	        System.out.print("Reversed array: ");
	        for (int i = 0; i < n; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }
	}


INPUT:
Enter the number of elements: 5
Enter the elements of the array:
1 2 3 4 5

OUTPUT:
Reversed array: 5 4 3 2 1 

================================================================================================================================================================================

     7. Complete the function insert_element()  to insert the given element at given position and display the updated array. 

CODE:-
import java.util.Scanner;
public class insert_element_07 {	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);	        
	        System.out.print("Enter the size of the array: ");
	        int size = sc.nextInt();
	        int[] arr = new int[size + 1]; 	        
	        System.out.println("Enter " + size + " elements:");
	        for (int i = 0; i < size; i++) {
	            arr[i] = sc.nextInt();
	        }	        
	        System.out.print("Enter the element to insert: ");
	        int element = sc.nextInt();
	        System.out.print("Enter the position to insert (0-based index): ");
	        int position = sc.nextInt();	        
	        if (position < 0 || position > size) {
	            System.out.println("Insertion not possible");
	        } else {	          
	            for (int i = size; i > position; i--) {
	                arr[i] = arr[i - 1];
	            }
	            arr[position] = element; 	     
	            System.out.print("Updated Array: ");
	            for (int i = 0; i <= size; i++) {
	                System.out.print(arr[i] + " ");
	            }
	        }	       
	    }
	}


INPUT:
Enter the size of the array: 5
Enter 5 elements:
1 2 3 4 5
Enter the element to insert: 50 
Enter the position to insert (0-based index): 3

OUTPUT:
Updated Array: 1 2 3 50 4 5 

==================================================================================================================================================================

    8.Complete the function delete_element(), which deletes the element at the given position or print "deletion not possible" if given  
position is out of Bound.

CODE:-
import java.util.Scanner;
public class delete_element_08 {
	public static void main(String[] args) {	
	        Scanner sc = new Scanner(System.in);	        
	        System.out.print("Enter the size of the array: ");
	        int size = sc.nextInt();
	        int[] arr = new int[size];
	        System.out.println("Enter " + size + " elements:");
	        for (int i = 0; i < size; i++) {
	            arr[i] = sc.nextInt();
	        }	        
	        System.out.print("Enter the position to delete (0-based index): ");
	        int position = sc.nextInt();	        
	        if (position < 0 || position >= size) {
	            System.out.println("deletion not possible");
	        } else {	           
	            for (int i = position; i < size - 1; i++) {
	                arr[i] = arr[i + 1];
	            }	          	            
	            System.out.print("Updated Array: ");
	            for (int i = 0; i < size - 1; i++) {
	                System.out.print(arr[i] + " ");
	            }
	        }	       
	    }
	}

INPUT:
Enter the size of the array: 5
Enter 5 elements:1 2 3 4 5
Enter the position to delete (0-based index): 2

OUTPUT:
Updated Array: 1 2 4 5 
