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
public class WorkingDog extends DogBreed
{
    private String mJob;
    public WorkingDog(String h, String t, String j)
    {
        super(h, t);
        
        mJob = j;
    }
    
    public void setJob(String j)
    {
        mJob = j;
    }

    public String getJob()
    {
        return mJob;
    }
    
    // question 7
    @Override
    public String getHairColor()
    {
        return this.getTailStyle();
    }
}
