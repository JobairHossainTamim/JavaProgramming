public abstract class PrimeNumber {
    
    public static void main(String[] args) {
        
        boolean isPrime = true;

        int n = 855884;
        
        if (n == 2) {
            System.out.println("n is prime");
        } else {

            for (int i = 2; i <= Math.sqrt(n); i++) {

                if (n % i == 0) {
                    isPrime = false;
                    break;  // No need to continue checking if it's already not prime
                }
            }

            if (isPrime) {
                System.out.println("Prime is true");
            } else {
                System.out.println("Prime is false");
            }
        }
    }
}
