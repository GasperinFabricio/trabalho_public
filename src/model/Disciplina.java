package model;

import java.util.LinkedHashSet;

public class Disciplina {
	private int codigo;
	private String nome;
	private int credito;
	private LinkedHashSet<TurmaDisciplina> turmaDisciplina = new LinkedHashSet<TurmaDisciplina>();
	
	private static LinkedHashSet<Disciplina> disciplinas = new LinkedHashSet<Disciplina>();
	
	public Disciplina(int codigo, String nome, int credito) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.credito = credito;
	}
	
	public String selecionarDisciplina(Disciplina d) throws AlreadyExistException {
		if(disciplinas.contains(d)) {
			return d.toString();
		} else {
			throw new AlreadyExistException();
		}
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCredito() {
		return credito;
	}
	public void setCredito(int credito) {
		this.credito = credito;
	}

	public LinkedHashSet<TurmaDisciplina> getTurmaDisciplina() {
		return turmaDisciplina;
	}

	public void setTurmaDisciplina(LinkedHashSet<TurmaDisciplina> turmaDisciplina) {
		this.turmaDisciplina = turmaDisciplina;
	}
	
	
}
