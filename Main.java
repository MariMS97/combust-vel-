import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BombaCombustivel bomba = new BombaCombustivel("Gasolina", 5.49, 1000.0);
        double valorTotalAbastecido = 0;

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Abastecer por valor");
            System.out.println("2. Abastecer por litro");
            System.out.println("3. Alterar valor do litro");
            System.out.println("4. Alterar tipo de combustível na bomba");
            System.out.println("5. Alterar quantidade de combustível na bomba");
            System.out.println("6. Ver quantidade de combustível disponível");
            System.out.println("7. Ver total abastecido");
            System.out.println("8. Sair");

            int opcao = scanner.nextInt();
            if (opcao == 8) {
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Informe o valor a ser abastecido: R$ ");
                    double valor = scanner.nextDouble();
                    bomba.abastecerPorValor(valor);
                    valorTotalAbastecido += valor;
                    break;
                case 2:
                    System.out.print("Informe a quantidade de litros a ser abastecida: ");
                    double litros = scanner.nextDouble();
                    bomba.abastecerPorLitro(litros);
                    valorTotalAbastecido += litros * bomba.getValorLitro();  // Uso do getter
                    break;
                case 3:
                    System.out.print("Informe o novo valor do litro: R$ ");
                    double novoValor = scanner.nextDouble();
                    bomba.alterarValor(novoValor);
                    break;
                case 4:
                    System.out.print("Informe o novo tipo de combustível: ");
                    String novoTipo = scanner.next();
                    bomba.alterarCombustivel(novoTipo);
                    break;
                case 5:
                    System.out.print("Informe a nova quantidade de combustível na bomba: ");
                    double novaQuantidade = scanner.nextDouble();
                    bomba.alterarQuantidadeCombustivel(novaQuantidade);
                    break;
                case 6:
                    System.out.printf("Quantidade de combustível disponível: %.2f litros%n", bomba.getQuantCombustivel());
                    break;
                case 7:
                    System.out.printf("Valor total abastecido: R$ %.2f%n", valorTotalAbastecido);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}
