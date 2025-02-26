import java.util.Stack;

public class StockSpan {
    public static void calculateSpan(int prices[], int n, int span[]) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);  // Push first element index
        span[0] = 1;    // Span of first day is always 1

        for (int i = 1; i < n; i++) {
            // Pop elements from stack while stack is not empty and top is smaller than current price
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }
            
            // If stack becomes empty, all previous prices were smaller
            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());

            // Push this element index to stack
            stack.push(i);
        }
    }

    public static void main(String[] args) {
        int prices[] = {100, 80, 60, 70, 60, 75, 85}; 
        int n = prices.length;
        int span[] = new int[n];

        calculateSpan(prices, n, span);

        // Print the span values
        for (int i = 0; i < n; i++) {
            System.out.print(span[i] + " ");
        }
    }
}
