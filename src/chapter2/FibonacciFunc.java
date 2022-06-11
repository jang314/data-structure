package chapter2;

public class FibonacciFunc {
    public static void main(String[] args) {
        for(int i = 1; i < 15 ; i++) {
            System.out.print(fibo(i)+ " ");
        }
    }

    static int fibo(int n) {
        // n == 1이면 0, n==2이면 1
        if(n == 1) return 0;
        else if(n == 2) return 1;
        else {
            return fibo(n-2) + fibo(n-1);
        }
    }
}
