package aluno.java.teste;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import escola.java.constantes.StatusAluno;
import escola.java.interfaces.permitirAcesso;
import escola.java.classes.Aluno;
import escola.java.classes.Diretor;
import escola.java.classes.Disciplina;
import escola.java.classes.Secretario;
import escola.java.classesauxiliares.FuncaoAutenticacao;

public class testandoClasseAluno {
	public static void main(String[] args) {

		String login = JOptionPane.showInputDialog("Informe o Login");
		String senha = JOptionPane.showInputDialog("Informe sua Senha");

		permitirAcesso permitirAcesso = new Diretor(login, senha);

		if (new FuncaoAutenticacao(new Secretario(login, senha)).autenticar()) {

			List<Aluno> alunos = new ArrayList<Aluno>();

			/*
			 * É uma lista onde dentro dela temos uma chave que identifica uma sequência de
			 * valores
			 */
			HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

			for (int qtd = 1; qtd <= 3; qtd++) {

				String nome = JOptionPane.showInputDialog("Insira o seu nome: " + qtd + "?");
				/*
				 * String idade = JOptionPane.showInputDialog("Insira a sua idade: "); String
				 * dataNascimento =
				 * JOptionPane.showInputDialog("Insira sua data de nascimento: "); String cpf =
				 * JOptionPane.showInputDialog("Insira seu CPF: "); String nomeDaMae =
				 * JOptionPane.showInputDialog("Insira o nome de sua mãe: "); String
				 * registroGeral =
				 * JOptionPane.showInputDialog("Insira o código do seu registro: ");
				 */

				Aluno aluno1 = new Aluno();
				aluno1.setNome(nome);
				/*
				 * aluno1.setIdade(Integer.valueOf(idade)); aluno1.setNumeroCpf(cpf);
				 * aluno1.setNomeMae(nomeDaMae); aluno1.setDataNascimento(dataNascimento);
				 * aluno1.setRegistroGeral(registroGeral);
				 */

				for (int pos = 1; pos <= 1; pos++) {
					String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + " ?");
					String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + " ?");

					Disciplina disciplina = new Disciplina();
					disciplina.setDisciplina(nomeDisciplina);
					disciplina.setNota(Double.valueOf(notaDisciplina));

					aluno1.getDisciplinas().add(disciplina);

				}

				int removeDisciplina = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");

				if (removeDisciplina == 0) {

					int continuarRemover = 0;
					int posicao = 1;

					while (continuarRemover == 0) {
						String qualDisciplina = JOptionPane
								.showInputDialog("Qual disciplina você quer remover? 1, 2, 3 ou 4?");
						aluno1.getDisciplinas().remove(Integer.valueOf(qualDisciplina).intValue() - posicao);
						posicao++;
						continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar removendo?");
					}

				}

				alunos.add(aluno1);

			}

			maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
			maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

			for (Aluno aluno : alunos) {
				if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.APROVADO)) {
					maps.get(StatusAluno.APROVADO).add(aluno);
				} else if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
					maps.get(StatusAluno.RECUPERACAO).add(aluno);
				} else {
					maps.get(StatusAluno.REPROVADO).add(aluno);
				}

			}

			System.out.println("---------------------------- Lista dos alunos Aprovados ------------------");
			for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
				System.out.println("Nome do aluno: " + aluno.getNome() + " ," + " resultado = "
						+ aluno.getAlunoAprovado() + " com média de: " + aluno.getMediaNota() + " pontos");

			}

			System.out.println("---------------------------- Lista dos alunos em Recuperação ------------------");
			for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
				System.out.println("Nome do aluno: " + aluno.getNome() + " ," + " resultado = "
						+ aluno.getAlunoAprovado() + " com média de: " + aluno.getMediaNota() + " pontos");

			}

			System.out.println("---------------------------- Lista dos alunos Reprovados ------------------");
			for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
				System.out.println("Nome do aluno: " + aluno.getNome() + " ," + " resultado = "
						+ aluno.getAlunoAprovado() + " com média de: " + aluno.getMediaNota() + " pontos");

			}
		} else {
			JOptionPane.showMessageDialog(null, "Acesso negado!");

		}
	}
}
