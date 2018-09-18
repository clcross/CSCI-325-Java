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
    final int MAX_PAPER = 3000;
    private int amt;
    public int input;
    public Toner()
    {
        Toner MAX_AMOUNT = new Toner
    }
    public int getAmount()
    {
        return amt;
    }
    public boolean incrementPaper(int input)
    {
        if ((amt + input) <= MAX_PAPER)
        {
            int incr = amt + input;
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean decrementPaper()
    {
        if ((amt - input) >= 0)
        {
            int decr = amt - input;
            return true;
        }
        else
        {
            return false;
        }
    }
}
