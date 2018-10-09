package Esercizi5;

import java.util.Random;

public class Auto {

    Random r = new Random();
    private int peso;
    private int velocità;
    private String modello;

    public Auto(String modello) {
        this.peso = 1000 + r.nextInt(1001);
        this.velocità = 150 + r.nextInt(151);
        this.modello = modello;
    }

    public int getPeso() {
        return peso;
    }

    public int getVelocità() {
        return velocità;
    }

    public String getModello() {
        return modello;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setVelocità(int velocità) {
        this.velocità = velocità;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "peso=" + peso +
                ", velocità=" + velocità +
                ", modello='" + modello + '\'' +
                '}';
    }
}
