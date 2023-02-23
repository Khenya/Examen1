package E2;

public class Celular implements IFabrica {
    private String modelo;
    private String tamaño;
    private int peso;
    private int imei;
    private String origen;
    private Camara camara;
    public Celular(Camara camara) {
        this.camara = camara;
    }

    public Camara getCamara() {
        return camara;
    }

    public void setCamara(Camara camara) {
        this.camara = camara;
    }

    

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getImei() {
        return imei;
    }

    public void setImei(int imei) {
        this.imei = imei;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    @Override
    public Celular clone() {
        Celular clone = new Celular(this.camara);
        clone.setTamaño(this.getTamaño());
        clone.setImei(this.getImei());
        clone.setModelo(this.getModelo());
        clone.setOrigen(this.getOrigen());
        clone.setPeso(this.getPeso());
        
        return clone;
    }

    public void showInfo(){
        System.out.println("**********Celular**********");
        System.out.println("imei: "+imei);
        System.out.println("Tamaño: "+tamaño);
        System.out.println("Modelo: "+modelo);
        System.out.println("Origen: "+origen);
        System.out.println("Peso: "+peso);
        camara.showInfo();
    }
}
