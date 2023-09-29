public class PrimeNumber {
    
    public static void primeNumber(int primeNum) {

        System.out.println( verf(primeNum, 2) );
    }

    // backtracking and recursion
    public static boolean verf(int primeNum, int count ) {
        if (primeNum == count) {
            return true;
        }
        if (primeNum % count == 0) {
            return false;
        }
        return  verf(primeNum, count + 1);
    }


    // Recursion
    public static boolean fib(int n){

         


        return fib(n);
    }

    public static void main(String[] args) {

        int primeNum = 7;
        primeNumber(primeNum);
    }
}
