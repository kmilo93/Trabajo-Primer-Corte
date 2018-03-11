/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto;

/**
 *
 * @author kmilo
 */
public class Auto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    veiculo obj = new veiculo ();
    
    obj.setColor("gris");
    obj.setPlaca("CZO254");
    obj.setNumero_llantas("4");
    obj.setModelo("2009");
    
    
    System.out.println(obj.getInformacion());
           
   
       
       
            
         
        

// TODO code application logic here
    }
    
}
