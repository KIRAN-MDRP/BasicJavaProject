package com.practise.interviewPrograms;

import java.util.ArrayList;
import java.util.List;

public class DisplayFirstNPrimeNumbers {
    public static void main(String[] args) {
        int counter = 0;
        int firstPrimeNumber = 2;
        int givenNumber = 10;
        List<Integer> primeNumbersList = new ArrayList<Integer>();
        while (counter < givenNumber){
            boolean isPrimeNumber = true;
            for (int currentNumber = 2; currentNumber < (int)(Math.pow(firstPrimeNumber, 0.5)+1); currentNumber++) {
                if (firstPrimeNumber % currentNumber == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
            if (isPrimeNumber == true){
                //System.out.println(firstPrimeNumber);
                primeNumbersList.add(firstPrimeNumber);
                counter++;
            }

            firstPrimeNumber++;
        }
          System.out.println("Prime numbers list is: "+primeNumbersList);
    }
}
