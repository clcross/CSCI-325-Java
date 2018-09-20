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
    public double amt;
    
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
        boolean tOrF;
        
        if ((amt++) <= MAX_AMOUNT)
        {
            amt++;
            tOrF = true;
        }
        else
        {
            tOrF = false;
        }
        return tOrF;
    }
    public boolean decrementAmt()
    {
        boolean tOrF;
        
        if ((amt - .05) >= 0)
        {
            amt -= .05;
            tOrF = true;
        }
        else
        {
            tOrF = false;
        }
        return tOrF;
    }
}
