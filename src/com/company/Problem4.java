package com.company;

class Problem4 {
    int largestPalSoFar = 0;
    int num1 = 0;
    int num2 = 0;

    public boolean isPalindrome(int n) {
        int original = n;
        int mirror = 0;
        while (n != 0) {
            mirror = mirror * 10 + n % 10;
            n /= 10;
        }
        return mirror == original;
    }

    public void findLargestPal() {
        for (int i = 999; i > 99; i--) {
            for (int j = 999; j > 99; j--) {
                int testPal = i * j;
                if (isPalindrome(testPal) && testPal > largestPalSoFar) {
                    largestPalSoFar = testPal;
                    num1 = i;
                    num2 = j;
                }
            }
        }
    }
}
