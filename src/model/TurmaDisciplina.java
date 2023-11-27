package model;
import java.time.LocalTime;
import java.util.LinkedHashSet;
public class TurmaDisciplina {
	private int id;
	private String turno;
	private String diaSemana;
	private LocalTime horaInicio;
	private LocalTime horaFim;
	private Professor professor;
	private LinkedHashSet<Aluno> listaAluno = new LinkedHashSet<Aluno>();
	private Disciplina disciplina;

	private static LinkedHashSet<TurmaDisciplina> turmas = new LinkedHashSet<TurmaDisciplina>();
	
	public TurmaDisciplina(int id, String turno, String diaSemana, LocalTime horaInicio, LocalTime horaFim) {
		super();
		this.id = id;
		this.turno = turno;
		this.diaSemana = diaSemana;
		this.horaInicio = horaInicio;
		this.horaFim = horaFim;
	}
	
	public void cadastrarTurma(int id, String turno, String diaSemana, LocalTime horaInicio, LocalTime horafim) throws AlreadyExistException {
		TurmaDisciplina t = new TurmaDisciplina(id, turno, diaSemana, horaInicio, horafim);
		
		if(turmas.contains(t)) {
			throw new AlreadyExistException();
		} else {
			turmas.add(t);
		}
	}
	
	public TurmaDisciplina selecionarTurma(TurmaDisciplina t) throws Exception {
		if(turmas.contains(t)) {
			return t;
		} else {
			throw new Exception("It does not exist.");
		}
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTurno() {
		return turno;
	}
	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public LinkedHashSet<Aluno> getListaAluno() {
		return listaAluno;
	}

	public void setListaAluno(LinkedHashSet<Aluno> listaAluno) {
		this.listaAluno = listaAluno;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}
	public String getDiaSemana() {
		return diaSemana;
	}
	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}
	public LocalTime getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(LocalTime horaInicio) {
		this.horaInicio = horaInicio;
	}
	public LocalTime getHoraFim() {
		return horaFim;
	}
	public void setHoraFim(LocalTime horaFim) {
		this.horaFim = horaFim;
	}
}
