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
public class DogBreed
{   
    private String mHairColor;
    private String mTailStyle;
    
    public DogBreed(String h, String t)
    {
        mHairColor = h;
        mTailStyle = t;
    }
    
    public String getHairColor()
    {
        return mHairColor;
    }
    
    public String getTailStyle()
    {
        return mTailStyle;
    }
    
    public void setHairColor(String h)
    {
        mHairColor = h;
    }
    
    public void setTailStyle(String t)
    {
        mTailStyle = t;
    }
    
    // queston 5
    public void setTailStyle(String t, int ts)
    {
        int tailSize = ts;
        mTailStyle = t;
    }
    
    public void setTailStyle(int ts)
    {
        int tailSize = ts;
    }
}
