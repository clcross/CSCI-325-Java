/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csu.csci325;

import java.util.Stack;

/**
 *
 * @author Cameron Cross
 */
public class ConvertExp {
    public ConvertExp(){
        
    }
    
    public static boolean isOperator(String s){
        boolean isO = true;
        try{
            if (s.length() == 1){
                switch (s){ 
                    case "+": 
                          isO = true;
                          break;
                    case "-": 
                          isO = true;
                          break;
                    case "/":
                          isO = true;
                          break;
                    case "*": 
                          isO = true;
                          break;
                    default:
                        isO = false;
                        break;
                }
            }
            else{
            throw new Exception();
            }
        }
        catch(Exception e){
            System.out.println("Malformed Input");
        }
        
        return isO;
    }
    
    public static String preToInfix(String exp){
        Stack<String> s = new Stack<>();
        String infix = null;
        try{
            for (int i = exp.length() - 1; i >= 0; i++){
                String op = exp.substring(i, i+1);
                if (isOperator(op)){ 
                   String valOne = s.pop();
                   String valTwo = s.pop();
                   String convert = "(" + valOne + op + valTwo + ")";
                   s.push(convert); 
                }
                else{
                    s.push(op);
                }
            } 
            infix = s.pop();
        }
        catch(Exception e){
            System.out.println("Malformed Input");
        }

        return infix;
    }
    
    public static String postToInfix(String exp){
        Stack<String> s = new Stack<>();
        String infix = null;
        try{
            for (int i = 0; i < exp.length(); i++){
                String op = exp.substring(i, i+1);
                if (isOperator(op)){ 
                   String valOne = s.pop();
                   String valTwo = s.pop();
                   String convert = "(" + valTwo + op + valOne + ")";
                   s.push(convert); 
                }
                else{
                    s.push(op);
                }
            } 
            infix = s.pop();
        }
        catch(Exception e){
            System.out.println("Malformed Input");
        }

        return infix;
    }
} 
