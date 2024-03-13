package com.coding;

/*
*   Sieve of Eratosthenes
*
* */

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 40;
        boolean [] primes = new boolean[n+1];
        sieve(n, primes);
    }

    // false in array means number is prime
    static void sieve(int n, boolean [] array){
        for (int i=2; i*i <= n; i++){
            if (!array[i]){
                for (int j = 2*i; j <=n; j+=i){
                    array[j] = true;
                }
            }
        }

        for (int i=2; i<=n; i++){
            if (!array[i]){
                System.out.println(i+" ");
            }
        }
    }
}
