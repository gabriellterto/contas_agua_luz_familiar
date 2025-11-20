package calculadora.agua;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculadoraAgua {

    public List<Float> coletarDados() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor total da conta de água: R$ ");
        float valorConta = scanner.nextFloat();

        List<Integer> diasPorCasaSomado = new ArrayList<>();
        int totalDiasSomados = 0;

        for (int casa = 1; casa <= 3; casa++) {
            System.out.println("-".repeat(30));
            System.out.print("Quantidade de pessoas na Casa " + casa + ": ");
            int qtdPessoas = scanner.nextInt();

            int somaDiasCasa = 0;

            for (int p = 1; p <= qtdPessoas; p++) {
                System.out.print("Dias que a pessoa " + p + " ficou na Casa " + casa + ": ");
                int dias = scanner.nextInt();
                somaDiasCasa += dias;
                totalDiasSomados += dias;  
            }

            diasPorCasaSomado.add(somaDiasCasa);
        }

        float valorPorDia = valorConta / totalDiasSomados;

        List<Float> valorPorCasa = new ArrayList<>();

        for (int diasDaCasa : diasPorCasaSomado) {
            float valorCasa = diasDaCasa * valorPorDia;
            valorPorCasa.add(valorCasa);
        }

        return valorPorCasa;
    }

    public void mostrarResultado(List<Float> valorPorCasa) {
        System.out.println("-".repeat(30));
        System.out.println("Resultado:");

        for (int i = 0; i < valorPorCasa.size(); i++) {
            float arredondado = Math.round(valorPorCasa.get(i) * 100) / 100f;
            System.out.println("Casa " + (i + 1) + ": R$ " + arredondado);
        }
    }

    // Método auxiliar para testes unitários
    public List<Float> calcularValorPorCasa(float valorConta, List<Integer> diasPorCasa, int totalDias) {
        float valorPorDia = valorConta / totalDias;

        List<Float> valorPorCasa = new ArrayList<>();

        for (int diasDaCasa : diasPorCasa) {
            float valorCasa = diasDaCasa * valorPorDia;
            valorPorCasa.add(valorCasa);
        }

        return valorPorCasa;
    }
}
