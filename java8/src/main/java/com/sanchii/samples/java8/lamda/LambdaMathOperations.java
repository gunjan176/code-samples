package com.sanchii.samples.java8.lamda;

public class LambdaMathOperations {


    public static void main(String args[]){

        LambdaHelloWorldOperations.GreetingService greetingService = message ->
                System.out.println("Operation" + message);;
        LambdaMathOperations tester = new LambdaMathOperations();


        //with type declaration
        LambdaMathOperations.MathOperation addition = (int a, int b) -> a + b;

        //with out type declaration
        LambdaMathOperations.MathOperation subtraction = (a, b) -> a - b;

        //with return statement along with curly braces
        LambdaMathOperations.MathOperation multiplication = (int a, int b) -> { return a * b; };

        //without return statement and without curly braces
        LambdaMathOperations.MathOperation division = (int a, int b) -> a / b;

        greetingService.sayMessage("10 + 5 = "  + Integer.toString(tester.operate(10, 5, addition)));
        greetingService.sayMessage("10 - 5 = " +Integer.toString(tester.operate(10, 5, subtraction)));
        greetingService.sayMessage("10 x 5 = " +Integer.toString(tester.operate(10, 5, multiplication)));
        greetingService.sayMessage(  "10 / 5 = " + Integer.toString(tester.operate(10, 5, division)));

    }

    private interface MathOperation {
        int operation(int a, int b);
    }


    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }
}
