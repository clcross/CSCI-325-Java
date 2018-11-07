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
    public MaxAttemptsExceededException()
    {
        super("The number of failed attempts has been reached.");
    }
    
    public MaxAttemptsExceededException(String s)
    {
        super(s);
    }
    
}
