package aula02;

public class Aula02 {
    static void main() {

        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
//        c1.tampada = false;
        c1.carga = "Cheia";
        c1.modelo = "Bic";
        c1.tampar();
//        c1.destampar();
        c1.status();
        c1.rabiscar();
        System.out.println("-------------------------------------");
        Caneta c2 = new Caneta();
        c2.cor = "Verde";
        c2.ponta = 0.5f;
        c2.carga = "Baixo";
        c2.modelo = "Faber 90";
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
}
