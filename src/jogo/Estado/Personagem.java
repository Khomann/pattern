package jogo.Estado;

public class Personagem {
        private Estado estado;
    
    public Personagem(){
        estado = new Normal();
    }
   
    
    public void setEstado(Estado novoEstado){
        estado = novoEstado;
    }
    public void andar(){
        estado.andar();
    }
    public void pular(){
        estado.pular();
    }
    public void correr(){
        estado.correr();
    }
    public void atirar(){
        estado.atirar();
    }
}
