package com.sanchii.samples.java8.lamda;

import org.junit.Test;

import static org.junit.Assert.*;

public class SalutationOperationsServiceTest {



    @Test
    public void testHelloWorldOperationsWithoutParenthesis()
    {
        SalutationOperationsService tester = new SalutationOperationsService();
        //without parenthesis
        SalutationOperationsService.GreetingService greetService1 = message ->
                "Hello " + message;
        String greeting = greetService1.sayMessage("Mahesh");

        assertEquals("The messages are equal","Hello Mahesh",greeting);

    }

}