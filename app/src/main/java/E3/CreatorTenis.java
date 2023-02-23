package E3;

public class CreatorTenis extends CreatorElementos{

    @Override
    public IElementos create() {
        Camiseta camiseta = new Camiseta();
        camiseta.setColor("azul");
        camiseta.setGarantia("2 año");
        camiseta.setTamano("41");
        return camiseta;
    }
}
