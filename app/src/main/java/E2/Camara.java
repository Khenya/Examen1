package E2;

public class Camara {
    private int foco;
    private String lente;

    public Camara(int foco, String lente) {
        this.foco = foco;
        this.lente = lente;
    }
    public int getFoco() {
        return foco;
    }
    public void setFoco(int foco) {
        this.foco = foco;
    }

    public String getLente() {
        return lente;
    }
    public void setLente(String lente) {
        this.lente = lente;
    }

    public void showInfo(){
        System.out.println("Foco: "+foco);
        System.out.println("Lente: "+lente);
    }
}
