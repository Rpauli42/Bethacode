package model;

public abstract class Pessoa {
        private Long id;
        private String Nome;
        private String cpf;
        private String endereco
        private String telefone

        public Pessoa(Long id, String nome, String cpf, String endereco, String telefone) {
                this.id = id;
                Nome = nome;
                this.cpf = cpf;
                this.endereco = endereco;
                this.telefone = telefone;
        }

        public Long getId() {

                return id;
        }

        public String getNome() {
                return Nome;
        }

        public String getCpf() {
                return cpf;
        }

        public String getEndereco() {
                return endereco;
        }

        public String getTelefone() {
                return telefone;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public void setNome(String nome) {
                Nome = nome;
        }

        public void setCpf(String cpf) {
                this.cpf = cpf;
        }

        public void setEndereco(String endereco) {
                this.endereco = endereco;
        }

        public void setTelefone(String telefone) {
                this.telefone = telefone;
        }
}



