package navegador;

import aparelho.IPhone;

public class Safari{
   
    public static void main(String[] args) {
        IPhone iphone = new IPhone();

        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    
    }

}
