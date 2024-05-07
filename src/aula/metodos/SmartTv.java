package aula.metodos;

public class SmartTv {
    boolean ligada = false;
    int canal = 10;
    int volume = 50;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void baixarVolume() {
        volume--;
    }

    public void passarCanal(int novoCanal) {
        this.canal = novoCanal;
    }

    public void passarCanal() {
        this.canal++;
    }


    public void voltarCanal(int novoCanal) {
        this.canal = novoCanal;
    }

    public void voltarCanal() {
        this.canal--;
    }

}
