package E3;

public class CreatorCamiseta extends CreatorElementos{

    @Override
    public IElementos create() {
        Camiseta camiseta = new Camiseta();
        camiseta.setColor("negra");
        camiseta.setGarantia("1 año");
        camiseta.setTamano("S");
        return camiseta;
    }
    
}
