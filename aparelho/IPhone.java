package aparelho;

import aparelhotelefonico.AparelhoTelefonico;
import navegador.Navegador;
import reprodutormusical.ReprodutorMusical;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, Navegador{

    @Override
    public void tocarMusica(){
        System.out.println("Tocando musica!");
    }

    @Override
    public void pausarMusica(){
        System.out.println("Pausando musica.");
    }

    @Override
    public void selecionarMusica(){
        System.out.println("Selecionando musica.");
    }

    @Override
    public void ligar(){
        System.out.println("Ligando!");
    }

    @Override
    public void atender(){
        System.out.println("Atendendo ligacao!");
    }

    @Override
    public void iniciarCorreioDeVoz(){
        System.out.println("Iniciando correio de voz!");
    }

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
    
