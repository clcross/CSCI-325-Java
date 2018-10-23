/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csu.csci325;

/**
 *
 * @author ccross190196
 * @author aramsey189051
 */
public class NonWorkingDog extends DogBreed
{
    private int mSize;
    private String mHairColor;
    private String mTailStyle;
    public NonWorkingDog(String h, String t, int s)
    {
        super(h, t);
        
        mSize = s;
    }
    
    public void setSize(int s)
    {
        if (s <= 3)
        {
           if (s >= 1)
           {
              mSize = s; 
           }
           else
           {
               System.out.println("The value entered was less than 1");
               mSize = 0;
           }
        }
        else if (s > 3)
        {
            System.out.println("The value entered was greater than 3");
            mSize = 0;
        }
    }
    
    public String getSize()
    {
        String sizeInWords;
        switch (mSize)
        {
            case 1:
                sizeInWords = "small";
                break;
            case 2:
                sizeInWords = "medium";
                break;
            case 3:
                sizeInWords = "large";
                break;
            default:
                sizeInWords = "invalid entry";
                break;
        }
        
        return sizeInWords;
    }
}
