package modelo;

public class Categoria {
    private String codcat;
    private String nomcat;
    private int cantcat;
    private String ubi;
    
    //getters y setters
    public String getNomcat() {
        return nomcat;
    }

    public void setNomcat(String nomcat) {
        this.nomcat = nomcat;
    }
    public int getCantcat() {
        return cantcat;
    }

    public void setCantcat(int cantcat) {
        this.cantcat = cantcat;
    }

    public String getUbi() {
        return ubi;
    }

    public void setUbi(String ubi) {
        this.ubi = ubi;
    }

    public String getCodcat() {
        return codcat;
    }

    public void setCodcat(String codcat) {
        this.codcat = codcat;
    }

}
