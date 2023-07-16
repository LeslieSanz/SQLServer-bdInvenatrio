/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author lesly
 */
public class Producto {
    //producto
    private String codpro;
    private String despro;
    private String stkpro;
    
    
    //categoria
    private String nomcat;
    private int cantcat;
    
    
    //ubicacion

    
    
    //getters y setters
    public String getNomcat() {
        return nomcat;
    }

    public void setNomcat(String nomcat) {
        this.nomcat = nomcat;
    }



    public String getCodpro() {
        return codpro;
    }

    public void setCodpro(String codpro) {
        this.codpro = codpro;
    }

    public String getDespro() {
        return despro;
    }

    public void setDespro(String despro) {
        this.despro = despro;
    }

    public String getStkpro() {
        return stkpro;
    }

    public void setStkpro(String stkpro) {
        this.stkpro = stkpro;
    }

    public int getCantcat() {
        return cantcat;
    }

    public void setCantcat(int cantcat) {
        this.cantcat = cantcat;
    }

}
