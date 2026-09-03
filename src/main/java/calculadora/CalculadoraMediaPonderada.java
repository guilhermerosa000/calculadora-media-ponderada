/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author potofgreed
 */
public class CalculadoraMediaPonderada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int qtdAlunos = 0;

        double mediaGeral = 0.0;
        double media = 0.0;

        while (true) {

            System.out.print("Digite o nome do aluno: ");
            String nomeAluno = scanner.nextLine();

            if ("-1".equals(nomeAluno)) {
                break;
            }

            qtdAlunos++;

            System.out.print("Digite a nota do 1º Bimestre: ");
            double nota1 = scanner.nextDouble();

            System.out.print("Digite a nota do 2° Bimestre: ");
            double nota2 = scanner.nextDouble();

            scanner.nextLine();

            media = (nota1 * 2 + nota2 * 3) / 5;

            mediaGeral += media;

        }

        mediaGeral = mediaGeral / qtdAlunos;

        System.out.println("Quantidade de alunos cadastrados: " + qtdAlunos);
        System.out.printf("Média Geral: %.2f\n", mediaGeral);
    }
}
