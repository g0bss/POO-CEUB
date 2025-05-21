public class Professor {
    private String nome;
    private String matricula;

    public Professor(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public void cadastrarAtividade(Atividade atividade) {
        System.out.println("Atividade cadastrada: " + atividade.getTitulo());
    }

    public void lancarNota(Aluno aluno, Atividade atividade, double nota) {
        aluno.receberNota(nota);
    }
}
