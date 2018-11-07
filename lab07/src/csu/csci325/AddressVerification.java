/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csu.csci325;

/**
 *
 * @author Cameron Cross
 */
public class AddressVerification
{
    private String[] addressArray;
    public AddressVerification()
    {
        
    }
    public boolean validateAddress(String add)
    {
        boolean isValid = true;
        
        addressArray = add.split(",");
        
        for (int i = 0; i < addressArray.length; i++)
        {
            addressArray[i] = addressArray[i].trim();
        }
        try
        {
            isValid = addressArray[0].matches("\\d{1,5}\\s\\w{2,20}\\s\\w{2,20}");
            if (isValid == false)
            {
                throw new InvalidAddressException();
            }
        }
        catch (InvalidAddressException e)
        {
            System.out.println("The street address portion is not of the form: "
                    + "HouseNumber StreetName.");
        }
        try
        {
            isValid = addressArray[1].matches("\\w{2,20}");
            if (isValid == false)
            {
                throw new InvalidAddressException();
            }
        }
        catch (InvalidAddressException e)
        {
            System.out.println("The city name portion is not in the "
                    + "correct form.");
        }
        try
        {
            isValid = addressArray[2].matches("\\w{2}\\s\\d{5}");
            if (isValid == false)
            {
                throw new InvalidAddressException();
            }
        }
        catch (InvalidAddressException e)
        {
            System.out.println("The state and zip portion is not in the correct form.");
        }
        return isValid;
    }
    
    public boolean checkFormat(String sAddress) throws InvalidAddressException
    {
        boolean isValid = true;
        
        addressArray = sAddress.split(",");
        
        if (addressArray.length < 1 && addressArray.length > 3)
        {
            isValid = false;
            throw new InvalidAddressException("You have entered an invalid "
                    + "address, goodbye.");
        }
        
        return isValid;
    }
    
    public boolean checkStreetAdd(String streetAdd)
            throws InvalidAddressException
    {
        boolean isValid = true;
        streetAdd = streetAdd.trim();
        String[] string = streetAdd.split(" ");
        
        if (string.length < 2)
        {
            isValid = false;
            throw new InvalidAddressException("You have entered an invalid "
                    + "street address, goodbye.");
        }
        
        if (string[0].matches("\\d{1,5}") == false)
        {
            isValid = false;
            throw new InvalidAddressException("You have entered an invalid "
                    + "street number, goodbye.");
        }
        
        if (string.length < 3)
        {
            if (string[1].matches("\\w{2,20}") == false)
            {
                isValid = false;
                throw new InvalidAddressException("You have entered an invalid"
                        + " street name, goodbye");
            }
        }
        
        return isValid;
    }
    
    public boolean checkCity(String city) throws InvalidAddressException
    {
        boolean isValid = true;
        
        if (city.length() != 2)
        {
            isValid = false;
            throw new InvalidAddressException("You have entered an invalid city"
                    + ", goodbye.");
        }
        
        
        return isValid;
    }
    
    public boolean checkStateZip(String stateZip)
            throws InvalidAddressException
    {
        boolean isValid = true;
        stateZip = stateZip.trim();
        String[] string = stateZip.split(" ");
       
        if (string[1].length() != 2)
        {
            isValid = false;
            throw new InvalidAddressException("You have entered an invalid "
                    + "state, goodbye.");
        }  
        
        if (string[0].length() != 5)
        {
            isValid = false;
            throw new InvalidAddressException("You have entered an invalid "
                    + "zip code, goodbye.");
        } 
          
        return isValid; 
    }
    
}
