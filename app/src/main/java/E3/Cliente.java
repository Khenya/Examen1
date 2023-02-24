package E3;

public class Cliente {
    public static void main(String[] args) {
        IElementos tenis = new CreatorTenis().create();
        tenis.create();
        tenis.showInfo();

        IElementos pelotaFutbol = new CreatorPelotaFutbol().create();
        pelotaFutbol.create();
        pelotaFutbol.showInfo();
        
        IElementos camiseta = new CreatorCamiseta().create();
        camiseta.create();
        camiseta.showInfo();

        IElementos shorts = new CreatorShorts().create();
        shorts.create();
        shorts.showInfo();

        IElementos medias = new CreatorMedias().create();
        medias.create();
        medias.showInfo();
        
    }
}
