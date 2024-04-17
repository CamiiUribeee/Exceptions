
package com.mycompany.exceptions;

public class Calculator {

    public Calculator() {
    }
    
    public double division(double a, double b) throws Exception{
        if(b !=0){
            return a/b; 
        }
        //return -1;  //esto lo hice con el proposito de quitarme de encima el infinity que me sale al ejecutar, ya que tengo en el main un numero dividido entre cero, (lo cual el computador me lo arroja como infinity) 
        
        
        throw new Exception("No es posible dividir entre cero"); 
    
    
    
    
    }    
}
