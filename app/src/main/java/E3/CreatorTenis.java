package E3;

public class CreatorTenis extends CreatorElementos{

    @Override
    public IElementos create() {
        Tenis tenis = new Tenis();
        tenis.setColor("azul");
        tenis.setGarantia("2 año");
        tenis.setTamano("41");
        return tenis;
    }
}
