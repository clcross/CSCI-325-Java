/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csu.csci325;

/**
 *
 * @author ccross190196
 */
public class MaxAttemptsExceededException extends Exception
{
    //  This exception is thrown when the max number of attempts to validate the
    // card have been executed. A default message is displayed for the user.
    public MaxAttemptsExceededException()
    {
        super("The number of failed attempts has been reached.");
    }
    
    //  This exception is thrown when the max number of attempts to validate the
    // card have been executed. A custom message is displayed for the user.
    public MaxAttemptsExceededException(String s)
    {
        super(s);
    }
}
