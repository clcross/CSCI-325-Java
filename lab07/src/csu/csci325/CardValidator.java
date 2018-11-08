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
    public CardValidator()
    {
        numType = 0;
        stringType = "";
        numAttempts = 0;
    }
    
    public static String getString()
    {
        Scanner string = new Scanner(System.in);
        String input = string.nextLine();
        
        return input;
    }
    
    public static int getInt()
    {
        Scanner num = new Scanner(System.in);
        int input = num.nextInt();
        
        return input;
    }
    
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
    
    public boolean checkType(String sType) throws MaxAttemptsExceededException
    {
        boolean match = true;
        
        sType = sType.toLowerCase();
        sType = sType.trim();
        
        numAttempts++;
        
        if (numAttempts > 2)
        {
            throw new MaxAttemptsExceededException();
        }
        
        switch (sType)
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
    
    public int getAttempts()
    {
        return numAttempts;
    }
    
    public static boolean checkNum(String sCardNum, String sCardType, 
            int iCardType)
    {
        boolean isValid = false;
        sCardType = sCardType.toLowerCase();
        sCardType = sCardType.trim();
        
        if (iCardType < 1 || iCardType > 4)
        {
           switch (sCardType)
            {
                case "american express":
                    isValid = sCardNum.startsWith("3") && 
                            sCardNum.length() == 15;
                    break;
                case "visa":
                    isValid = sCardNum.startsWith("4") && 
                            sCardNum.length() == 16;
                    break;
                case "mastercard":
                    isValid = sCardNum.startsWith("5") && 
                            sCardNum.length() == 16;
                    break;
                case "discover":
                    isValid = sCardNum.startsWith("6") && 
                            sCardNum.length() == 16;
                    break;
                default:
                    break;
            } 
        }
        else if (sCardType.isEmpty())
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
                    break;
            }
        }
        
        return isValid;
    }
}
