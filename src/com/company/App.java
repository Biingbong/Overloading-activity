package com.company;

public class App {
    /**
     * This method takes in two int parameters to add.
     * it computes the sum of two numbers
     */
    private static int ComputeSum1(int num1, int num2){
        return num1 + num2;
    }

    /**
     * This method takes in 3 int parameters to add.
     * the sum of three double parameters.
     */
    private static double ComputeSum2(double num1, double num2, double num3){
        return num1 + num2 + num3;
    }

    /**
     * this method returns the greater integer value
     */
    private static int greaterValue1(int num1, int num2){
        int a;// The result of comparison operation will be assigned to variable a
        if (num1 > num2){
            a = num1; // if the num1 contains the greatest value, it will be assigned to a
        }else a = num2; // if false, num2 contains the greatest value, and it will be assigned to a
        return a; // returns the value of a
    }


    /**
     * This method that returns the greater double value
     */
    private static double greaterValue2(double num1, double num2, double num3){
        double a;// The result of comparison operation will be assigned to variable a
        if (num1 >= num2 && num1 >= num3){
                a = num1; // if the num1 contains the greatest value, it will be assigned to a
            } else if (num2 >= num1 && num2 >= num3){
            a = num2; // if the num2 contains the greatest value, it will be assigned to a
        }else a = num3; // if num1 and num2 does not contain the greatest value, surely the value of num3 will be assigned to a
        return a; // returns the value of a
    }
    public static void main(String[] args) throws Exception {

        /**
         * Method calls that takes in 2 int parameters then computes their sum
         */
        System.out.println("The sum value of 45 and 100 is " + ComputeSum1(45, 100)); //145

        /**
         * Method calls that takes in 3 double parameters then computes their sum
         */
        System.out.println("The sum value of 3.14, 9.8, and 4.51 is " + ComputeSum2(3.14,9.8, 4.51)); //17.45

        /**
         * Call the greaterValue method with integer parameters
         */
        System.out.println("The greater value between 45 and 100 is " + greaterValue1(45,100)); //100

        /**
         * Call the greaterValue method with double parameters
         */
        System.out.println("The greater value between 3.14 and 9.8, 4.51 is " + greaterValue2(3.14, 9.8, 4.51)); //9.8

    }
}
