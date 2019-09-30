package aluno.java.teste;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		// int mediaAluno = 70;
		// String nome = "Eduardo";

		int numero = 0;
		// PRIMEIRO VERIFICA DEPOIS EXECUTA
		while (numero <= 3) {
			System.out.println("O número atual é: " + numero);
			numero++;
		}

		int numero2 = 0;
		do { // Primeiro executa e depois verifica
			System.out.println("O número atual é: " + numero2);
			numero2++;
		} while (numero2 <= 60);

	}

}
