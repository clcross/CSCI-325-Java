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
public class SailBoat extends Boat
{
    private String mName;
    private int mYear;
    private int maxPassengers;
    
    public SailBoat(String n, int y, int p)
    {
        super(n, y);
        
        mName = n;
        mYear = y;
        maxPassengers = p;
                
    }
    
    public void setPassengers(int p)
    {
        maxPassengers = p;
    }
    
    public int getPassengers()
    {
        return maxPassengers;
    }
    
    @Override
    public String toString()
    {
        return ("SailBoat Name: " + mName + "\nMaximum passengers: " +
                maxPassengers);
    } 
}
