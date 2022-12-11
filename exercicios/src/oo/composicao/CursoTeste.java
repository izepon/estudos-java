package oo.composicao;

public class CursoTeste {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno("Zyra");
		Aluno aluno2 = new Aluno("Namis");
		Aluno aluno3 = new Aluno("Leona");

		Curso curso1 = new Curso("Como não ser fedida");
		Curso curso2 = new Curso("Dorminhocas");
		Curso curso3 = new Curso("Ataque ao caco macaco");

		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);

		curso2.adicionarAluno(aluno3);

		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);

		for (Aluno aluno : curso1.alunos) {
			System.out.println("Curso 1: " + curso1.nome);
			System.out.println("Nome do aluno(a): " + aluno.nome);
			System.out.println();
		}

		System.out.println(aluno1.cursos.get(0).alunos);

		Curso cursoEncontradoCurso = aluno1.obterCursoPorNome("Ataque ao caco macaco");

		if (cursoEncontradoCurso != null) {
			System.out.println();
			System.out.println(cursoEncontradoCurso.nome);
			System.out.println(cursoEncontradoCurso.alunos);
		}
	}
}
