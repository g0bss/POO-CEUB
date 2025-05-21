import java.util.ArrayList;

public class Turma {
    private String nome;
    private Professor professor;
    private ArrayList<Aluno> alunos = new ArrayList<>();

    public Turma(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }
}