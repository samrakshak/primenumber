package com.samrakshak;

public class Prime {


    public static void main(String[] args) {
        int numPrime = 1;
        int num = 1;
        while (numPrime < 10001) {
            num = num + 2;
            if (isPrime(num)) {
                numPrime++;
            }
        }
        // display output
        System.out.println(num);
    }
//Here after the number 2 all the prime numbers are odd numbers.
    //function checks if the number is prime.
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        if (num == 2) {
            return true;
        }

        if (num % 2 == 0) {
            return false;
        }

        int count = 3;

        while ((count * count) <= num) {
            if (num % count == 0) {
                return false;
            } else {
                count += 2;
            }
        }

        return true;
    }

}



