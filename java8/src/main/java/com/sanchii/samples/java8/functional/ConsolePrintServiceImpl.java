package com.sanchii.samples.java8.functional;


public class ConsolePrintServiceImpl {
    private static ConsolePrintServiceImpl ourInstance = new ConsolePrintServiceImpl();

    public static ConsolePrintServiceImpl getInstance() {
        return ourInstance;
    }

    public static void print(String text)
    {
        System.out.print(text);
    }


    private ConsolePrintServiceImpl() {
    }
}
