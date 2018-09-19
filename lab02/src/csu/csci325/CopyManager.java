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
    private int totalCount;
    private int countSinceLast;
    Paper paperAmount = new Paper(3000);
    Toner tonerAmount = new Toner();
    private int paperCount;
    private double tonerCount;
    
    public CopyManager()
    {
        paperCount = paperAmount.getAmount();
        tonerCount = tonerAmount.getAmount();
    }
    
    public int copyIt()
    {
        
        if (paperAmount.decrementPaper())
        {
            if (tonerAmount.decrementAmt())
            {
                totalCount += 1;
                return -1;
            }
            else
            {
                return -3;
            }
        }
        else if (tonerAmount.getAmount() > 0)
        {
            return -2;
        }
        else
        {
            return -5;
        }
    }
    
    public int getTotalCopiesMade()
    { 
        return totalCount;
    }
}
