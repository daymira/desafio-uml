package aparelhotelefonico;

import aparelho.IPhone;

public class Contato {
    public static void main(String[] args) {
        IPhone iphone = new IPhone();

        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioDeVoz();
    
    }
    
}
