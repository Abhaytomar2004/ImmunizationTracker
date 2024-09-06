package com.example.VaccineManagementSystem.Exceptions;

public class AppointmentNotFound extends Exception{
    //constructor, this is an custom exception
    public AppointmentNotFound(String message){
        super(message);
    }
}
