class Solution {
    public int[] countBits(int n) {
        int k[] = new int[n+1];
        for(int i=0;i<=n;i++){
            int num = i;
            int c =0;
            while(num>0){
                num=num&(num-1);
                c++;
            }   
            k[i]=c;
        }return k;
    }
}
--------------------------------------------
/*
class Solution {
    public int[] countBits(int n) {
        int a[] = new int[n + 1];   
        for (int i = 1; i <= n; i++) {
            a[i] = a[i / 2] + (i % 2); 
        }
        return a;
    }
}
*/
------------------------------------------------
/*
int[] a = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            a[i] = Integer.bitCount(i); 
        }
        return a;
    }
}
*/
---------------------------------------------
/*
int a[] = new int[n + 1];   
        for (int i = 0; i <= n; i++) { 
            String b = Integer.toBinaryString(i); 
            int count = 0;     
            for (int j = 0; j < b.length(); j++) { 
                if (b.charAt(j) == '1') { 
                    count++;
                }
            }
            a[i] = count; 
        }
        return a;
    }
}
*/
