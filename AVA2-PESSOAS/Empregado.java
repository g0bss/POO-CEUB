public class Empregado extends Pessoa {
    private String matricula;
    private String cargo;
    private double salario;

    public Empregado(int id, String nome, String email, String telefone, String endereco, String matricula, String cargo, double salario) {
        super(id, nome, email, telefone, endereco);
        this.matricula = matricula;
        this.cargo = cargo;
        this.salario = salario;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}