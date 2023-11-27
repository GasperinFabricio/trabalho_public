package model;

import java.time.LocalDate;

public class Matricula {
	private LocalDate data;
	private int idMatricula;
	private int idAluno;
	private int idTurma;
	private TurmaDisciplina turma;
	private Aluno aluno;
	
	
	public Matricula(LocalDate data, int idMatricula, Aluno aluno, TurmaDisciplina turma) {
		super();
		this.data = data;
		this.idMatricula = idMatricula;
		this.idAluno = aluno.getId();
		this.idTurma = turma.getId();
	}
	public TurmaDisciplina getTurma() {
		return turma;
	}
	public void setTurma(TurmaDisciplina turma) {
		this.turma = turma;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public int getIdMatricula() {
		return idMatricula;
	}
	public void setIdMatricula(int idMatricula) {
		this.idMatricula = idMatricula;
	}
	public int getIdAluno() {
		return idAluno;
	}
	public void setIdAluno(int idAluno) {
		this.idAluno = idAluno;
	}
	public int getIdTurma() {
		return idTurma;
	}
	public void setIdTurma(int idTurma) {
		this.idTurma = idTurma;
	}
	
}
