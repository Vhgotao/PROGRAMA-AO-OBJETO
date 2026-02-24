package EXERCICIO02;

import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pacientes pacientes = new Pacientes();

        double[] alvo;

        System.out.println("Nome -->");
        pacientes.nome = sc.next();
        System.out.println("Idade -->");
        pacientes.idade = sc.nextInt();

        System.out.println("Frequencia maxima: " + pacientes.frequenciaMaxima());
        alvo = pacientes.frequenciaAlvo();
        System.out.println("Inicio da frequencia alvo " + alvo[0]);
        System.out.println("Fim da frequencia alvo " + alvo[1]);
    }
}
