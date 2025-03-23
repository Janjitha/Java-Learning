public class Main
{
	public static void main(String[] args) {
	    int n=10;
	    int a[] = new int[n+1];
	    int c =0;
	    int s=0;
	    for(int i=2;i<=n;i++){
	        boolean prime = true;
	        for(int j=2;j*j<=i;j++){
	            if(i%j==0){
	                prime = false;
	            }
	        }
	        if(prime){
	            a[s]=i;
	            s++;
	        }
	    }
	    for(int i=0;i<a.length;i++){
	        if(a[i]!=0){
	            System.out.print(a[i] + " ");
	        }
	    }
	}
}

OUTPUT:
2 3 5 7
