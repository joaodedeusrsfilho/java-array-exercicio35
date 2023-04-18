package aula19_Arrays;

import java.util.Scanner;

public class Exercicio35 {

	public static void main(String[] args) {
		/*
		 * Criar um vetor A com 10 elementos inteiros. Escreva um programa que imprima
		 * cada elemento do vetor A e a relação de todos os divisores do respectivo
		 * elemento
		 */
		Scanner ler = new Scanner(System.in);
		int[] vetorA = new int[10];

		for (int x = 0; x < vetorA.length; x++) {
			System.out.println("Entre com o valor da posicao: " + x);
			vetorA[x] = ler.nextInt();
		}
		for (int x = 0; x < vetorA.length; x++) {
			System.out.println("Analisando divisao de: " + vetorA[x]);
			for (int y = 1; y < vetorA[x]; y++) {
				if (vetorA[x] % y == 0) {
					System.out.println("Por " + y + " E divisivel");
				}
			}
		}
	}
}
