public class orientacaoMain {
    public static void main(String[] args) {
        Documento documento1;

        documento1 = new Documento();

        documento1.codigo = 123456;
        documento1.nome = "Alfredo";
        documento1.foto = "Img1.png";
        documento1.dataNascimento = "20/05/1990";

        System.out.println("Código do documento: " + documento1.codigo);
    }
        static class Documento {
            // Estado
            String foto;
            String nome;
            Integer codigo;
            String dataNascimento;
        }

}
