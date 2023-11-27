package model;

import java.time.LocalDate;
import java.util.LinkedHashSet;

public class Prova {
	private int idProva;
	private int idTurma;
	private double peso;
	private LocalDate data;
	private TurmaDisciplina turma;
	private LinkedHashSet<Matricula> listaMatricula = new LinkedHashSet<Matricula>();
	
	public Prova(int idProva, int idTurma, double peso, LocalDate data) {
		super();
		this.idProva = idProva;
		this.idTurma = idTurma;
		this.peso = peso;
		this.data = data;
	}
	
	public int getIdProva() {
		return idProva;
	}
	public void setIdProva(int idProva) {
		this.idProva = idProva;
	}
	public int getIdTurma() {
		return idTurma;
	}
	public void setIdTurma(int idTurma) {
		this.idTurma = idTurma;
	}
	public TurmaDisciplina getTurma() {
		return turma;
	}

	public void setTurma(TurmaDisciplina turma) {
		this.turma = turma;
	}

	public LinkedHashSet<Matricula> getListaMatricula() {
		return listaMatricula;
	}

	public void setListaMatricula(LinkedHashSet<Matricula> listaMatricula) {
		this.listaMatricula = listaMatricula;
	}

	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	
	
}
