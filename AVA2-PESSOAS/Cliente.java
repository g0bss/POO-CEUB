import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {
    private String cpf;
    private List<String> historicoCompras;

    public Cliente(int id, String nome, String email, String telefone, String endereco, String cpf) {
        super(id, nome, email, telefone, endereco);
        this.cpf = cpf;
        this.historicoCompras = new ArrayList<>();
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public List<String> getHistoricoCompras() {
        return historicoCompras;
    }
    public void adicionarCompra(String compra) {
        this.historicoCompras.add(compra);
    }
}