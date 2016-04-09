package com.sanchii.samples.java8.lamda;

import com.sanchii.samples.java8.functional.ConsolePrintServiceImpl;
import com.sanchii.samples.java8.functional.MathOperation;
import com.sanchii.samples.java8.functional.PrintFunctionalInterface;

public class IntegerMathOperationsService {


    public static void main(String args[]){

        SalutationOperationsService.GreetingService greetingService = message ->
                "Operation" + message;
        IntegerMathOperationsService tester = new IntegerMathOperationsService();

        PrintFunctionalInterface<String> sysout = ConsolePrintServiceImpl::print;
        //sysout.print("hello world");

        //with type declaration
        MathOperation addition = (int a, int b) -> a + b;

        //with out type declaration
        MathOperation subtraction = (a, b) -> a - b;

        //with return statement along with curly braces
        MathOperation multiplication = (int a, int b) -> { return a * b; };

        //without return statement and without curly braces
        MathOperation division = (int a, int b) -> a / b;

        sysout.print(greetingService.sayMessage("10 + 5 = "  + Integer.toString(tester.operate(10, 5, addition))));
        sysout.print(greetingService.sayMessage("10 - 5 = " +Integer.toString(tester.operate(10, 5, subtraction))));
        sysout.print(greetingService.sayMessage("10 x 5 = " +Integer.toString(tester.operate(10, 5, multiplication))));
        sysout.print(greetingService.sayMessage(  "10 / 5 = " + Integer.toString(tester.operate(10, 5, division))));

    }


    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }
}
