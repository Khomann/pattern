package jogo.Relatorio;

public abstract class Relatorio {
    
    public void gerarRelatorio(){
     buscar();
     exportar();      
    }
    private void buscar(){
        System.out.println("Buscar relatorios");
    }
    
    protected abstract void exportar();

    
}

