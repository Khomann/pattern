package jogo.Loja;

public class Simples implements Produto{
    private String nome;
    private double preco;

    
    public Simples(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
    @Override
    public String getNome() {
        return this.nome;
    }
    @Override
    public double getPreco() {
        return this.preco;
    }
}
