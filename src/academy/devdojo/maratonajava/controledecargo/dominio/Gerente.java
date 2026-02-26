package academy.devdojo.maratonajava.controledecargo.dominio;

public class Gerente extends Funcionario{
    private final double bonusGerente = 1000;
    public Gerente(String nome, double salarioBase, Cargo cargo) {
        super(nome, salarioBase, cargo);
    }

    @Override
    public final double calcularSalarioFinal(){
        return super.calcularSalarioFinal() + bonusGerente;
    }
}
