package aula03;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta = 0.5f;
    protected int carga;
    private boolean tampada;

    public void status() {
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("Cor da caneta: " + this.cor);
        System.out.println("Ponta da caneta: " + this.ponta);
        System.out.println("Carga da caneta: " + this.carga);
        System.out.println("Modelo da caneta: " + this.modelo);
    }

    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Não posso rabiscar!");
        } else {
            System.out.println("Estou a rabiscar!");
        }
    }

    public void tampar() {

        this.tampada = true;
    }

    public void destampar() {

        this.tampada = false;
    }
}
