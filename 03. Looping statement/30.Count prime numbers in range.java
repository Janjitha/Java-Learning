public class Main
{
	public static void main(String[] args) {
	    int n=10;
	    int c =0;
	    for(int i=2;i<=n;i++){
	        boolean prime = true;
	        for(int j=2;j*j<=i;j++){
	            if(i%j==0){
	                prime = false;
	            }
	        }
	        if(prime){
	            c++;
	        }
	    }
	    System.out.print(c);
	}
}

OUTPUT:
4
// 2 3 5 7
