package academy.devdojo.maratonajava.controledecargo.dominio;

public enum Cargo {
    GERENTE{
        @Override
        public double calcularBonus(double salarioBase) {
            return salarioBase * 0.2;
        }
    },
    DESENVOLVEDOR{
        @Override
        public double calcularBonus(double salarioBase) {
            return salarioBase * 0.1;
        }
    },
    ESTAGIARIO{
        @Override
        public double calcularBonus(double salarioBase) {
            return salarioBase * 0.05;
        }
    };

    public abstract double calcularBonus(double salarioBase);
}
