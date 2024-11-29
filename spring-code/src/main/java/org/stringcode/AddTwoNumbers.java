package org.stringcode;

public class AddTwoNumbers {
    public static void main(String[] args) {
        int a = 10, b=40;
        System.out.println("Value of these two numbers : " + a + b);
        //Value of these two numbers : 1040, Because when you use + operator with string is concat
        //the string value and number after that is all consider as a string, so that's why value be is also concat not add.

        System.out.println("Value of these two numbers : " + (a + b));  //Value of these two numbers : 50
    }
}
