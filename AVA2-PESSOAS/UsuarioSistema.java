public class UsuarioSistema extends Pessoa {
    private String nivelAcesso;
    private String senha;

    public UsuarioSistema(int id, String nome, String email, String telefone, String endereco, String nivelAcesso, String senha) {
        super(id, nome, email, telefone, endereco);
        this.nivelAcesso = nivelAcesso;
        this.senha = senha;
    }
    public String getNivelAcesso() {
        return nivelAcesso;
    }
    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
}