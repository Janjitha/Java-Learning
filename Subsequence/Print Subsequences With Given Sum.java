import java.util.*;

public class Main {

    static void printS(int index, List<Integer> ds, int s, int sum, int[] arr, int n) {

        // Base condition
        if (index == n) {
            if (s == sum) {
                for (int num : ds) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
            return;
        }

        // PICK the element
        ds.add(arr[index]);
        s += arr[index];

        printS(index + 1, ds, s, sum, arr, n);

        // BACKTRACK
        s -= arr[index];
        ds.remove(ds.size() - 1);

        // NOT PICK the element
        printS(index + 1, ds, s, sum, arr, n);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 1};
        int n = arr.length;
        int sum = 2;

        List<Integer> ds = new ArrayList<>();

        printS(0, ds, 0, sum, arr, n);
    }
}

OUTPUT:
1 1 
2 
