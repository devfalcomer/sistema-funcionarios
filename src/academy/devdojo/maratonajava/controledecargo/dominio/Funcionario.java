package academy.devdojo.maratonajava.controledecargo.dominio;

public class Funcionario {
    private String nome;
    private double salarioBase;
    private Cargo cargo;

    public Funcionario(String nome, double salarioBase, Cargo cargo) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        double salarioFinal = calcularSalarioFinal();

        String status = (salarioFinal > 10000)
                ? "Salário alto"
                : "Salário dentro da média";

        return "Nome: " + nome +
                "\nCargo: " + cargo +
                "\nSalário Base: " + salarioBase +
                "\nSalário Final: " + salarioFinal +
                "\n" + status +
                "\n----------------------------";
    }

    public double calcularSalarioFinal(){
        double bonus = cargo.calcularBonus(salarioBase);
        return salarioBase + bonus;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
