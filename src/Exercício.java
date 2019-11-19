public class Exercício {
    public static void main (String [] args){
        Integer umNumeroA = 2;
        Double umNumeroB = 2.1;
        String umaCadeiadeTexto = "Hello, World!";

        System.out.println(umNumeroA, umNumeroB, umaCadeiadeTexto);
        System.out.println (soma(umNumeroA = umNumeroB));
    }
    public static int soma (Integer umNumeroA, int umNumeroB){
        return umNumeroA + umNumeroB;
    }
    public static int diferenca (Integer umNumeroA, int umNumeroB) {
        return umNumeroA - umNumeroB;
    }
}
