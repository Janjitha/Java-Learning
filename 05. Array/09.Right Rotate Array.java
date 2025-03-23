public class Main {
    public static void main(String[] args) {
        int arr[] = {10, 80, 30, 40, 50, 60, 70};
        int n = arr.length;
        int d = 2;

        for (int i = 0; i < d; i++) {
            int temp = arr[n - 1]; 
            for (int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

OUTPUT:
60 70 10 80 30 40 50 
