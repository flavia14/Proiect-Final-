package Project;
import java.sql.*;
interface P {
    public String getNume();
    public String getVarsta();
    public String getMarca();
    public String getSectia();
    public String getDefectiune();
}
public class Project implements P{
    private String nume;
    private String varsta;
    private String marca;
    private String sectia;
    private  String  defectiune;

    public Project(String nume, String varsta, String marca, String sectia, String defectiune) {
        this.nume = nume;
        this.varsta = varsta;
        this.marca = marca;
        this.sectia = sectia;
        this.defectiune = defectiune;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getVarsta() {
        return varsta;
    }

    public void setVarsta(String varsta) {
        this.varsta = varsta;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSectia() {
        return sectia;
    }

    public void setSectia(String sectia) {
        this.sectia = sectia;
    }

    public String getDefectiune() {
        return defectiune;
    }

    public void setDefectiune(String defectiune) {
        this.defectiune= defectiune;
    }

    public static void main(String[] args) throws Exception {



    }

}
