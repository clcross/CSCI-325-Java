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
    public int amount;
    
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
        boolean tOrF;
        if ((amount + amt) <= MAX_PAPER)
        {
            amount += amt;
            tOrF = true;
        }
        else
        {
            tOrF = false;
        }
        return tOrF;
    }

    public boolean decrementPaper()
    {
        boolean tOrF;
        if ((amount - 1) >= 0)
        {
            amount -= 1;
            tOrF = true;
        }
        else
        {
            tOrF = false;
        }
        return tOrF;
    }
}

