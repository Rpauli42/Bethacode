import java.text.DecimalFormat;

public class animalMain {
    public static void main(String[] args) {

        //Ciação da nova animal
        Animal animal = new Animal();

        //Atributos
        animal.nome = "Leão";
        animal.peso = 100.0;
        animal.altura = 1.00;
        animal.som = "Miauuu";

        animal.emitirSom();

        animal.pular(10.0);

    }

    public static class Animal {
        String nome;
        Double peso;
        Double altura;
        String som;

        // comportamento
        public void emitirSom()
        {
            System.out.println("O animal faz:"+ som);
        }

        public void pular(Double alturaPulo)
        {
            System.out.println("O animal pula nesta " + alturaPulo + " altura");
        }
    }
}
