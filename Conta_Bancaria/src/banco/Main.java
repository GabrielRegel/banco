package banco;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria("Regel", "12345-6", 100000.0);// aqui so fiz um pra entrar como padrão
        int opcao;
        
        do {
            System.out.println("\n========== MENU DA CONTA BANCARIA ==========");
            System.out.println("1. Ver dados da conta");
            System.out.println("2. Depositar valor");
            System.out.println("3. Sacar valor");
            System.out.println("4. Alterar titular");
            System.out.println("5. Sair");
            System.out.print("\nEscolha uma opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcao) {
                case 1:
                    conta.mostrarDados();
                    break;
                    
                case 2:
                    System.out.print("Digite o valor para depósito: ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                    
                case 3:
                    System.out.print("Digite o valor para saque: ");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                    
                case 4:
                    System.out.print("Digite o novo nome do titular: ");
                    String novoTitular = scanner.nextLine();
                    conta.setTitular(novoTitular);
                    System.out.println("Titular alterado com sucesso!");
                    break;
                    
                case 5:
                    System.out.println("Saindo do sistema...");
                    break;
                    
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
            
        } while (opcao != 5);
        
        scanner.close();
    }
}