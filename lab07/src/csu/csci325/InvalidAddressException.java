/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csu.csci325;

/**
 *
 * @author Cameron Cross
 */
public class InvalidAddressException extends Exception
{
    public InvalidAddressException()
    {
        super("The address entered is not valid.");
    }
    
    public InvalidAddressException(String s)
    {
        super(s);
    }
    
}
