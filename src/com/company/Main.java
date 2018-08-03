package com.company;

public class Main {
    public static void main(String[]args){
        Problem4 myProblem4 = new Problem4();
        System.out.println("Answer to problem 4");
        myProblem4.findLargestPal();
        System.out.println(myProblem4.num1 + " x " + myProblem4.num2 + " = " + myProblem4.largestPalSoFar);
        Problem5 myProblem5 = new Problem5();
        myProblem5.findSmallestEvenDivisable();
        System.out.println("Answer to problem 5");
        System.out.println(myProblem5.smallestSoFar);
    }
}
