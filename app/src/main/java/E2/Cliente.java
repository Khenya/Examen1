package E2;

public class Cliente {
    public static void main(String[] args) {
        
        Celular object1 = new Celular(new Camara(10,"5mp"));
        object1.setImei(10001);
        object1.setPeso(60);
        object1.setOrigen("Bolivia");
        object1.setModelo("A1");
        object1.setTamaño("20 cm");

        object1.showInfo();

        Celular celular2 = object1.clone();
        celular2.setImei(10002);

        Celular celular3 = object1.clone();
        celular3.setImei(10003);

        Celular celular4 = object1.clone();
        celular4.setImei(10004);
        
        Celular celular5 = object1.clone();
        celular5.setImei(10005);
        
        Celular celular6 = object1.clone();
        celular6.setImei(10006);
        
        System.out.println("********************");
        celular2.showInfo();
        celular3.showInfo();
        celular4.showInfo();
        celular5.showInfo();
        celular6.showInfo();
    }
}
