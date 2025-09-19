
import java.util.*;

public class NextGreaterDay {
    public static int[] nextGreaterDays(int[] income) {
        int n = income.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);  // default -1 if no greater day exists

        Stack<Integer> stack = new Stack<>(); // store indices

        for (int i = 0; i < n; i++) {
            // while stack has elements and current income > income at stack top
            while (!stack.isEmpty() && income[i] > income[stack.peek()]) {
                int idx = stack.pop();
                result[idx] = i; // immediate next greater day index
            }
            stack.push(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] income_opportunity = {1,2,0,1,3,4,5,0,3,5,6,2,1,4,10,0};
        int[] result = nextGreaterDays(income_opportunity);

        // Print results
        for (int i = 0; i < result.length; i++) {
            System.out.println("Day " + i + " -> " + result[i]);
        }
    }
}
