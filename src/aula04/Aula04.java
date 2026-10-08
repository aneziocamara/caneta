package aula04;

public class Aula04 {
    static void main() {
        Caneta c1 = new Caneta("NIC","Amarela",0.4f);
        Caneta c2 = new Caneta("FABER","Laranja",1.0f);
        c1.status();
        System.out.println("Tenho uma caneta "+c1.getModelo()+" de ponta "+ c1.getPonta()+".");

        c2.status();
        System.out.println("Tenho uma caneta "+c2.getModelo()+" de ponta "+ c2.getPonta()+".");
    }
}
