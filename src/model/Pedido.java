package model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Pedido implements Faturavel {

    private Long id;
    private LocalDate dataPedido;
    private Orcamento orcamento;
    private Cliente cliente;
    private Vendedor vendedor;
    private List<PedidoItens> Itens;

    public Pedido(Long id, LocalDate dataPedido, Orcamento orcamento, Cliente cliente, Vendedor vendedor, List<PedidoItens> itens) {
        this.id = id;
        this.dataPedido = dataPedido;
        this.orcamento = orcamento;
        this.cliente = cliente;
        this.vendedor = vendedor;
        Itens = itens;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDataPedido(LocalDate dataPedido) {
        this.dataPedido = dataPedido;
    }

    public void setOrcamento(Orcamento orcamento) {
        this.orcamento = orcamento;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public void setItens(List<PedidoItens> itens) {
        Itens = itens;
    }

    public Long getId() {
        return id;
    }

    public LocalDate getDataPedido() {
        return dataPedido;
    }

    public Orcamento getOrcamento() {
        return orcamento;
    }

    public List<PedidoItens> getItens() {
        return Itens;
    }

    @Override
    public LocalDate getDataFatura() {
        return this.dataPedido;
    }

    @Override
    public BigDecimal getValorTotalFaturamento() {
        //return null;
        BigDecimal valorTotal = BigDecimal.ZERO;
        for (int i=0; i <= this.itens.size(); i++){
            valorTotal = valorTotal .add(this.itens.get(i).getValorTotal());
        }
        return valorTotal;
    }

    @Override
    public Cliente getCliente() {
        return this.cliente;
    }

    @Override
    public Vendedor getVendedor() {
        return this.vendedor;
    }
}
