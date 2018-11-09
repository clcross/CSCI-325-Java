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
    
    // The method checks the format first, then street address, then city, then
    // state and zip. If any validation fails (by throwing an
    //InvalidAddressException), this method will catch the exception, print the
    //message of the exception, and immediately return false.
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
            if (addressArray.length == 3)
            {
                try
                {
                    //isValid = addressArray[0].matches("\\d{1,5}\\s\\w{2,20}\\s\\w{2,20}");
                    if (addressArray[0].matches("\\d{1,5}\\s\\w{2,20}\\s\\w{2,20}") || 
                            addressArray[0].matches("\\d{1,5}\\s\\w{2,20}"))
                    {
                        isValid = true;
                    }
                    if (isValid == false)
                    {
                        throw new InvalidAddressException();
                    }
                }
                catch (InvalidAddressException ea)
                {
                    System.out.println("The street address portion is not of the form: "
                            + "HouseNumber StreetName.");
                    return isValid;
                }
                try
                {
                    isValid = addressArray[1].matches("\\w{2,20}");
                    if (isValid == false)
                    {
                        throw new InvalidAddressException();
                    }
                }
                catch (InvalidAddressException eb)
                {
                    System.out.println("The city name portion is not in the "
                            + "correct form.");
                    return isValid;
                }
                try
                {
                    isValid = addressArray[2].matches("\\w{2}\\s\\d{5}");
                    if (isValid == false)
                    {
                        throw new InvalidAddressException();
                    }
                }
                catch (InvalidAddressException ec)
                {
                    System.out.println("The state and zip portion is not in the"
                            + " correct form.");
                    return isValid;
                }
            }
            else
            {
                isValid = false;
                throw new InvalidAddressException();
            }
        }
        catch (InvalidAddressException e)
        {
            System.out.println("You have entered an invalid "
                    + "address, goodbye.");
            return isValid;
        }
        
        return isValid;
    }
    
    // This method verifies that the address has three sections in the format
    // of: street address, city, state zip. 
    public boolean checkFormat(String sAddress) throws InvalidAddressException
    {
        boolean isValid = true;
        
        addressArray = sAddress.split(",");
        
        if (addressArray.length != 3)
        {
            isValid = false;
            throw new InvalidAddressException("You have entered an invalid "
                    + "address, goodbye.");
        }
        
        return isValid;
    }
    
    // This method verifies that the street address portion has two sections and
    // is of the form: HouseNumber StreetName
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
    
    // This method checks to see if the city entered is larger than 2 characters
    public boolean checkCity(String city) throws InvalidAddressException
    {
        boolean isValid = true;
        
        if (city.length() < 2)
        {
            isValid = false;
            throw new InvalidAddressException("You have entered an invalid city"
                    + ", goodbye.");
        }
        
        
        return isValid;
    }
    
    // This method checks to see if the state is two characters, that the zip
    // code is a number, and that the zip code is 5 digits
    public boolean checkStateZip(String stateZip)
            throws InvalidAddressException
    {
        boolean isValid = true;
        stateZip = stateZip.trim();
        String[] string = stateZip.split(" ");
       
        if (string.length < 2)
        {
           isValid = false;
           throw new InvalidAddressException("You have entered an invalid "
                    + "state, goodbye.");
        }
        
        if (string[0].length() != 2)
        {
            isValid = false;
            throw new InvalidAddressException("You have entered an invalid "
                    + "state, goodbye.");
        }  
        
        if (string[1].length() != 5)
        {
            isValid = false;
            throw new InvalidAddressException("You have entered an invalid "
                    + "zip code, goodbye.");
        } 
          
        return isValid; 
    }
}
