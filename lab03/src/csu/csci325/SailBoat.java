/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csu.csci325;

/**
 *
 * @author ccross190196
 * The SailBoat class stores information about a boat that carries passengers,
 * and extends from the Boat class.
 */
public class SailBoat extends Boat
{
    private String mName;
    private int mYear;
    private int maxPassengers;
    
    // The constructor initializes the boat's name, year the boat was built,
    // and the maximum number of passengers.
    public SailBoat(String n, int y, int p)
    {
        super(n, y);
        
        mName = n;
        mYear = y;
        maxPassengers = p;
                
    }
    
    
    // The setPassengers method sets the maximum number of passengers.
    public void setPassengers(int p)
    {
        maxPassengers = p;
    }
    
    // The getPassengers method returns the ship's maximum number of passengers.
    public int getPassengers()
    {
        return maxPassengers;
    }
    
    // The toString method returns a string indicating the ship's name and the
    // maximum number of passengers. Overrides: toString in the Boat class
    @Override
    public String toString()
    {
        return ("SailBoat Name: " + mName + "\nMaximum passengers: " +
                maxPassengers);
    }
}
