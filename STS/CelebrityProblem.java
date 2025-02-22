import java.util.Stack;

public class CelebrityProblem {
    
    // Function to check if person a knows person b
    static boolean knows(int[][] matrix, int a, int b) {
        return matrix[a][b] == 1;
    }

    public static int findCelebrity(int[][] matrix, int n) {
        Stack<Integer> stack = new Stack<>();

        // Step 1: Push everyone onto the stack
        for (int i = 0; i < n; i++) {
            stack.push(i);
        }

        // Step 2: Find the potential celebrity
        while (stack.size() > 1) {
            int A = stack.pop();
            int B = stack.pop();

            if (knows(matrix, A, B)) {
                stack.push(B); // A knows B, so A is not a celebrity
            } else {
                stack.push(A); // A does not know B, so B is not a celebrity
            }
        }

        // Step 3: Verify the last remaining candidate
        int candidate = stack.pop();

        for (int i = 0; i < n; i++) {
            if (i != candidate) {
                // Celebrity should not know anyone, and everyone should know the celebrity
                if (knows(matrix, candidate, i) || !knows(matrix, i, candidate)) {
                    return -1; // No celebrity found
                }
            }
        }
        return candidate; // Candidate is a celebrity
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {0, 1, 1, 1},
            {0, 0, 0, 0},
            {0, 1, 0, 1},
            {0, 1, 1, 0}
        };
        int n = matrix.length;
        int celebrity = findCelebrity(matrix, n);
        
        if (celebrity == -1) {
            System.out.println("No Celebrity Found");
        } else {
            System.out.println("Celebrity is Person " + celebrity);
        }
    }
}
