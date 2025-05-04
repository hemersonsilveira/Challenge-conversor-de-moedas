import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int opcao = 0;
        double valorConvertido;
        Cambio cambio = new Cambio();
        Scanner scanner = new Scanner(System.in);

        while (opcao != 7){
            String menu = """
                    1) Dólar =>> Peso Argentino
                    2) Peso Argentino =>> Dólar
                    3) Dólar =>> Real brasileiro
                    4) Real brasileiro =>> Dólar
                    5) Dólar =>> Peso colombiano
                    6) Peso colombiano =>> Dólar
                    7) Sair
                    
                    Escolha uma opção válida:
                    """;

            System.out.println("*************************************************");
            System.out.println("Seja bem-vindo/a ao conversor de moedas");
            System.out.println();
            System.out.println(menu);
            System.out.println("*************************************************");
            opcao = scanner.nextInt();

            if (opcao == 7) {
                System.out.println("Encerrando o programa...");
                break;
            }

            System.out.println("Digite o valor que deseja converter: ");
            double valor = scanner.nextDouble();

            switch (opcao) {
                case 1:
                    valorConvertido = cambio.converterMoedas("USD", "ARS", valor);
                    System.out.println("Valor " + valor + " [USD] corresponde ao valor final de =>> " + valorConvertido + " [ARS]");
                    break;

                case 2:
                    valorConvertido = cambio.converterMoedas("ARS", "USD", valor);
                    System.out.println("Valor " + valor + " [ARS] corresponde ao valor final de =>> " + valorConvertido + " [USD]");
                    break;

                case 3:
                    valorConvertido = cambio.converterMoedas("USD", "BRL", valor);
                    System.out.println("Valor " + valor + " [USD] corresponde ao valor final de =>> " + valorConvertido + " [BRL]");
                    break;

                case 4:
                    valorConvertido = cambio.converterMoedas("BRL", "USD", valor);
                    System.out.println("Valor " + valor + " [BRL] corresponde ao valor final de =>> " + valorConvertido + " [USD]");
                    break;

                case 5:
                    valorConvertido = cambio.converterMoedas("USD", "COP", valor);
                    System.out.println("Valor " + valor + " [USD] corresponde ao valor final de =>> " + valorConvertido + " [COP]");
                    break;

                case 6:
                    valorConvertido = cambio.converterMoedas("COP", "USD", valor);
                    System.out.println("Valor " + valor + " [COP] corresponde ao valor final de =>> " + valorConvertido + " [USD]");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

            System.out.println();
        }

        scanner.close();
    }
}
