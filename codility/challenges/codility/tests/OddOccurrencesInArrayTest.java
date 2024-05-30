package challenges.codility.tests;

import challenges.codility.OddOccurrencesInArray;

public class OddOccurrencesInArrayTest {
    public static void main(String[] args) {
        OddOccurrencesInArray solution = new OddOccurrencesInArray();

        int result1 = solution.solution(new int[] {9, 3, 9, 3, 9, 7, 9});
        assert result1 == 7 : "Test case 1 failed";

        int result2 = solution.solution(new int[] {1, 1, 2, 2, 3});
        assert result2 == 3 : "Test case 2 failed";

        int result3 = solution.solution(new int[] {2, 2, 3, 3, 4, 4, 5});
        assert result3 == 5 : "Test case 3 failed";

        System.out.println("All test cases passed");
    }
}