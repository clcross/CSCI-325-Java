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
 */
public class Fleet
{
    private ArrayList<Boat> myFleet;
    
    public Fleet()
    {
        myFleet = new ArrayList<>();
    }
    
    public ArrayList<Boat> getFleet()
    {
        return myFleet;
    }
    
    public void addBoat(Boat b)
    {
        myFleet.add(b);
    }
    
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
                notFound = false;
            }
            i++;
        }
        return retVal;
    }
    
    public void reoveBoat(String name, int year)
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
