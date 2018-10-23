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
public class DogDriver
{
    public static void main(String [] args)
    {
        DogBreed myBreed = new DogBreed("Green", "curly");
        WorkingDog myWorkingDog = new WorkingDog("blue", "fluffy", "K9 doggo");
        NonWorkingDog myNonWorkingDog = new NonWorkingDog("", "", 2);
        
        /*
        * question 12: the lines of code below show polymorphism because
        * variable polyBreed is a DogBreed variable that can reference objects
        * from type WorkingDog.
        */ 
        DogBreed polyBreed = new WorkingDog("gray", "bigOlTail", "");
        //polyBreed.setHairColor("gray");
        System.out.println(polyBreed.getHairColor());
        System.out.println(polyBreed.getTailStyle());
        /*
        * affter running it shows proof of polymorphism because
        * polyBreed.getHairColor() returns the tailStyle like the override
        * method in WorkingDog.
        */
        
        // test case a-b
        myBreed.setHairColor("Brown");
        System.out.println(myBreed.getHairColor());
        
        //test case c-d
        myBreed.setTailStyle("curled");
        System.out.println(myBreed.getTailStyle());
        
        // test case e
        myWorkingDog.setJob("K9 Officer");
        System.out.println(myWorkingDog.getJob());
        
        // test case f-h
        myNonWorkingDog.setSize(0);
        System.out.println(myNonWorkingDog.getSize());
    }
}
