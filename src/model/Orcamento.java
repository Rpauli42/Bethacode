package model;

import java.time.LocalDate;
import java.util.List;

public class Orcamento {

    private Long id;
    private LocalDate dataOrcaento;
    private Cliente cliente;
    private Vendedor vendedor;
    private List<OrcamentoItens> itens;

    public Orcamento(Long id, LocalDate dataOrcaento, Cliente cliente, Vendedor vendedor, List<OrcamentoItens> itens) {
        this.id = id;
        this.dataOrcaento = dataOrcaento;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.itens = itens;
    }

    public Long getId() {
        return id;
    }

    public LocalDate getDataOrcaento() {
        return dataOrcaento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public List<OrcamentoItens> getItens() {
        return itens;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDataOrcaento(LocalDate dataOrcaento) {
        this.dataOrcaento = dataOrcaento;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public void setItens(List<OrcamentoItens> itens) {
        this.itens = itens;
    }
}
