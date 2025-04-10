import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Pedido {
    private int idPedido;
    private Cliente cliente;
    private Vendedor vendedor;
    private List<Item> itens;
    private String dataHoraCriacao;
    private String status;

    public Pedido(int idPedido, Cliente cliente, Vendedor vendedor) {
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.itens = new ArrayList<>();
        this.dataHoraCriacao = obterDataHoraAtual();
        this.status = "Em processamento";
    }

    private String obterDataHoraAtual() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return sdf.format(new Date());
    }

    public String getDataHoraCriacao() {
        return dataHoraCriacao;
    }

    public void setStatus(String novoStatus) {
        this.status = novoStatus;
    }

    public String getStatus() {
        return status;
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public double calcularValorTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.getValorTotal();
        }
        return total;
    }

    public void listarItens() {
        for (Item item : itens) {
            System.out.println("Item: " + item.getDescricao() + " | Valor: R$ " + item.getValorTotal());
        }
    }
}