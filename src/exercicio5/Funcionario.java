package exercicio5;

public abstract class Funcionario {

    private String nome;
    private Double bonificacao;

    public Funcionario(String nome, Double bonificacao) {
        this.nome = nome;
        this.bonificacao = bonificacao;
    }

    public String getNome() {
        return nome;
    }

    public Double getBonificacao() {
        return bonificacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setBonificacao(Double bonificacao) {
        this.bonificacao = bonificacao;
    }
}
