public class Vendedor extends Empregado {
    private double comissao;
    private double metaVendas;

    public Vendedor(int id, String nome, String email, String telefone, String endereco, String matricula, String cargo, double salario, double comissao, double metaVendas) {
        super(id, nome, email, telefone, endereco, matricula, cargo, salario);
        this.comissao = comissao;
        this.metaVendas = metaVendas;
    }
    public double getComissao() {
        return comissao;
    }
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    public double getMetaVendas() {
        return metaVendas;
    }
    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }
}