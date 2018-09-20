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
    public int amt;
    public int input;
    
    public Paper(int amt)
    {
        amt = input;
        if (amt > MAX_PAPER)
        {
            amt = MAX_PAPER;
        }
    }
    public int getAmount()
    {
        return amt;
    }
    public boolean incrementPaper(int input)
    {
        if ((amt + input) <= MAX_PAPER)
        {
            amt += input;
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     *
     * @return
     */
    public boolean decrementPaper()
    {
        if ((amt - 1) >= 0)
        {
            amt -= 1;
            return true;
        }
        else
        {
            return false;
        }
    }
}

