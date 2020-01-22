package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double firstDouble = 20.00d;
        double secondDouble = 80.00d;

        double mathOnDoubles = (firstDouble + secondDouble) * 100.00d;

        System.out.println(mathOnDoubles);

        double remainderAfterMaths = mathOnDoubles % 40.00d;

//        remainderAfterMaths +=1;

        System.out.println("remainder after maths: " + remainderAfterMaths);

        boolean remainderCheck = (remainderAfterMaths == 0) ? true : false;

        System.out.println(remainderCheck);

        if (!remainderCheck) {
            System.out.println("Got some remainder!");
        }
    }
}
