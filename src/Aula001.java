public class Aula001 {
    public static void main(String[] args) {
        final String BR = "Brasil"; // Const
        String primeiroNome = "Rafael";
        String segundoNome = "Torales";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
