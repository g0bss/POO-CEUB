class Item {
    private int codigo;
    private String descricao;
    private int quantidade;
    private double precoUnitario;

    public Item(int codigo, String descricao, int quantidade, double precoUnitario) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public double getValorTotal() {
        return quantidade * precoUnitario;
    }

    public String getDescricao() {
        return descricao;
    }
}
