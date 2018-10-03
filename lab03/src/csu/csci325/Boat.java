/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csu.csci325;

/**
 *
 * @author ccross190196
 * The Boat class stores information about a boat
 */
public class Boat
{
    private String mName;
    private int mYear;
    
    // initializes the boat's name and the year the boat was built.
    public Boat(String n, int y)
    {
        mName = n;
        mYear = y;
    }
    
    // The getName method returns the boat's name
    public String getName()
    {
        return mName;
    }
    
    // The getYearBuilt method returns the year the boat was built
    public int getYearBuilt()
    {
        return mYear;
    }
    
    //The setName method sets the boat's name.
    public void setName(String n)
    {
        mName = n;
    }
    
    // The setYearBuilt method sets the year the boat was built.
    public void setYearBuilt(int y)
    {
        mYear = y;
    }
    
    // overrides the toString method to return a string indicating the boat's 
    // name and the year it was built
    @Override
    public String toString()
    {
        return ("Boat Name: " + mName + "\nYear built: " + mYear);
    }
}
