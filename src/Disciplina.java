public class Disciplina {
    private String nome, turno;
    private int cargaHoraria;
    private Aluno aluno;
    private Professor professor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void cadastrarAluno(Aluno aluno){
        this.aluno = aluno;
    }

    public void ministrarDisciplina(Professor professor){
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "nome='" + nome + '\'' +
                ", turno='" + turno + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                ", aluno=" + aluno +
                ", professor=" + professor +
                '}';
    }
}
