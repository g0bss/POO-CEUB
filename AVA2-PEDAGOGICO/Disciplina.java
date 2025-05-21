public class Disciplina {
    private String nome;
    private Turma turma;

    public Disciplina(String nome, Turma turma) {
        this.nome = nome;
        this.turma = turma;
    }

    public String getNome() {
        return nome;
    }

    public Turma getTurma() {
        return turma;
    }
}