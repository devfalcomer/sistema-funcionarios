package academy.devdojo.maratonajava.controledecargo.test;

import academy.devdojo.maratonajava.controledecargo.dominio.Cargo;
import academy.devdojo.maratonajava.controledecargo.dominio.Funcionario;
import academy.devdojo.maratonajava.controledecargo.dominio.Gerente;

public class ControleDeCargoTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Falcom", 4000000, Cargo.GERENTE);
        System.out.println(gerente);
    }
}
