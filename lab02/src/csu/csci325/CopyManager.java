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
    
    // Constructs a new CopyManager object. Initializes the following member 
    // variables: Two different count variables, overall total count and count
    // since last toner reduction, are initialized to 0. For the Paper member
    // variable, a new Paper object is instantiated with 3000 pages. For the
    // Toner member variable, a new Toner object is instantiated.
    public CopyManager()
    {
        myToner = new Toner();
        myPaper = new Paper(3000);
        totalCount = 0;
        countSinceLast = 0;
    }
    
    // This class simulates making a copy
    public int copyIt()
    {
        int RC;
        
        // -1 if the copy was made successfully, -2 if the copier is out of
        // paper, -3 if the copier is out of toner, -5 if an unknown error
        // occurred.
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
    
    // This class returns the total number of copies made by this copier.
    public int getTotalCopiesMade()
    { 
        // The current amount of copies made.
        return totalCount;
    }
}
