/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;

/**
 *
 * @author salasur101
 */
public class Tarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /**
     * @param args the command line arguments
     */
       String mi_segunda_variable = "tarea en casa gracias" ;
       System.out.println(mi_segunda_variable) ;
       
       int num1 , num2 , num3 , num4,result;
       
       num1= 3 ;
               
       num2= 5 ;
               
       num3= 8 ;
       
       num4= 6 ;
     
       result  = num1 + num2 * num3 - num4 ;

        System.out.println(result);
        
        Tarea.suma(num1, num2);
        
        Tarea.resta(num3, num4);
    }
    
    public static void suma(int num1 , int num2)      
    {     
       num1 += num2 ;

       //num3 += num4 ; 

    System.out.println(num1) ;

   
    }
       
    public static void resta (int num3 , int num4) 
   {
      //num1 -= num2 ;

      num3 -= num4 ; 
      
      System.out.println(num3);
    }
} 


