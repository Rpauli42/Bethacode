/*public class desafio05 {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("1","Rafael Pauli","Rua dos Ipês", "(48) 991223798");
        PessoaFisica pessoaFisica = new PessoaFisica("2","Rafael Pitz","Rua dos Aflitos","(48) 991102667","02002944903","3395504","M");
        PessoaJuridica pessoaJuridica = new PessoaJuridica("3","Rafael dos Anjos - ME","Rua dos Esquecidos","(48) 991111026","00456865000167","999999999","94");
        Cliente cliente = new Cliente("4","Rafael Invest","Rua Desconhecida","Sem telefone","02002944903","33305504","M",5000.0,500.0);
        Funcionario funcionario = new Funcionario("5","Rafael Silva","Rua Sem Saída","(48) 3431 1211","02002944903","33305504","M",5000.00,3500.00);
        //Fornecedor fornecedor = new Fornecedor("6","Rafael Já Foi","Beco sem Saída","","00456865000167","999999999","94","Rafael Pauli","Teste de observação");


        cliente.aumentarLimite();
        cliente.diminuirLimite();
        funcionario.aplicarDissidio();


        System.out.println(pessoaFisica);
        System.out.println(pessoaJuridica);


        }

    public static class Pessoa {
        private String id;
        private String nome;
        private String endereco;
        private String telefone;

        public Pessoa(String id, String nome, String endereco, String telefone) {
            this.id = id;
            this.nome = nome;
            this.endereco = endereco;
            this.telefone = telefone;
        }

        public String getId() {
            return id;
        }

        public String getNome() {
            return nome;
        }

        public String getEndereco() {
            return endereco;
        }

        public String getTelefone() {
            return telefone;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }



    }
    public static class PessoaFisica extends Pessoa {
        private String cpf;
        private String rg;
        private String sexo;

        public PessoaFisica(String id, String nome, String endereco, String telefone, String cpf, String rg, String sexo) {
            super(id, nome, endereco, telefone);
            this.cpf = cpf;
            this.rg = rg;
            this.sexo = sexo;
        }

        public String getCpf() {
            return cpf;
        }

        public String getRg() {
            return rg;
        }

        public String getSexo() {
            return sexo;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public void setRg(String rg) {
            this.rg = rg;
        }

        public void setSexo(String sexo) {
            this.sexo = sexo;
        }

        @Override
        public String toString() {
            return "PessoaFisica{" +
                    "cpf='" + cpf + '\'' +
                    ", rg='" + rg + '\'' +
                    ", sexo='" + sexo + '\'' +
                    '}';
        }

        public void getPessoaDocumentoPrincipal(){
            return get
        }

    }
    public static class PessoaJuridica extends Pessoa {
        private String cnpj;
        private String inscricaoEstadual;
        private String cnae;

        public PessoaJuridica(String id, String nome, String endereco, String telefone, String cnpj, String inscricaoEstadual, String cnae) {
            super(id, nome, endereco, telefone);
            this.cnpj = cnpj;
            this.inscricaoEstadual = inscricaoEstadual;
            this.cnae = cnae;
        }

        public String getCnpj() {
            return cnpj;
        }

        public String getInscricaoEstadual() {
            return inscricaoEstadual;
        }

        public String getCnae() {
            return cnae;
        }

        public void setCnpj(String cnpj) {
            this.cnpj = cnpj;
        }

        public void setInscricaoEstadual(String inscricaoEstadual) {
            this.inscricaoEstadual = inscricaoEstadual;
        }

        public void setCnae(String cnae) {
            this.cnae = cnae;
        }

        @Override
        public String toString() {
            return "PessoaJuridica{" +
                    "cnpj='" + cnpj + '\'' +
                    ", inscricaoEstadual='" + inscricaoEstadual + '\'' +
                    ", cnae='" + cnae + '\'' +
                    '}';
        }
    }
    public static class Cliente extends PessoaFisica {
        private Double limiteCrediario;
        private Double limiteUtilizado;

        public Cliente(String id, String nome, String endereco, String telefone, String cpf, String rg, String sexo, Double limiteCrediario, Double limiteUtilizado) {
            super(id, nome, endereco, telefone, cpf, rg, sexo);
            this.limiteCrediario = limiteCrediario;
            this.limiteUtilizado = limiteUtilizado;
        }

        public Double getLimiteCrediario() {
            return limiteCrediario;
        }

        public Double getLimiteUtilizado() {
            return limiteUtilizado;
        }

        public void setLimiteCrediario(Double limiteCrediario) {
            this.limiteCrediario = limiteCrediario;
        }

        public void setLimiteUtilizado(Double limiteUtilizado) {
            this.limiteUtilizado = limiteUtilizado;
        }

        //comportamento
        public void aumentarLimite(Double valorAumentar){
            //Double novoLimite = 0.0
            this.limiteCrediario =  limiteCrediario + valorAumentar;
            System.out.println(limiteCrediario);
        }
        public void diminuirLimite(Double valorDiminuir) {
            //Double novoLimite = 0.0
            this limiteCrediario = limiteCrediario - valorDiminuir;
            System.out.println(limiteCrediario);
        }

    }
    public static class Funcionario extends PessoaFisica{
        private Double salarioBruto;
        private Double salarioLiquido;

        public Funcionario(String id, String nome, String endereco, String telefone, String cpf, String rg, String sexo, Double salarioBruto, Double salarioLiquido) {
            super(id, nome, endereco, telefone, cpf, rg, sexo);
            this.salarioBruto = salarioBruto;
            this.salarioLiquido = salarioLiquido;
        }

        public void aplicarDissidio(Double valorDissidio){
            Double reajuste = 0.0;
            this reajuste = salarioBruto * 0.09;
            this salarioBruto = salarioBruto + reajuste;
            System.out.println(reajuste);
        }

        public Double getSalarioBruto() {
            return salarioBruto;
        }

        public Double getSalarioLiquido() {
            return salarioLiquido;
        }

        public void setSalarioBruto(Double salarioBruto) {
            this.salarioBruto = salarioBruto;
        }

        public void setSalarioLiquido(Double salarioLiquido) {
            this.salarioLiquido = salarioLiquido;
        }
    }
    public static class Fornecedor extends PessoaJuridica {
        private String responsavel;
        private String observacao;

        public Fornecedor(String id, String nome, String endereco, String telefone, String cnpj, String inscricaoEstadual, String cnae, String responsavel, String observacao) {
            super(id, nome, endereco, telefone, cnpj, inscricaoEstadual, cnae);
            this.responsavel = responsavel;
            this.observacao = observacao;
        }

        public String getResponsavel() {
            return responsavel;
        }

        public String getObservacao() {
            return observacao;
        }

        public void setResponsavel(String responsavel) {
            this.responsavel = responsavel;
        }

        public void setObservacao(String observacao) {
            this.observacao = observacao;
        }
    }
}*/
