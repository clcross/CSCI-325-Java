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
public class Palindrome {
    
    public Palindrome(){
        
    }
    
    public static boolean checkPal(String s){
        boolean retVal;
        String str;
        String temp = s.trim();
        temp = s.toUpperCase();
        str = temp.replaceAll("[A-Z]", "");
        retVal = isIt(str);
        return retVal;
    }
    
    public static boolean isIt(String s){
        int last = s.length() - 1;
        String str;
        boolean retVal = true;
        if(s.length() <= 1 && s.length() >= 0){
            retVal = true;
        }
        else if(s.charAt(0) == s.charAt(last)){
            str = s.substring(1, last);
            retVal = isIt(str);
        }
        else{
            retVal = false;
        }
        return retVal;
    }
}
