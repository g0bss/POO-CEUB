public class Administrador {
    private String nome;

    public Administrador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void gerenciarUsuarios() {
        System.out.println("Gerenciando usuários...");
    }
}