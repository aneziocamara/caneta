package aula03;

public class Aula02 {
    static void main() {

        Caneta c1 = new Caneta();
        c1.modelo = "BIC Cristal";
        c1.cor = "Azul";
//        c1.ponta = 0.5f;
        c1.carga = 80;
//        c1.tampada = false;
        c1.rabiscar();
        c1.tampar();
        c1.destampar();
        c1.status();

    }
}
