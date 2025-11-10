package calculadora.menu;
import java.util.Scanner;


public class MenuPrincipal {
    public void exibirMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-".repeat(30));
        System.out.println("MENU PRINCIPAL");
        System.out.println("-".repeat(30));
        System.out.println("1 - Calculadora de Água");
        System.out.println("2 - Calculadora de Luz");
        System.out.println("0 - Sair");
        System.out.println("-".repeat(30));
        System.out.print("Escolha: ");
        int escolha = scanner.nextInt();
    }
}
