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
public class Boat
{
    private String mName;
    private int mYear;
    public Boat(String n, int y)
    {
        mName = n;
        mYear = y;
    }
    public String getName()
    {
        return mName;
    }
    
    public int getYearBuilt()
    {
        return mYear;
    }
    
    public void setName(String n)
    {
        mName = n;
    }
    
    public void setYearBuilt(int y)
    {
        mYear = y;
    }
    
    @Override
    public String toString()
    {
        return ("Boat Name: " + mName + "\nYear built: " + mYear);
    }
}
