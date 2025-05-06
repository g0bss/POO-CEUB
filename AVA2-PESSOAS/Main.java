import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastro de Cliente");
        System.out.print("ID: ");
        int idCliente = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Nome: ");
        String nomeCliente = scanner.nextLine();
        System.out.print("Email: ");
        String emailCliente = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefoneCliente = scanner.nextLine();
        System.out.print("Endereço: ");
        String enderecoCliente = scanner.nextLine();
        System.out.print("CPF: ");
        String cpfCliente = scanner.nextLine();
        Cliente cliente = new Cliente(idCliente, nomeCliente, emailCliente, telefoneCliente, enderecoCliente, cpfCliente);
        System.out.println("Cliente cadastrado com sucesso!");

        // Copia e cola para poupar tempo
        System.out.println("\nCadastro de Fornecedor");
        System.out.print("ID: ");
        int idFornecedor = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nome: ");
        String nomeFornecedor = scanner.nextLine();
        System.out.print("Email: ");
        String emailFornecedor = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefoneFornecedor = scanner.nextLine();
        System.out.print("Endereço: ");
        String enderecoFornecedor = scanner.nextLine();
        System.out.print("CNPJ: ");
        String cnpjFornecedor = scanner.nextLine();
        Fornecedor fornecedor = new Fornecedor(idFornecedor, nomeFornecedor, emailFornecedor, telefoneFornecedor, enderecoFornecedor, cnpjFornecedor);
        System.out.println("Fornecedor cadastrado com sucesso!");

        System.out.println("\nCadastro de Empregado");
        System.out.print("ID: ");
        int idEmpregado = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nome: ");
        String nomeEmpregado = scanner.nextLine();
        System.out.print("Email: ");
        String emailEmpregado = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefoneEmpregado = scanner.nextLine();
        System.out.print("Endereço: ");
        String enderecoEmpregado = scanner.nextLine();
        System.out.print("Matrícula: ");
        String matriculaEmpregado = scanner.nextLine();
        System.out.print("Cargo: ");
        String cargoEmpregado = scanner.nextLine();
        System.out.print("Salário: ");
        double salarioEmpregado = scanner.nextDouble();
        scanner.nextLine();
        Empregado empregado = new Empregado(idEmpregado, nomeEmpregado, emailEmpregado, telefoneEmpregado, enderecoEmpregado, matriculaEmpregado, cargoEmpregado, salarioEmpregado);
        System.out.println("Empregado cadastrado com sucesso!");

        System.out.println("\nCadastro de Vendedor");
        System.out.print("ID: ");
        int idVendedor = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nome: ");
        String nomeVendedor = scanner.nextLine();
        System.out.print("Email: ");
        String emailVendedor = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefoneVendedor = scanner.nextLine();
        System.out.print("Endereço: ");
        String enderecoVendedor = scanner.nextLine();
        System.out.print("Matrícula: ");
        String matriculaVendedor = scanner.nextLine();
        System.out.print("Cargo: ");
        String cargoVendedor = scanner.nextLine();
        System.out.print("Salário: ");
        double salarioVendedor = scanner.nextDouble();
        System.out.print("Comissão: ");
        double comissaoVendedor = scanner.nextDouble();
        System.out.print("Meta de vendas: ");
        double metaVendas = scanner.nextDouble();
        scanner.nextLine();
        Vendedor vendedor = new Vendedor(idVendedor, nomeVendedor, emailVendedor, telefoneVendedor, enderecoVendedor, matriculaVendedor, cargoVendedor, salarioVendedor, comissaoVendedor, metaVendas);
        System.out.println("Vendedor cadastrado com sucesso!");

        System.out.println("\nCadastro de Usuário do Sistema");
        System.out.print("ID: ");
        int idUsuario = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nome: ");
        String nomeUsuario = scanner.nextLine();
        System.out.print("Email: ");
        String emailUsuario = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefoneUsuario = scanner.nextLine();
        System.out.print("Endereço: ");
        String enderecoUsuario = scanner.nextLine();
        System.out.print("Nível de acesso: ");
        String nivelAcesso = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();
        UsuarioSistema usuario = new UsuarioSistema(idUsuario, nomeUsuario, emailUsuario, telefoneUsuario, enderecoUsuario, nivelAcesso, senha);
        System.out.println("Usuário do sistema cadastrado com sucesso!");

        scanner.close();
    }
}