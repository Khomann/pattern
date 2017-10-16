package jogo;

import jogo.Estado.Personagem;
import jogo.Estado.Estado;
import jogo.Estado.Super;

import jogo.Relatorio.Relatorio;
import jogo.Relatorio.PDF;

import jogo.Loja.Produto;
import jogo.Loja.Simples;
import jogo.Loja.Composto;

public class Jogo {

    public static void main(String[] args) {
        Acao acao = new Verificacao();
        
        acao.executar();
        
        System.out.println("\n");
                
        Personagem personagem = new Personagem();
        personagem.andar();
        personagem.pular();
        personagem.correr();
        personagem.atirar();
     
        
        System.out.println("\n");
        
        Estado Super = new Super();
        personagem.setEstado(Super);
        personagem.andar();
        personagem.pular();
        personagem.correr();
        personagem.atirar();
        
        System.out.println("\n");
        
        
        
       Produto p1 = new Simples("Arco Elfo",80.0);
       Produto p2 = new Simples ("Flexas de Fogo",40.0);
       System.out.println(p1.getNome());
       System.out.println(p2.getNome());
       
       System.out.println("\n");
       
       Produto p3 = new Composto(p1,p2);
       System.out.println(p3.getNome());
       System.out.println(p3.getPreco());
        
       System.out.println("\n");

        Relatorio relatorio = new PDF();
        relatorio.gerarRelatorio();
        
        
    }
    
}
