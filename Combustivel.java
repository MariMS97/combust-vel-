import java.util.Scanner;
class BombaCombustivel {
    private String tipoCombustivel;
    private double valorLitro;
    private double quantCombustivel;


    public BombaCombustivel(String tipoCombustivel, double valorLitro, double quantCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorLitro = valorLitro;
        this.quantCombustivel = quantCombustivel;
    }

    public void abastecerPorValor(double valor) {
        double litrosAbastecidos = valor / valorLitro;
        if (litrosAbastecidos <= quantCombustivel) {
            quantCombustivel -= litrosAbastecidos;
            System.out.printf("Foram abastecidos %.2f litros de %s%n", litrosAbastecidos, tipoCombustivel);
        } else {
            System.out.println("Quantidade de combustível insuficiente na bomba.");
        }
    }

    public void abastecerPorLitro(double litros) {
        if (litros <= quantCombustivel) {
            double valorAPagar = litros * valorLitro;
            quantCombustivel -= litros;
            System.out.printf("Valor a ser pago: R$%.2f%n", valorAPagar);
        } else {
            System.out.println("Quantidade de combustível insuficiente na bomba.");
        }
    }

    public void alterarValor(double novoValor) {
        valorLitro = novoValor;
        System.out.printf("O valor do litro foi alterado para: R$%.2f%n", valorLitro);
    }

    public void alterarCombustivel(String novoTipo) {
        tipoCombustivel = novoTipo;
        System.out.printf("O tipo de combustível foi alterado para: %s%n", tipoCombustivel);
    }

    public void alterarQuantidadeCombustivel(double novaQuant) {
        quantCombustivel = novaQuant;
        System.out.printf("A quantidade de combustível disponível foi alterada para: %.2f litros%n", quantCombustivel);
    }

    public double getQuantCombustivel() {
        return quantCombustivel;
    }

    public double getValorLitro() {
        return valorLitro;
    }
}

