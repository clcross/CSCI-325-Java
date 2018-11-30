/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csu.csci325;

import java.util.Stack;
import sun.invoke.empty.Empty;

/**
 *
 * @author Cameron Cross
 */
public class Compress {
    private static Stack<String> stack;
    public Compress(){
        stack = new Stack<>();
    }
    
    public static String compress(String s){
        
        String finalCompressedString = "";
        String lastElement="";
        char[] charArray = s.toCharArray();
        int elementCount = 0;
        
        
        try{
            if(s == null){
                throw new NullPointerException();
            }
            else if(s.length() == 0){
                throw new NullPointerException();
            }
            for (int i = 0; i < charArray.length; i++){
                char currentElement = charArray[i];
                if (i == 0){
                    stack.push((currentElement+""));
                    continue;
                } 
                else{
                    if ((currentElement + "").equalsIgnoreCase((String)stack.peek())){
                        stack.push(currentElement + "");

                        if(i==charArray.length-1)
                        {
                            while (!stack.isEmpty()){

                                lastElement = (String)stack.pop();
                                elementCount++;
                            }

                            finalCompressedString += lastElement + "" + elementCount;
                        }
                        else{
                           continue; 
                        }
                    }
                    else{
                        while (!stack.isEmpty()){

                            lastElement = (String)stack.pop();
                            elementCount++;
                        }

                        finalCompressedString += lastElement + "" + elementCount;
                        elementCount=0;
                        stack.push(currentElement + "");
                    }
                }
            }
        }
        catch(NullPointerException e){
            System.out.println("Malformed Input");
        }
        
        if (finalCompressedString.length() >= s.length()){
            return s;
        }
        else{
            return finalCompressedString;
        }
    }
}
