package aula.operadores;

public class Operadores {
    double soma = 10.5 + 15.7;
    int subtracao = 113 - 25;
    int multiplicacao = 20 * 7;
    int divisao = 15 / 3;
    int modulo = 18 % 3;
    double resultado = (10 * 7) + (20 / 4);
    boolean variavel = true;

    public void incrementarSoma() {
        soma++; // Incremento
    }

    public void decrementarSubtracao() {
        subtracao--; // Decremento
    }

    public void negarBoolean() {
        variavel = !variavel; // Negação
    }

    public static void main(String[] args) {
        int a, b;
        a = 5;
        b = 6;

        String resultado = a == b ? "Verdadeiro" : "Falso"; // Operador ternário

        System.out.println(resultado);

    }
}
