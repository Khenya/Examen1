package E3;

public class CreatorPelotaFutbol extends CreatorElementos{

    @Override
    public IElementos create() {
        PelotaFutbol pelotaFutbol = new PelotaFutbol();
        pelotaFutbol.setColor("negra");
        pelotaFutbol.setGarantia("1 año");
        pelotaFutbol.setTamano("S");
        return pelotaFutbol;
    }
}
