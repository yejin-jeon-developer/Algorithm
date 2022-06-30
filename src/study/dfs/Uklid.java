package study.dfs;

public class Uklid {
    public static void main(String[] args) {
        System.out.println(GCD(10, 22));
    }

    public static int GCD (int A, int B) {
        if (A % B == 0) return B;
        return GCD(B, A % B);
    }
}
