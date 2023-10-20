package src.navegador;


public class Safari implements Navegador{
    
    @Override
    public void exibirPagina(){
        System.out.println("Exibindo pagina!");
    }

    @Override
    public void adicionarNovaAba(){
        System.out.println("Adicionar nova aba.");
    }

    @Override
    public void atualizarPagina(){
        System.out.println("Atualizando a pagina!");
    }
}
