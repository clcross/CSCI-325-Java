/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csu.csci325;

/**
 *
 * @author ccross190196
 * The TugBoat class stores information about a boat that carries weighted 
 * cargo.
 */
public class TugBoat extends Boat
{
    private String mName;
    private int mYear;
    private int maxTons;
    
    // The constructor initializes the boat's name, year the boat was built,
    // and the cargo tonnage
    public TugBoat(String n, int y, int t)
    {
        super(n, y);
        
        mName = n;
        mYear = y;
        maxTons = t;
    }
    
    // The setCapacity method sets the maximum cargo tonnage.
    public void setCapacity(int t)
    {
        maxTons = t;
    }
    
    // The getCapacity method returns the ship's cargo capacity in tons
    public int getCapacity()
    {
        return maxTons;
    }
    // The toString method returns a string indicating the ship's name and the
    // cargo capacity. Overrides: toString in class Boat
    @Override
    public String toString()
    {
        return ("TugBoat Name: " + mName + "\nCargo capacity: " + maxTons +
                " tons");
    }
}
