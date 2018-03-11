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
public class veiculo extends carro {
    
String informacion ;

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }
    
    String color , placa , numero_llantas ;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNumero_llantas() {
        return numero_llantas;
    }

    public void setNumero_llantas(String numero_llantas) {
        this.numero_llantas = numero_llantas;
    }

   
 public String informacione () 
 
 {
 
 String informacione;
 informacione = "color " + getColor() + " " + "placa " + getPlaca() + " " + "numero_llantas " + getNumero_llantas() + " " + "modelo " + info2 ();
 
 return informacione;
 }
}
