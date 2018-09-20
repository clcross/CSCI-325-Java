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
    Paper paperAmount;
    Toner tonerAmount;
    private int totalCount;
    private int countSinceLast;
    
    public CopyManager()
    {
        tonerAmount = new Toner();
        paperAmount = new Paper(3000);
        totalCount = 0;
        countSinceLast = 0;
    }
    
    public int copyIt()
    {
        int RC;
        
        if (paperAmount.getAmount() > 0)
        {
            if (tonerAmount.getAmount() > 0)
            {
                RC = -1;
                totalCount++;
                paperAmount.decrementPaper();
                countSinceLast++;
                if ((countSinceLast % 8) == 0)
                {
                   tonerAmount.decrementAmt();
                }
            }
            else
            {
                RC = -3;
            }
        }
        else if (paperAmount.getAmount() <= 0)
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
