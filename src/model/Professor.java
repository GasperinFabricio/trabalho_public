package model;
import java.util.LinkedHashSet;

public class Professor {
	private int cpf;
	private int idProfessor;
	private String nome;
	private String especialidade;
	private String endereco;
	private int telefone;
	
	//Turma de disciplina aqui
	private LinkedHashSet<TurmaDisciplina> arrayTurma = new LinkedHashSet<TurmaDisciplina>();
	
	private static LinkedHashSet<Professor> professores = new LinkedHashSet<Professor>();
	
	public Professor(int cpf, int id, String nome, String especialidade, String endereco, int telefone) {
		super();
		this.cpf = cpf;
		this.idProfessor = id;
		this.nome = nome;
		this.especialidade = especialidade;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	public String selecionarDisciplina(Professor p) throws AlreadyExistException {
		if(professores.contains(p)) {
			return p.toString();
		} else {
			throw new AlreadyExistException();
		}
	}
	
	public void alocarProfessor(Professor p, TurmaDisciplina t) {
		t.setProfessor(p);
	}
	
	public int getIdProfessor() {
		return idProfessor;
	}

	public void setIdProfessor(int idProfessor) {
		this.idProfessor = idProfessor;
	}

	public LinkedHashSet<TurmaDisciplina> getArrayTurma() {
		return arrayTurma;
	}

	public void setArrayTurma(LinkedHashSet<TurmaDisciplina> arrayTurma) {
		this.arrayTurma = arrayTurma;
	}

	public int getCpf() {
		return this.cpf;
	}
	
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public int getId() {
		return this.idProfessor;
	}
	
	public void setId(int id) {
		this.idProfessor = id;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEspecialidade() {
		return this.especialidade;
	}
	
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public int getTelefone() {
		return this.telefone;
	}
	
	public void setTelefone(int telefone ) {
		this.telefone = telefone;
	}
}
