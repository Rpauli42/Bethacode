package model;

import java.math.BigDecimal;

public class Produto implements Vendavel{

    private Long id;
    private BigDecimal descricao;
    private BigDecimal altura;
    private BigDecimal largura;
    private BigDecimal valorUnitario;

    public Produto(Long id, BigDecimal descricao, BigDecimal altura, BigDecimal largura, BigDecimal valorUnitario) {
        this.id = id;
        this.descricao = descricao;
        this.altura = altura;
        this.largura = largura;
        this.valorUnitario = valorUnitario;
    }

    public Long getId() {
        return id;
    }

    public BigDecimal getAltura() {
        return altura;
    }

    public BigDecimal getLargura() {
        return largura;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescricao(BigDecimal descricao) {
        this.descricao = descricao;
    }

    public void setAltura(BigDecimal altura) {
        this.altura = altura;
    }

    public void setLargura(BigDecimal largura) {
        this.largura = largura;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    @Override
    public BigDecimal getValorUnitario() {
        return this.valorUnitario;
    }

    @Override
    public String getDescricao() {
        return this.descricao;
    }
}
