package E3;

public class CreatorMedias extends CreatorElementos{

    @Override
    public IElementos create() {
        Camiseta camiseta = new Camiseta();
        camiseta.setColor("amarillas");
        camiseta.setGarantia("1 mes");
        camiseta.setTamano("42");
        return camiseta;
    }
}
