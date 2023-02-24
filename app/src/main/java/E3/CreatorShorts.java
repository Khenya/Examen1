package E3;

public class CreatorShorts extends CreatorElementos{

    @Override
    public IElementos create() {
        Shorts short1 = new Shorts();
        short1.setColor("plomo");
        short1.setGarantia("1 año");
        short1.setTamano("S");
        return short1;
    }
}
