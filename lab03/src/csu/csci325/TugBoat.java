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
public class TugBoat extends Boat
{
    private String mName;
    private int mYear;
    private int maxTons;
    
    public TugBoat(String n, int y, int t)
    {
        super(n, y);
        
        mName = n;
        mYear = y;
        maxTons = t;
    }
    
    public void setCapacity(int t)
    {
        maxTons = t;
    }
    
    public int getCapacity()
    {
        return maxTons;
    }
    
    @Override
    public String toString()
    {
        return ("TugBoat Name: " + mName + "\nCargo capacity: " + maxTons);
    }
}
