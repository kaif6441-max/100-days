import java.util.Scanner;

class Solution {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        int prev2 = 1;
        int prev1 = 2;

        for (int i = 3; i <= n; i++) {
            int current = prev1 + prev2;

            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }
}

public class ClimbingStairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of stairs: ");
        int n = scanner.nextInt();

        Solution solution = new Solution();
        int result = solution.climbStairs(n);

        System.out.println("Number of ways: " + result);

        scanner.close();
    }
}