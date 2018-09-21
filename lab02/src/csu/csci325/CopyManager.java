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
    public Paper myPaper;
    public Toner myToner;
    private int totalCount;
    private int countSinceLast;
    
    public CopyManager()
    {
        myToner = new Toner();
        myPaper = new Paper(3000);
        totalCount = 0;
        countSinceLast = 0;
    }
    
    public int copyIt()
    {
        int RC;
        
        if (myToner.getAmount() > .05)
        {
            if (myPaper.getAmount() > 0)
            {
                RC = -1;
                totalCount++;
                myPaper.decrementPaper();
                countSinceLast++;
                if ((countSinceLast % 8) == 0)
                {
                    myToner.decrementAmt();
                }
            }
            else
            {
                RC = -2;
            }
        }
        else if (myToner.getAmount() <= .05)
        {
            RC = -3;
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
