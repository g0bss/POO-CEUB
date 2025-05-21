import java.util.ArrayList;

public class Aluno {
    private String nome;
    private String turma;
    private ArrayList<Double> notas = new ArrayList<>();

    public Aluno(String nome, String turma) {
        this.nome = nome;
        this.turma = turma;
    }

    public void receberNota(double nota) {
        notas.add(nota);
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public String getNome() {
        return nome;
    }

    public String getTurma() {
        return turma;
    }
}