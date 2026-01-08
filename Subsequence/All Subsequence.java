import java.util.*;
public class Main {
    // Recursive function to print subsequences
    static void printF(int index, List<Integer> ds, int[] arr, int n) {
        // Base condition
        if (index == n) {
            if (ds.size() == 0) {
                System.out.print("{}");
            } else {
                for (int num : ds) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
            return;
        }
        // NOT PICK the element
        printF(index + 1, ds, arr, n);
        // PICK the element
        ds.add(arr[index]);
        printF(index + 1, ds, arr, n);
        // Backtrack
        ds.remove(ds.size() - 1);
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 2};
        int n = arr.length;
        List<Integer> ds = new ArrayList<>();
        printF(0, ds, arr, n);
    }
}
