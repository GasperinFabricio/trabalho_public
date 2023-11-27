package model;

public class Resultado {
	private int idResultado;
	private double nota;
	private int idMatricula;
	private int idProva;
	private Matricula matricula;
	private Prova prova;
	
	// Isso faz sentido?
	public Resultado(int idResultado, double nota, Matricula matricula, Prova prova) {
		super();
		this.idResultado = idResultado;
		this.nota = nota;
		this.idMatricula = matricula.getIdMatricula();
		this.idProva = prova.getIdProva();
		this.matricula = matricula;
		this.prova = prova;
	}
	// Ou isso é melhor? (⌐■_■)
	/*
	public Resultado(int idResultado, double nota, int idMatricula, int idProva) {
		super();
		this.idResultado = idResultado;
		this.nota = nota;
		this.idMatricula = idMatricula;
		this.idProva = idProva;
	}
	*/
	public int getIdResultado() {
		return idResultado;
	}
	public void setIdResultado(int idResultado) {
		this.idResultado = idResultado;
	}
	public double getNota() {
		return nota;
	}
	public Matricula getMatricula() {
		return matricula;
	}
	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
	}
	public Prova getProva() {
		return prova;
	}
	public void setProva(Prova prova) {
		this.prova = prova;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public int getIdMatricula() {
		return idMatricula;
	}
	public void setIdMatricula(int idMatricula) {
		this.idMatricula = idMatricula;
	}
	public int getIdProva() {
		return idProva;
	}
	public void setIdProva(int idProva) {
		this.idProva = idProva;
	}
	
	
	
}
