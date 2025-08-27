package Moedas;

public class ConversorMoeda implements ConversorFinanceiro{
    private String nome;
    private double cotacaoReal;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCotacaoReal() {
        return cotacaoReal;
    }

    public void setCotacaoReal(double cotacaoReal) {
        this.cotacaoReal = cotacaoReal;
    }

    @Override
    public double converterDolarParaReal(double ValorDolar) {
        return (ValorDolar * getCotacaoReal()) ;

    }



}