import java.util.ArrayList;
import java.util.List;

public class Fornecedor extends Pessoa {
    private String cnpj;
    private List<String> produtosFornecidos;

    public Fornecedor(int id, String nome, String email, String telefone, String endereco, String cnpj) {
        super(id, nome, email, telefone, endereco);
        this.cnpj = cnpj;
        this.produtosFornecidos = new ArrayList<>();
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public List<String> getProdutosFornecidos() {
        return produtosFornecidos;
    }
    public void adicionarProduto(String produto) {
        this.produtosFornecidos.add(produto);
    }
}