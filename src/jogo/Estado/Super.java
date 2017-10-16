package jogo.Estado;

public class Super implements Estado{
    
    public void executar() {
        System.out.println("Personagem Super");
    }
        @Override
    public void andar() {
        System.out.println("O Personagem está ANDANDO mais rapido ...");
    }

    @Override
    public void pular() {
        System.out.println("O Personagem está PULANDO mais alto ...");
    }
    
       @Override
    public void correr() {
        System.out.println("O Personagem está CORRENDO mais rapido ...");
    }
    
        @Override
    public void atirar() {
        System.out.println("O Personagem está ATIRANDO mais rapido e com maior DANO ...");
    }
}
