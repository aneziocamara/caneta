package aula02;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    String carga;
    boolean tampada;

    void status() {
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("Cor da caneta: " + this.cor);
        System.out.println("Ponta da caneta: " + this.ponta);
        System.out.println("Carga da caneta: " + this.carga);
        System.out.println("Modelo da caneta: " + this.modelo);
    }

    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Não posso rabiscar!");
        } else {
            System.out.println("Estou a rabiscar!");
        }
    }

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }
}
