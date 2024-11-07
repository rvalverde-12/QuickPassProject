/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quickpassproject;

/**
 *
 * @author Lipsky
 */
public class Quickpass {
    
    private String filial;
    private String codigo;
    private String placa;
    private String estado;
    
    public Quickpass (String filial, String codigo, String placa, String estado){
        
        this.filial = filial;
        this.codigo = codigo;
        this.placa = placa;
        this.estado = estado;
        
    }
    
    public void setFilial(String filial){
        this.filial = filial;
   
    }   
    
    public String getFilial (String filial) {
        return this.filial;
   
    }
    
    public void setCodigo (String codigo){
        this.codigo = codigo;
    }
     
    public String getCodigo(String codigo){
        return this.codigo;
        
    }
    
    public void setPlaca (String placa) {
        this.placa = placa;
    }
    
    public String getPlaca (String placa){
        return this.placa;
    }
 
    public void setEstado (String estado){
        this.estado = estado;
    }
    
    public String getEstado (String estado) {
        return this.estado;
    }
}

// Prueba Alejandro

    
