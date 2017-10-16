package jogo.Loja;

public class Composto implements Produto{
    private Produto p1;
    private Produto p2;
   
    public Composto(Produto p1, Produto p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    
    @Override
    public String getNome() {
        return p1.getNome()+ " + " + p2.getNome();
    }

    @Override
    public double getPreco() {
        return p1.getPreco() + p2.getPreco();
    }
}
