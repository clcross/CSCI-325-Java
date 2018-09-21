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
    
    // Constructs a new Toner object with initial amount set to 
    // MAX_AMOUNT ounces.
    public Toner()
    {
        amt = MAX_AMOUNT;
    }
    
    // This class returns the amount of toner in the copier
    public double getAmount()
    {
        // amount - The current amount of toner in the copier.
        return amt;
    }
    
    // This class increments the amount of toner by one ounce.
    public boolean incrementByOne()
    {
        boolean success;
        
        // true if amount was incremented successfully. Returns false if the
        // toner is at the MAX_AMOUNT and none could be added.
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
    
    // This class decrements the amount of toner by .05 ounces
    public boolean decrementAmt()
    {
        boolean success;
        
        // true if the amount was decremented successfully. Returns false if the
        // toner amount is 0 and could not be decremented
        if (amt <= .05)
        {
            success = false;
        }
        else
        {
            amt -= .05;
            success = true;
        }
        return success;
    }
}
