import javax.xml.crypto.Data;
import java.text.DecimalFormat;

public class exercicio5Main {
    public static void main(String[] args) {
        //Ciação da nova pessoa
        Pessoa pessoaImc = new Pessoa();

        //Atributos do piloto da equipe velocidade
        pessoaImc.nome = "Rafael";
        pessoaImc.peso = 106.0;
        pessoaImc.altura = 1.80;

        pessoaImc.getIMC();

    }
    static class Pessoa {
        String nome;
        String cpf;
        String rg;
        Double altura;
        Double peso;
        Data dataNascimento;
        String filiacao;

        // Comportamento
        void getIMC()
        {
            Double resultado = 0.0;
            resultado = peso / (altura * altura);
            System.out.println(new DecimalFormat("#,##0.00").format(resultado));
        }
    }
}
