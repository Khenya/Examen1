package E4;

import java.util.ArrayList;
import java.util.List;

public class Contrato {
    private String costo;
    private String empresa;
    private List<String> listaCanales = new ArrayList<>();

    public String getCosto() {
        return costo;
    }
    public void setCosto(String costo) {
        this.costo = costo;
    }
    public String getEmpresa() {
        return empresa;
    }
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    public List<String> getListaCanales() {
        return listaCanales;
    }
    public void setListaCanales(List<String> listaCanales) {
        this.listaCanales = listaCanales;
    }

    public void showInfo() {
        System.out.println("Costo: "+costo);
        System.out.println("Empresa: "+empresa);
        System.out.println("Lista de canales: " );
        listaCanales.forEach((i)-> System.out.println(i));
    }
}
