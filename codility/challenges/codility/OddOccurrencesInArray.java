package challenges.codility;

public class OddOccurrencesInArray {
    public int solution(int[] A) {
        int unpaired = 0;
        for (int number : A) {
            unpaired ^= number;
        }
        return unpaired;
    }

    //A explained solution
    public int solution2(int[] A) {
        int unpaired = 0;
        for (int number : A) {
            unpaired ^= number;
            System.out.println("unpaired: " + unpaired + " number: " + number);
        }
        return unpaired;
    }

    //Call a explained solution
    public static void main(String[] args) {
        OddOccurrencesInArray solution = new OddOccurrencesInArray();

        int result1 = solution.solution2(new int[] {9, 3, 9, 3, 9, 7, 9});
        System.out.println("Result 1: " + result1);

        // int result2 = solution.solution2(new int[] {1, 1, 2, 2, 3});
        // System.out.println("Result 2: " + result2);

        // int result3 = solution.solution2(new int[] {2, 2, 3, 3, 4, 4, 5});
        // System.out.println("Result 3: " + result3);
    }
}