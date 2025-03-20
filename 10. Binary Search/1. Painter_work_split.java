Problem:

Given 2 integers A & B and an array of integers C of size N. Elements C[I] represents the length of I th board.
You have to paint all N boards [C0, C1, C2, C3, ........, CN-1]. There are A painters available and each of them takes B unit of time to paint 1 unit of board.
Calculate and return the minimum time required to paint all the boards under the constraint that any painter will only pain continuous selection of board.
2 painters cannot share a board to paint. That is to say, a board cannot be painted partially by one painter, and partially by another.
A painter will only paint continuous boards. Which means configuration where painter 1 paints boards 1 and 3 but not 2 is invalid. 
In this scenario similar to the book allocation question, the allocation is made in a continuous manner and hence we can use the binary search.

SAMPLE INPUT:
C[] = [10,20,30,40]

SAMPLE OUTPUT:
60

CODE:

public class binary_search_painter {
	public static boolean isPoss(int[] c,int a,int mid) {
		int n=c.length;
		int sum=0;
		int painter=1;
		for(int i=0;i<n;i++) {
			sum+=c[i];
			if(sum<=mid) {
				continue;
			}else {
				painter++;
				if(painter>a) {
					return false;
				}
				sum = c[i];
			}
		}
		return true;
	}
	public static int time(int c[],int a,int b)  {
		int n=c.length;
		int res=0;
		int l=0, h=0;
		for(int i=0;i<n;i++) {
			h+=c[i];
		}
		int ans=0;
		while(l<=h) {
			int mid = (l+h)/2;
			if(isPoss(c,a,mid)==true) {
				res=mid;
				h=mid-1;
			}else {
				l=mid+1;
			}
		}
		return (res*b);
	}
	

	public static void main(String[] args) {
		 int a = 2; // No of painters
	        int b = 1; // Time per unit length
	        int[] c = {10, 20, 30, 40}; // Board lengths
	        System.out.println(time(c,a,b));
	}
}

/*
package practise_java;
public class binary_search_painter {
	public static void main(String[] args) {
		        int a = 2; // No of painters
		        int b = 1; // Time per unit length
		        int[] c = {10, 20, 30, 40}; // Board lengths
		        int n = c.length;
		        if (n == 0) {
		            System.out.println("Minimum time required: 0");
		            return;
		        }
		        int maxBoardLength = 0, sumOfBoards = 0;
		        for (int length : c) {
		            maxBoardLength = Math.max(maxBoardLength, length);
		            sumOfBoards += length;
		        }
		        int low = maxBoardLength, high = sumOfBoards, result = high;
		        while (low <= high) {
		            int mid = low + (high - low) / 2;
		            int paintersRequired = 1, currentTime = 0;
		            boolean possible = true;
		            for (int length : c) {
		                if (length > mid) {
		                    possible = false;
		                    break;
		                }		                
		                if (currentTime + length > mid) {
		                    paintersRequired++;
		                    currentTime = length;
		                    if (paintersRequired > a) {
		                        possible = false;
		                        break;
		                    }
		                } else {
		                    currentTime += length;
		                }
		            }		            
		            if (possible) {
		                result = mid;
		                high = mid - 1;
		            } else {
		                low = mid + 1;
		            }
		        }		        
		        System.out.println("Minimum time required: " + result);
		    }
		}
*/





