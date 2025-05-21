import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do professor: ");
        String nomeProfessor = sc.nextLine();
        System.out.print("Digite a matrícula do professor: ");
        String matriculaProfessor = sc.nextLine();
        Professor professor = new Professor(nomeProfessor, matriculaProfessor);

        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = sc.nextLine();
        System.out.print("Digite a turma do aluno: ");
        String turmaAluno = sc.nextLine();
        Aluno aluno = new Aluno(nomeAluno, turmaAluno);

        System.out.print("Digite o título da atividade: ");
        String tituloAtividade = sc.nextLine();
        System.out.print("Digite a descrição da atividade: ");
        String descricaoAtividade = sc.nextLine();
        Atividade atividade = new Atividade(tituloAtividade, descricaoAtividade);

        professor.cadastrarAtividade(atividade);

        System.out.print("Digite a nota para a atividade: ");
        double nota = sc.nextDouble();
        professor.lancarNota(aluno, atividade, nota);

        System.out.println("\nRelatório do aluno:");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Notas: " + aluno.getNotas());

        sc.close();
    }
}