public class Main {

    static int printS(int index, int s, int target, int[] arr) {

        // Pruning: works only if array has POSITIVE numbers
        if (s > target) return 0;

        // Base case
        if (index == arr.length) {
            if (s == target) return 1;
            else return 0;
        }

        // PICK
        s += arr[index];
        int left = printS(index + 1, s, target, arr);

        // BACKTRACK
        s -= arr[index];

        // NOT PICK
        int right = printS(index + 1, s, target, arr);

        return left + right;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 1};
        int target = 2;

        int count = printS(0, 0, target, arr);
        System.out.println(count);
    }
}

Output
2

(Subsequences: {1,1} and {2})
