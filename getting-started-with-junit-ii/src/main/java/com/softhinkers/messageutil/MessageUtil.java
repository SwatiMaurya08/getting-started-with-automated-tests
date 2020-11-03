package com.softhinkers.messageutil;

public class MessageUtil {
    private static String message;



    //Constructor
    //@param message to be printed
    public MessageUtil(String message){
        this.message = message;
    }

    // prints the message
    public static String printMessage(){
        System.out.println(message);
        return message;
    }
}
