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
    final int MAX_PAPER = 3000;
    private int amount;
    
    public Paper(int amt)
    {
        if (amt > MAX_PAPER)
        {
            amt = MAX_PAPER;
        }
        amount = amt;
    }
    public int getAmount()
    {
        return amount;
    }
    public boolean incrementPaper(int amt)
    {
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

    public boolean decrementPaper()
    {
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

