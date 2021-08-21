public class CorridaMain {
    public static void main(String[] args) {
        //Ciação dos carros que irao correr
        CarroCorrida carroEquipeVelocidade = new CarroCorrida();
        CarroCorrida carroEquipeTrapaceiros = new CarroCorrida();

        //Criação dos pilotos de cada equipe
        Piloto pilotoEquipeVelocidade = new Piloto();
        Piloto pilotoEquipeTrapaceiros = new Piloto();

        //Atributos do piloto da equipe velocidade
        pilotoEquipeVelocidade.nome = "Piloto 1";
        pilotoEquipeVelocidade.idade = 25;
        pilotoEquipeVelocidade.habilidade = 75;

        //Atributos do piloto de equipe trapaceiros
        pilotoEquipeTrapaceiros.nome = "Piloto 2";
        pilotoEquipeTrapaceiros.idade = 27;
        pilotoEquipeTrapaceiros.habilidade = 65;

        //Os pilotos são colocados nos seus carros
        carroEquipeVelocidade.piloto = pilotoEquipeVelocidade;
        carroEquipeTrapaceiros.piloto = pilotoEquipeTrapaceiros;

        //Identificacao dos carros
        carroEquipeVelocidade.numeroIdenticacao = 1;
        carroEquipeTrapaceiros.numeroIdenticacao = 2;

        //carros ligados
        carroEquipeVelocidade.ligar();
        carroEquipeTrapaceiros.ligar();

        //inicia a corrida
        carroEquipeVelocidade.acelerar();
        carroEquipeTrapaceiros.acelerar();

        carroEquipeVelocidade.acelerar();
        carroEquipeTrapaceiros.acelerar();

        carroEquipeVelocidade.acelerar();
        carroEquipeTrapaceiros.velocidadeAtual = 200.0;

        System.out.println(carroEquipeTrapaceiros.velocidadeAtual);
        System.out.println(carroEquipeVelocidade.velocidadeAtual);
    }
    static class CarroCorrida{
        //Estado
        Integer numeroIdenticacao;
        Double velocidadeAtual = 0.0;
        Double velocidadeMaxima = 100.0;
        Piloto piloto;

        //Comportamento
        void ligar()
        {
            System.out.println("VREUMmmmmmm");
        }
        void desligar()
        {
            System.out.println("MMMmmmm....");
        }
        void acelerar()
        {
            System.out.println("1 "+velocidadeAtual);
            System.out.println("2 "+piloto.habilidade);

            velocidadeAtual += 10 + piloto.habilidade * 0.1;
            if (velocidadeAtual > velocidadeMaxima)
            {
                velocidadeAtual = velocidadeMaxima;
            }
        }
        void frear(Integer intensidadeFreada)
        {
            if(intensidadeFreada > 100) {
                intensidadeFreada = 100;
            }else if(intensidadeFreada < 0)
            {
                intensidadeFreada = 0;
            }
            velocidadeAtual -= intensidadeFreada*0.25;

            if(velocidadeAtual < 0)
            {
                velocidadeAtual = 0.0;
            }
        }
    }
    static class Piloto {
        String nome;
        Integer idade;
        Integer habilidade;
    }
}
