package escola.java.classes;

import java.util.List;

import javax.swing.JOptionPane;

public class TestandoClassesFilhas {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		aluno.setNome("Eduardo");
		aluno.setIdade(20);

		Diretor diretor = new Diretor();
		diretor.setNome("Pedro");
		diretor.setIdade(70);

		Secretario secretario = new Secretario();
		secretario.setNome("Alehandro");
		secretario.setIdade(35);

		System.out.println(aluno.getNome());
		System.out.println(diretor.getNome());
		System.out.println(secretario.getNome());

		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgAlunoMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());

		System.out.println("Salário é igual a: " + aluno.salario());
		System.out.println("Salário é igual a: " + diretor.salario());
		System.out.println("Salário é igual a: " + secretario.salario());

		teste(aluno);
		teste(diretor);
		teste(secretario);
	}

	public static void teste(Pessoa pessoa) {
		System.out.println("Nome: " + pessoa.getNome() + " e seu salário é de: " + pessoa.salario());
	}

}
