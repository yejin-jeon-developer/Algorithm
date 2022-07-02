package second.dfsbfs;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(getFactorial(5));
    }

    public static int getFactorial(int number) {
        if (number <= 1) return number;
        return number * getFactorial(number - 1);
    }
}
