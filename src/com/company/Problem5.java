package com.company;

class Problem5 {
    public int smallestSoFar = 20;
    private boolean evenlyDivisable = false;
    public void findSmallestEvenDivisable(){
        while(!evenlyDivisable) {
            int i = 1;
            while (i < 21) {
                if(smallestSoFar%i != 0){
                    smallestSoFar++;
                    break;
                }
                else if(i == 20){
                    evenlyDivisable = true;
                }
                    i++;
            }
        }
    }

}

