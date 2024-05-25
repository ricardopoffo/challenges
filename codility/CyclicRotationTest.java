import java.util.Arrays;

public class CyclicRotationTest {
    public static void main(String[] args) {
        CyclicRotation solution = new CyclicRotation();

        // Test case 1: Rotate by 3
        int[] A1 = {3, 8, 9, 7, 6};
        int K1 = 3;
        int[] expected1 = {9, 7, 6, 3, 8};
        int[] result1 = solution.solution(A1, K1);
        System.out.println(Arrays.equals(result1, expected1)); // Expected output: true

        // Test case 2: Rotate by 0
        int[] A2 = {1, 2, 3, 4, 5};
        int K2 = 0;
        int[] expected2 = {1, 2, 3, 4, 5};
        int[] result2 = solution.solution(A2, K2);
        System.out.println(Arrays.equals(result2, expected2)); // Expected output: true

        // Test case 3: Rotate by array length
        int[] A3 = {1, 2, 3, 4, 5};
        int K3 = 5;
        int[] expected3 = {1, 2, 3, 4, 5};
        int[] result3 = solution.solution(A3, K3);
        System.out.println(Arrays.equals(result3, expected3)); // Expected output: true

        // Test case 4: Rotate by larger value than array length
        int[] A4 = {1, 2, 3, 4, 5};
        int K4 = 8;
        int[] expected4 = {3, 4, 5, 1, 2};
        int[] result4 = solution.solution(A4, K4);
        System.out.println(Arrays.equals(result4, expected4)); // Expected output: true

        // Test case 5: Empty array
        int[] A5 = {};
        int K5 = 3;
        int[] expected5 = {};
        int[] result5 = solution.solution(A5, K5);
        System.out.println(Arrays.equals(result5, expected5)); // Expected output: true
    }
}