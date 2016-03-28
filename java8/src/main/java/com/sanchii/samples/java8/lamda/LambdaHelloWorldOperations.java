package com.sanchii.samples.java8.lamda;

/**
 * Created by Toshiba on 27/03/2016.
 */
public class LambdaHelloWorldOperations {
        final static String salutation = "Hello! ";

        public static void main(String args[]){
                LambdaHelloWorldOperations tester = new LambdaHelloWorldOperations();
            //with parenthesis
                LambdaHelloWorldOperations.GreetingService greetService1 = message ->
                    System.out.println("Hello " + message);

            //without parenthesis
                LambdaHelloWorldOperations.GreetingService greetService2 = (message) ->
                    System.out.println("Hello " + message);

            greetService1.sayMessage("Mahesh");
            greetService2.sayMessage("Suresh");

            greetService1 = message ->
                    System.out.println(LambdaHelloWorldOperations.salutation + message);
            greetService1.sayMessage("Gunjan");
        }
        interface GreetingService {
                void sayMessage(String message);
        }

}
