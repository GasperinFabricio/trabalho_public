package model;

import java.util.LinkedHashSet;

public class Aluno {
	private int cpf;
	private int idAluno;
	private String nome;
	private int idade;
	private String endereco;
	private int telefone;
	private LinkedHashSet<TurmaDisciplina> listaTurma = new LinkedHashSet<TurmaDisciplina>();
	
	private static LinkedHashSet<Aluno> alunos = new LinkedHashSet<Aluno>();
	
	public Aluno(int cpf, int id, String nome, int idade, String endereco, int telefone) {
		super();
		this.cpf = cpf;
		this.idAluno = id;
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	public void inserirDados(int cpf, int id, String nome, int idade, String endereco, int telefone) throws AlreadyExistException {
		Aluno a = new Aluno(cpf, id, nome, idade, endereco ,telefone);
		
		if(alunos.contains(a)) {
			throw new AlreadyExistException();
		} else {
			alunos.add(a);
		}
	}
	public int getCpf() {
		return cpf;
	}
	public int getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(int idAluno) {
		this.idAluno = idAluno;
	}

	public LinkedHashSet<TurmaDisciplina> getListaTurma() {
		return listaTurma;
	}

	public void setListaTurma(LinkedHashSet<TurmaDisciplina> listaTurma) {
		this.listaTurma = listaTurma;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getId() {
		return idAluno;
	}
	public void setId(int id) {
		this.idAluno = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	
}
