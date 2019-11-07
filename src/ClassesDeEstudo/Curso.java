package ClassesDeEstudo;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	private String nome;
	private int qtdAlunos;

	public Curso(String nome, int qtdAlunos) {
		super();
		this.nome = nome;
		this.qtdAlunos = qtdAlunos;
	}

	public Curso() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQtdAlunos() {
		return qtdAlunos;
	}

	public void setQtdAlunos(int qtdAlunos) {
		this.qtdAlunos = qtdAlunos;
	}

	public static List<Curso> PopulaExemploCurso() {
		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso("Curso Java",140));
		cursos.add(new Curso("Curso Python",84));
		cursos.add(new Curso("Curso Javascript",92));
		cursos.add(new Curso("Curso C#",35));
		cursos.add(new Curso("Curso .NET",48));
		return cursos;
	}

	public static void ExemplosStream(List<Curso> cursos) {
		System.out.println("\nCursos com mais de 50 alunos : ");
		cursos.stream()
		   .filter(c -> c.getQtdAlunos() > 50).forEach(c -> System.out.print(c));
	}

	@Override
	public String toString() {
		return (nome + ", Alunos=" + qtdAlunos + "\n");
	}
	
	
}