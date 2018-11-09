/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csu.csci325;

import java.util.Scanner;

/**
 *
 * @author ccross190196
 */
public class CardValidator
{
    private int numType;
    private String stringType;
    private int numAttempts;
    CardValidator card1;
    public CardValidator()
    {
        numType = 0;
        stringType = "";
        numAttempts = 0;
    }
    
    // this method obtains a string value entered by the user
    public static String getString()
    {
        Scanner string = new Scanner(System.in);
        String input = string.nextLine();
        
        return input;
    }
    
    // this method obtains an int value entered by the user
    public static int getInt()
    {
        Scanner num = new Scanner(System.in);
        int input = num.nextInt();
        
        return input;
    }
    
    // This method checks the int that the user entered to verify that either 
    // a 1,2,3 or 4 was entered
    public boolean checkType(int iType) throws MaxAttemptsExceededException
    {
        boolean match = true;
        
        numAttempts++;
        
        if (numAttempts > 2)
        {
            throw new MaxAttemptsExceededException();
        }
        
        switch (iType)
        {
            case 1:
                numType = 1;
                break;
            case 2:
                numType = 2;
                break;
            case 3:
                numType = 3;
                break;
            case 4:
                numType = 4;
                break;
            default:
                match = false;
                break;
        }
        return match;
    }
    
    // This method checks the string that the user entered to verify that either:
    // American Express, Visa, Mastercard, or Discover was entered
    public boolean checkType(String sType) throws MaxAttemptsExceededException
    {
        boolean match = true;
        
        numAttempts++;
        
        if (numAttempts > 2)
        {
            throw new MaxAttemptsExceededException();
        }
        
        // The comparison is not case sensitive and any spaces are trimmed from
        // the front or end of what the user enters
        switch (sType.toLowerCase().trim())
        {
            case "american express":
                stringType = "American Express";
                break;
            case "visa":
                stringType = "Visa";
                break;
            case "mastercard":
                stringType = "Mastercard";
                break;
            case "discover":
                stringType = "Discover";
                break;
            default:
                match = false;
                break;
        }
        return match;       
    }
    
    // This method returns the number of times the validation of the card type
    // has been attempted for this instance of the CardValidation object
    public int getAttempts()
    {
        return numAttempts;
    }
    
    // This method looks to see if the card type matches up with the 
    // restrictions put in place
    public static boolean checkNum(String sCardNum, String sCardType, 
            int iCardType)
    {
        boolean isValid = true;
        
        sCardType = sCardType.toLowerCase().trim();
        
        if (iCardType >= 1 && iCardType <= 4)
        {
           switch (iCardType)
            {
                case 1:
                    isValid = sCardNum.startsWith("3") && 
                            sCardNum.length() == 15;
                    break;
                case 2:
                    isValid = sCardNum.startsWith("4") && 
                            sCardNum.length() == 16;
                    break;
                case 3:
                    isValid = sCardNum.startsWith("5") && 
                            sCardNum.length() == 16;
                    break;
                case 4:
                    isValid = sCardNum.startsWith("6") && 
                            sCardNum.length() == 16;
                    break;
                default:
                    isValid = false;
                    break;
            }
        }
        else if (sCardType.equals("american express"))
        {
            isValid = sCardNum.startsWith("3") && sCardNum.length() == 15;
        }
        else if (sCardType.equals("visa"))
        {
            isValid = sCardNum.startsWith("4") && sCardNum.length() == 16;
        }
        else if (sCardType.equals("mastercard"))
        {
            isValid = sCardNum.startsWith("5") && sCardNum.length() == 16;
        }
        else if (sCardType.equals("discover"))
        {
            isValid = sCardNum.startsWith("6") && sCardNum.length() == 16;
        }
        else
        {
            isValid = false;
        }
        
        return isValid;
    }
}
