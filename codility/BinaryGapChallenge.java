// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {

    public static void main(String[] args) {
        System.out.println(solution(9));
        System.out.println(solution(1041));    
    }

    public static int solution(int N) {
        // Convert N to binary string
        String binaryString = Integer.toBinaryString(N);
        
        int maxGap = 0;  // To store the length of the longest binary gap
        int currentGap = 0;  // To store the length of the current binary gap
        boolean inGap = false;  // Flag to indicate if we are inside a binary gap

        // Traverse the binary string
        for (char c : binaryString.toCharArray()) {
            if (c == '1') {
                // If we encounter a '1' and we are in a gap, check and update maxGap
                if (inGap) {
                    maxGap = Math.max(maxGap, currentGap);
                    currentGap = 0;  // Reset current gap length
                }
                // Start a new gap
                inGap = true;
            } else if (inGap) {
                // If we are in a gap and encounter a '0', increment the current gap length
                currentGap++;
            }
        }
        
        return maxGap;
    }


}