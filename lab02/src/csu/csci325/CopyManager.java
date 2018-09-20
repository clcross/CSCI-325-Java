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
public class CopyManager
{    
    Paper paperAmount = new Paper(3000);
    Toner tonerAmount = new Toner();
    private int totalCount;
    private int countSinceLast;
    private int paperCount;
    private double tonerCount;
    
    public CopyManager()
    {
        paperCount = paperAmount.getAmount();
        tonerCount = tonerAmount.getAmount();
    }
    
    public int copyIt()
    {
        int RC;
        if (paperAmount.getAmount() > 0)
        {
            if (tonerAmount.getAmount() > 0)
            {
                countSinceLast++;
                totalCount++;
                paperAmount.decrementPaper();
                RC = -1;
            }
            else
            {
                RC = -3;
            }
        }
        else if (tonerAmount.getAmount() > 0)
        {
            RC = -2;
        }
        else
        {
            RC = -5;
        }
        return RC;
    }
    
    public int getTotalCopiesMade()
    { 
        return totalCount;
    }
}
