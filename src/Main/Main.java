package Main;

import java.util.ArrayList;
import java.util.List;

import ClassesDeEstudo.Curso;
import ClassesDeEstudo.Datas;
import ClassesDeEstudo.J8Lambda;

public class Main {

	public static void main(String[] args) {
		J8Lambda.OrdenarString();
		
		System.out.println("\n\nTestes com Stream : \n");
		
		List<Curso> cursos = new ArrayList<>();
		cursos = Curso.PopulaExemploCurso();
		System.out.println(cursos);
		
		Curso.ExemplosStream(cursos);
		System.out.println("\n\n=========Estudo de Date=======");
		
		Datas.EstudoDatas();
		
	}
}