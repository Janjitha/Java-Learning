import java.util.*;

public class Main {

    static boolean printS(int index, List<Integer> ds, int s, int target, int[] arr) {

        // Base case
        if (index == arr.length) {
            if (s == target) {
                for (int x : ds) {
                    System.out.print(x + " ");
                }
                System.out.println();
                return true;   // FOUND
            }
            return false;      // NOT FOUND
        }

        // PICK
        ds.add(arr[index]);
        s += arr[index];

        if (printS(index + 1, ds, s, target, arr)) {
            return true;       // STOP recursion
        }

        // BACKTRACK
        s -= arr[index];
        ds.remove(ds.size() - 1);

        // NOT PICK
        if (printS(index + 1, ds, s, target, arr)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 1};
        int target = 2;

        printS(0, new ArrayList<>(), 0, target, arr);
    }
}

OUTPUT
  1 1
