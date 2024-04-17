

package com.mycompany.exceptions;


public class Exceptions {

    public static void main(String[] args) throws Exception {  //OJOOOOOOOOOO CON EL THROWS 
         // String name =0; //esto es una excepciòn, ya que es un error 
        
        
        
        
        
        
        Calculator calculator = new Calculator (); 
        
        try{
            double result = calculator.division(12, 0); //operacion que tenemos guardada en la variable result
            System.out.println("Resultado: " + result);
        } catch (Exception exception){
            System.out.println("operacion ilegal");
            System.out.println(exception.getMessage()); 
            
        } 
    }
}
