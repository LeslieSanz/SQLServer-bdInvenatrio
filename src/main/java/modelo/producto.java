/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author lesly
 */
public class producto {
    private String codpro;
    private String despro;
    private double prepro;
    private int stkpro;
    private Categoria categoria;
    private Proveedor proveedor;

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

    public double getPrepro() {
        return prepro;
    }

    public void setPrepro(double prepro) {
        this.prepro = prepro;
    }

    public int getStkpro() {
        return stkpro;
    }

    public void setStkpro(int stkpro) {
        this.stkpro = stkpro;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
    
}
