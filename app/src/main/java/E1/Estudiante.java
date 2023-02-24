package E1;

public class Estudiante {
    private String nombre;
    private String ci;

    
    public Estudiante(String nom, String ci) {
        this.nombre = nom;
        this.ci = ci;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCi() {
        return ci;
    }
    public void setCi(String ci) {
        this.ci = ci;
    }


}
