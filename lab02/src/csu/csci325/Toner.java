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
public class Toner
{
    final double MAX_AMOUNT = 18.0;
    private double amt;
    
    
    public Toner()
    {
        amt = MAX_AMOUNT;
    }
    public double getAmount()
    {
        return amt;
    }
    public boolean incrementByOne()
    {
        boolean success;
        
        if ((amt) < MAX_AMOUNT)
        {
            amt++;
            success = true;
        }
        else
        {
            success = false;
        }
        return success;
    }
    public boolean decrementAmt()
    {
        boolean success;
        
        if (amt > 0)
        {
            amt -= .05;
            
            success = true;
        }
        else
        {
            success = false;
        }
        return success;
    }
}
