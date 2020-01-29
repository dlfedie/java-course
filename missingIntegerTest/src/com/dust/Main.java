package com.dust;
// Write a function:
//
// class Solution { public int solution(int[] A); }
//
// that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
//
//        For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
//
//        Given A = [1, 2, 3], the function should return 4.
//
//        Given A = [−1, −3], the function should return 1.
//
//        Write an efficient algorithm for the following assumptions:
//
//        N is an integer within the range [1..100,000];
//        each element of array A is an integer within the range [−1,000,000..1,000,000].

import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] array = new int[3];
        nextSmallestInt([1,2,3]);


    }




    public static int nextSmallestInt(int[] A) {
        //
        int smallestPositive = 1;
        Arrays.sort(A);
        // so if the last # is not positive, just return 1
        if (A[A.length - 1] < 1) {
            System.out.println("lowest int: " + smallestPositive);
            return smallestPositive;
        }
        // create a new array with a value 2 higher than the last value in the initial array, so if #'s are sequential (1,2,3), we'll be able to return 4 (with 5 being the new "last" number)
        int[] newArray = new int[A.length + 1];
        for (int i = 0; i < A.length; i++) {
            newArray[i] = A[i];
            // add 2, so t
            newArray[newArray.length - 1] = (A[A.length - 1] + 2);
        }

        // loop through the array now, but we only want to go 1 less than the full length to not get our newly created +2 value
        for (int j = 0; j < newArray.length - 1; j++) {
            if (newArray[j + 1] - newArray[j] != 1) {
                smallestPositive = newArray[j] + 1;
                System.out.println("lowest int: " + smallestPositive);

                return smallestPositive;
            } else if (newArray[j + 1] - newArray[j] == 1) {
                smallestPositive = newArray[j];
            }
        }
        System.out.println("lowest int: " + smallestPositive + 1);

        return smallestPositive + 1;
    }


}
