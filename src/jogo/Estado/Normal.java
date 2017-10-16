package jogo.Estado;

public class Normal implements Estado{

    @Override
    public void andar(){
        System.out.println("O Personagem está ANDANDO normal ...");
    }

    @Override
    public void pular() {
        System.out.println("O Personagem está PULANDO normal ...");
    }
    
    @Override
        public void correr(){
        System.out.println("O Personagem está CORRENDO normal ...");
    }

    @Override
    public void atirar() {
        System.out.println("O Personagem está ATIRANDO normal ...");
    }
}
