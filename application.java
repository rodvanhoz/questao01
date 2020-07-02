package questao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Integer s1;
		int qtdeAlunos = 0;

		List<Integer> notas = new ArrayList<>();

		do {

			System.out.println("Quantidade de alunos: ");
			qtdeAlunos = sc.nextInt();
		} while (qtdeAlunos != 0  && qtdeAlunos > 60);

		for (int i = 1; i <= qtdeAlunos; i++) {
			System.out.println("Digite a nota do aluno " + i);
			s1 = sc.nextInt();
			notas.add(s1);
		}

		for (Integer nota : notas) {
			System.out.println(calculaNota(nota));
		}

		sc.close();

	}

	private static int calculaNota(Integer nota) {

		int novaNota = nota;

		if (nota <= 38)
			return novaNota;

		if ((novaNota % 5) <= 3)
			while ((novaNota % 5) != 0) {
				novaNota++;

			}

		return novaNota;

	}

}
