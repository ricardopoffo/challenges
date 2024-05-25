public class CyclicRotation {
    public static void main(String[] args) {
        CyclicRotation solution = new CyclicRotation();

        int[] A = {3, 8, 9, 7, 6};
        int K = 3;

        int[] result = solution.solution(A, K);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public int[] solution(int[] A, int K) {
        if (A.length == 0) {
            return A;
        }

        K = K % A.length;
        int[] result = new int[A.length];

        for (int i = 0; i < K; i++) {
            result[i] = A[A.length - K + i];
        }

        for (int i = K; i < A.length; i++) {
            result[i] = A[i - K];
        }

        return result;
    }
}