package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Aluguel {

    private Cliente cliente;
    private Filme filme;

    private LocalDate dataAluguel;
    private LocalDate dataDevolucao;

    private static DateTimeFormatter fmt =
            DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Aluguel(Cliente clienteEscolhido, Filme filmeEscolhido) {
        this.cliente = clienteEscolhido;
        this.filme = filmeEscolhido;
        this.dataAluguel = LocalDate.now();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Filme getFilme() {
        return filme;
    }

    public LocalDate getDataAluguel() {
        return dataAluguel;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public String getDataAluguelFormatada() {
        return dataAluguel.format(fmt);
    }

    public String getDataDevolucaoFormatada() {
        if (dataDevolucao == null) {
            return "Não devolvido";
        }
        return dataDevolucao.format(fmt);
    }

    public String toString() {
        return "Cliente: " + cliente.getNome()
                + " | Filme: " + filme.getTitulo()
                + " | Alugado em: " + getDataAluguelFormatada()
                + " | Devolvido em: " + getDataDevolucaoFormatada();
    }
}