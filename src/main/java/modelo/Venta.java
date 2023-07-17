/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author esther
 */
public class Venta {
     public int mes;
    public int cantidad;
    public double total;
    public String Lmes(){
        String vec[]={"","Ene","Feb","Mar","Abr","May","Jun",
            "Jul","Ago","Set","Oct","Nov","Dic"};
        return vec[getMes()];
    }
    
    //Para la factura
    private String codven;
    private String fecVen;
    private String nomCli;
    private String nomVen;
    
    private double opGrav;
    private double IGV;
    private double impT;

    /**
     * @return the mes
     */
    public int getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * @return the fecVen
     */
    public String getFecVen() {
        return fecVen;
    }

    /**
     * @param fecVen the fecVen to set
     */
    public void setFecVen(String fecVen) {
        this.fecVen = fecVen;
    }

    /**
     * @return the nomCli
     */
    public String getNomCli() {
        return nomCli;
    }

    /**
     * @param nomCli the nomCli to set
     */
    public void setNomCli(String nomCli) {
        this.nomCli = nomCli;
    }

    /**
     * @return the nomVen
     */
    public String getNomVen() {
        return nomVen;
    }

    /**
     * @param nomVen the nomVen to set
     */
    public void setNomVen(String nomVen) {
        this.nomVen = nomVen;
    }

    /**
     * @return the opGrav
     */
    public double getOpGrav() {
        return opGrav;
    }

    /**
     * @param opGrav the opGrav to set
     */
    public void setOpGrav(double opGrav) {
        this.opGrav = opGrav;
    }

    /**
     * @return the IGV
     */
    public double getIGV() {
        return IGV;
    }

    /**
     * @param IGV the IGV to set
     */
    public void setIGV(double IGV) {
        this.IGV = IGV;
    }

    /**
     * @return the impT
     */
    public double getImpT() {
        return impT;
    }

    /**
     * @param impT the impT to set
     */
    public void setImpT(double impT) {
        this.impT = impT;
    }

    /**
     * @return the codven
     */
    public String getCodven() {
        return codven;
    }

    /**
     * @param codven the codven to set
     */
    public void setCodven(String codven) {
        this.codven = codven;
    }
    
}
