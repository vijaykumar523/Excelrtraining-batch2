public class LEETCODE003 {

    // Function to convert string to integer
    public int myAtoi(String s) {
        if (s == null || s.length() == 0) return 0;  // Edge case for empty string or null
        
        int index = 0;
        int n = s.length();
        
        // Step 1: Ignore leading whitespaces
        while (index < n && s.charAt(index) == ' ') {
            index++;
        }
        
        // Step 2: Determine the sign
        int sign = 1;
        if (index < n && s.charAt(index) == '-') {
            sign = -1;  // Negative number
            index++;
        } else if (index < n && s.charAt(index) == '+') {
            index++;  // Positive number (default)
        }
        
        // Step 3: Read digits and build the result
        int result = 0;
        while (index < n && Character.isDigit(s.charAt(index))) {
            int digit = s.charAt(index) - '0';  // Convert char to digit
            
            // Step 4: Check for overflow before updating the result
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            
            result = result * 10 + digit;  // Build the number
            index++;
        }
        
        // Step 5: Apply the sign to the result
        result *= sign;
        
        return result;
    }

    // Main method to test the myAtoi function
    public static void main(String[] args) {
        LEETCODE003 solution = new LEETCODE003();

        // Test cases
        System.out.println(solution.myAtoi("42"));            // Output: 42
        System.out.println(solution.myAtoi("   -042"));       // Output: -42
        System.out.println(solution.myAtoi("1337c0d3"));      // Output: 1337
        System.out.println(solution.myAtoi("0-1"));           // Output: 0
        System.out.println(solution.myAtoi("words and 987")); // Output: 0
        System.out.println(solution.myAtoi("21474836460"));   // Output: 2147483647 (overflow case)
        System.out.println(solution.myAtoi("-2147483649"));   // Output: -2147483648 (overflow case)
    }
}
