package Moedas;

public class Main {
    public static void main(String[] args) {
        ConversorMoeda real = new ConversorMoeda();
        real.setNome("real");
        real.setCotacaoReal(5.45);
        System.out.println("a conversao de real para dolar é :");

        System.out.println(real.converterDolarParaReal(10));
    }
}
