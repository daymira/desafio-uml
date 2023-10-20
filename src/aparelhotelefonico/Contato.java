package src.aparelhotelefonico;


public class Contato implements AparelhoTelefonico{
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
    
}
