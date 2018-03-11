/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto;

import com.sun.org.apache.bcel.internal.generic.RETURN;

/**
 *
 * @author kmilo
 */
public class carro {
    
   String modelo ;   

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public String info2 ()
    {      
    return getModelo ();
    }
    
    
    
    
    
}

