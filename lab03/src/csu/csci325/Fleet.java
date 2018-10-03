/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csu.csci325;

import java.util.ArrayList;

/**
 *
 * @author ccross190196
 * The Fleet class stores information about a fleet of boats.
 */
public class Fleet
{
    private ArrayList<Boat> myFleet;
    
    // The constructor initializes the Fleet's ArrayList of Boats.
    public Fleet()
    {
        myFleet = new ArrayList<>();
    }
    
    // The getFleet method returns the Fleet of Boats.
    public ArrayList<Boat> getFleet()
    {
        return myFleet;
    }
    
    // The addBoat method adds a Boat object to the fleet ArrayList
    public void addBoat(Boat b)
    {
        myFleet.add(b);
    }
    
    // The getBoat method returns the first Boat object with the given name 
    // and year.
    public Boat getBoat(String name, int year)
    {
        Boat retVal = null;
        boolean notFound = true;
        int i = 0;
        
        while ((notFound) && i < myFleet.size())
        {
            Boat boat = myFleet.get(i);
            if (boat.getYearBuilt() == year && boat.getName().equals(name))
            {
                retVal = boat;
                notFound = false;
            }
            i++;
        }
        return retVal;
    }
    
    // The removeBoat method removes the first Boat object with the given name 
    // and year.
    public void removeBoat(String name, int year)
    {
        boolean notFound = true;
        int i = 0;
        
        while ((notFound) && i < myFleet.size())
        {
            Boat boat = myFleet.get(i);
            if (boat.getYearBuilt() == year && boat.getName().equals(name))
            {
                myFleet.remove(i);
                notFound = false;
            }
            i++;
        }
    }
}
