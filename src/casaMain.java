public class casaMain {
    public static void main(String[] args) {
        Casa casa = new Casa("Rua Tal",1,2, 2,20.5);
                casa.setMetragem(135.0);
        if(casa.getMetragem() > 120.0){
            System.out.println("Minha casa");
        }
        System.out.println(casa);
    }
    public static class Casa {
        private String endereco;
        private Integer numeroSalas;
        private Integer numeroQuartos;
        private Integer NumeroBanheiros;
        private Double metragem;

        public Casa(String endereco, Integer numeroSalas, Integer numeroQuartos, Integer numeroBanheiros, Double metragem) {
            this.endereco = endereco;
            this.numeroSalas = numeroSalas;
            this.numeroQuartos = numeroQuartos;
            this.NumeroBanheiros = numeroBanheiros;
            this.metragem = metragem;
        }

        public String getEndereco() {
            return endereco;
        }

        public Integer getNumeroSalas() {
            return numeroSalas;
        }

        public Integer getNumeroQuartos() {
            return numeroQuartos;
        }

        public Integer getNumeroBanheiros() {
            return NumeroBanheiros;
        }

        public Double getMetragem() {
            return metragem;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        public void setNumeroSalas(Integer numeroSalas) {
            this.numeroSalas = numeroSalas;
        }

        public void setNumeroQuartos(Integer numeroQuartos) {
            this.numeroQuartos = numeroQuartos;
        }

        public void setNumeroBanheiros(Integer numeroBanheiros) {
            NumeroBanheiros = numeroBanheiros;
        }

        public void setMetragem(Double metragem) {
            this.metragem = metragem;
        }

        @Override
        public String toString() {
            return "Casa{" +
                    "endereco='" + endereco + '\'' +
                    ", numeroSalas=" + numeroSalas +
                    ", numeroQuartos=" + numeroQuartos +
                    ", NumeroBanheiros=" + NumeroBanheiros +
                    ", metragem=" + metragem +
                    '}';
        }
    }
}
