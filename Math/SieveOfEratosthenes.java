package DSA.Math;

public class SieveOfEratosthenes {
    public static void main(String[] args){
        int n = 40;
        boolean[] primes = new boolean[n+1];
    sieve(n,primes);
  
    }
    static void sieve( int n, boolean[] primes) {
        for( int i = 2; i*i <=n; i++){
            if(!primes[i]){ // If i is prime
                for(int j = i*2; j <= n; j += i){ // Mark all multiples of i as non-prime
                    primes[j] = true;
                }
            }
        }
        // Print all prime numbers
        for(int i = 2; i <= n; i++){
            if(!primes[i]){ // If i is still marked as prime
                System.out.print(i + " ");
            }
        }
    }
    
}
