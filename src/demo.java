import java.util.Arrays;

public class demo {
    public static void main(String[] args) {

        int[] A = {1, 3, 6, 4, 1, 2};
        new Solution().solution(A);
    }
}

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int min = 1;
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[0] + " " + A[1]);
            if (A[i] < 0) continue;
            min = A[i] + 1;

            int next = i + 1;
            if (next == A.length) break;
            if (A[next] != A[i] + 1 && A[next] != A[i]) {
                return A[i] + 1;
            }
        }
        return min;
    }
}