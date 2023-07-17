/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author esther
 */
public class Detalle {
     private String codPro;
    private String descripcion;
    private int cantDeta;
    private double prePro;
    private double subtotal;

    /**
     * @return the codPro
     */
    public String getCodPro() {
        return codPro;
    }

    /**
     * @param codPro the codPro to set
     */
    public void setCodPro(String codPro) {
        this.codPro = codPro;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the cantDeta
     */
    public int getCantDeta() {
        return cantDeta;
    }

    /**
     * @param cantDeta the cantDeta to set
     */
    public void setCantDeta(int cantDeta) {
        this.cantDeta = cantDeta;
    }

    /**
     * @return the prePro
     */
    public double getPrePro() {
        return prePro;
    }

    /**
     * @param prePro the prePro to set
     */
    public void setPrePro(double prePro) {
        this.prePro = prePro;
    }

    /**
     * @return the subtotal
     */
    public double getSubtotal() {
        return subtotal;
    }

    /**
     * @param subtotal the subtotal to set
     */
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
}
