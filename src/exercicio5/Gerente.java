package exercicio5;

public class Gerente extends Funcionario {

       public Gerente(String nome, Double bonificacao) {
        super(nome, bonificacao);
    }

    @Override
    public Double getBonificacao() {
        return getBonificacao() * 1.15;
    }

}
