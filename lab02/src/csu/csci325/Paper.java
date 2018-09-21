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
public class Paper
{
    // setting variables
    final int MAX_PAPER = 3000;
    private int amount;
    
    // Constructs a new Paper object with the specified amount of paper.
    public Paper(int amt)
    {
        if (amt > MAX_PAPER)
        {
            amt = MAX_PAPER;
        }
        amount = amt;
    }
    
    // This class returns the amount of paper in the copier.
    public int getAmount()
    {
        // amount - The current amount of paper in the copier.
        return amount;
    }
    
    // This class increments the amount of paper by the specified amount.
    public boolean incrementPaper(int amt)
    {
        // true if amount was incremented successfully. Returns false if adding
        // the amount specified would exceed MAX_PAPER.
        boolean success;
        if ((amount + amt) <= MAX_PAPER)
        {
            amount += amt;
            success = true;
        }
        else
        {
            success = false;
        }
        return success;
    }

    // This class decrements the amount of paper by 1.
    public boolean decrementPaper()
    {
        // true if the amount was decremented successfully. Returns false if the
        // paper amount is 0 and could not be decremented
        boolean success;
        if ((amount - 1) >= 0)
        {
            amount -= 1;
            success = true;
        }
        else
        {
            success = false;
        }
        return success;
    }
}

