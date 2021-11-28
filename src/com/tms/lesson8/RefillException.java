package com.tms.lesson8;

public class RefillException extends RuntimeException{

    public RefillException(){
        super("You can't add more, than 5 elements");
    }
}
