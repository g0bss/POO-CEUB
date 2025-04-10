import java.util.Scanner;

public class SistemaDePedidos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do cliente:");
        String nomeCliente = scanner.nextLine();
        System.out.println("Informe o endereço do cliente:");
        String enderecoCliente = scanner.nextLine();
        System.out.println("Informe o telefone do cliente:");
        String telefoneCliente = scanner.nextLine();

        Cliente cliente = new Cliente(nomeCliente, enderecoCliente, telefoneCliente);

        System.out.println("Informe o nome do vendedor:");
        String nomeVendedor = scanner.nextLine();
        System.out.println("Informe a matrícula do vendedor:");
        String matriculaVendedor = scanner.nextLine();

        Vendedor vendedor = new Vendedor(nomeVendedor, matriculaVendedor);

        Pedido pedido = new Pedido(1, cliente, vendedor);

        String adicionarMaisItens;
        do {
            System.out.println("Informe o código do item:");
            int codigoItem = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Informe a descrição do item:");
            String descricaoItem = scanner.nextLine();
            System.out.println("Informe a quantidade do item:");
            int quantidadeItem = scanner.nextInt();
            System.out.println("Informe o preço unitário do item:");
            double precoUnitarioItem = scanner.nextDouble();

            Item item = new Item(codigoItem, descricaoItem, quantidadeItem, precoUnitarioItem);
            pedido.adicionarItem(item);

            System.out.println("Deseja adicionar mais itens? (s/n)");
            adicionarMaisItens = scanner.next();
        } while (adicionarMaisItens.equalsIgnoreCase("s"));

        System.out.println("Status atual do pedido: " + pedido.getStatus());
        System.out.println("Deseja alterar o status do pedido? (s/n)");
        String alterarStatus = scanner.next();
        if (alterarStatus.equalsIgnoreCase("s")) {
            System.out.println("Informe o novo status do pedido (Em processamento, Enviado, Entregue, Cancelado):");
            scanner.nextLine();
            String novoStatus = scanner.nextLine();
            pedido.setStatus(novoStatus);
        }

        System.out.println("\nResumo do Pedido:");
        System.out.println("Data e Hora de Criação: " + pedido.getDataHoraCriacao());
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Endereço: " + cliente.getEndereco());
        System.out.println("Vendedor: " + vendedor.getNomeCompleto());
        System.out.println("Itens do Pedido:");
        pedido.listarItens();
        System.out.println("Valor Total: R$ " + pedido.calcularValorTotal());
        System.out.println("Status final do pedido: " + pedido.getStatus());

        scanner.close();
    }
}