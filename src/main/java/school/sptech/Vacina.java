package sptech.school;

import java.time.LocalDate;

public class Vacina {
    String codigo;
    String nome;
    String tipo;
    Double preco;
    Double eficacia;
    LocalDate datalancamento;

    public Vacina() {

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getnome() {
        return nome;
    }

    public void setNom(String nom) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getEficacia() {
        return eficacia;
    }

    public void setEficacia(Double eficacia) {
        this.eficacia = eficacia;
    }

    public LocalDate getDatalancamento() {
        return datalancamento;
    }

    public void setDatalancamento(LocalDate datalancamento) {
        this.datalancamento = datalancamento;
    }

    String getEficaciaDescricao(){
        if (eficacia >= 90.5){
            return "EXCELENTE";
        } else if (eficacia >= 75.5) {
            return "BOM";
        } else if (eficacia >= 50.5){
            return "REGULAR";
        } else {
            return "RUIM";
        }
    }
}
