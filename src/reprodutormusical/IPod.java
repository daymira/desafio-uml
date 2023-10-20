package src.reprodutormusical;


public  class IPod implements ReprodutorMusical{ 
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

    
}
