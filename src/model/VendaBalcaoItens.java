package model;

import java.math.BigDecimal;

public class VendaBalcaoItens {

    private Long id;
    private Vendavel vendavel;
    private BigDecimal desconto;
    private int quantidade;
    private BigDecimal valorTotal;

    public VendaBalcaoItens(Long id, Vendavel vendavel, BigDecimal desconto, int quantidade, BigDecimal valorTotal) {
        this.id = id;
        this.vendavel = vendavel;
        this.desconto = desconto;
        this.quantidade = quantidade;
        this.valorTotal = valorTotal;
    }

    public Long getId() {
        return id;
    }

    public Vendavel getVendavel() {
        return vendavel;
    }

    public BigDecimal getDesconto() {
        return desconto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setVendavel(Vendavel vendavel) {
        this.vendavel = vendavel;
    }

    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }
}
