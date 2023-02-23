package E3;

public class CreatorShorts extends CreatorElementos{

    @Override
    public IElementos create() {
        Camiseta camiseta = new Camiseta();
        camiseta.setColor("plomo");
        camiseta.setGarantia("1 año");
        camiseta.setTamano("S");
        return camiseta;
    }
}
