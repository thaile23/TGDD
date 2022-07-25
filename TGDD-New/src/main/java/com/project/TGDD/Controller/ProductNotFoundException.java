package com.project.TGDD.Controller;

public class ProductNotFoundException extends Throwable{
    public ProductNotFoundException(String message){
        super(message);
    }
}

