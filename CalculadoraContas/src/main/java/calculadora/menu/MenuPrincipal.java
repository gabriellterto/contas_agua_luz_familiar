package calculadora.menu;
import java.util.Scanner;
import calculadora.agua.CalculadoraAgua;
import calculadora.luz.CalculadoraLuz;

public class MenuPrincipal {
    public void iniciar() {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            exibirMenu();
            int escolha = scanner.nextInt();

            processarEscolha(escolha);
        }
    }

    public void exibirMenu() {
        System.out.println("-".repeat(30));
        System.out.println("MENU PRINCIPAL");
        System.out.println("-".repeat(30));
        System.out.println("1 - Calculadora de Água");
        System.out.println("2 - Calculadora de Luz");
        System.out.println("0 - Sair");
        System.out.println("-".repeat(30));
        System.out.print("Escolha: ");
    }

    public void processarEscolha(int escolha) {
        switch (escolha) {
            case 1:
                CalculadoraAgua calcAgua = new CalculadoraAgua();
                calcAgua.mostrarResultado(calcAgua.coletarDados());
                break;
        
            case 2:
                CalculadoraLuz calcLuz = new CalculadoraLuz();
                calcLuz.mostrarResultado(calcLuz.coletarDados());
                break;
            case 0:
                System.out.println("-".repeat(30));
                System.out.println("Saindo...");
                System.exit(0);
                break;
            
            default:
                System.out.println("Opção inválida. Tente novamente.");
                break;
        }
    }
}
