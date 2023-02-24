package E3;

public class CreatorMedias extends CreatorElementos{

    @Override
    public IElementos create() {
        Medias medias = new Medias();
        medias.setColor("amarillas");
        medias.setGarantia("1 mes");
        medias.setTamano("42");
        return medias;
    }
}
