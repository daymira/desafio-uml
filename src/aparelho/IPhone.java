package src.aparelho;

import java.util.Scanner;

import src.aparelhotelefonico.Contato;
import src.navegador.Safari;
import src.reprodutormusical.IPod;

public class IPhone{
    public static void main(String[] args) {
        Contato contato = new Contato();
        IPod ipod = new IPod();
        Safari safari = new Safari();
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha o aplicativo que deseja usar\n 1: Contato\n 2: Safari\n 3:IPod.");
        int entrada = sc.nextInt();

        if(entrada == 1){
            contato.ligar();
            contato.atender();
            contato.iniciarCorreioDeVoz();
         }else if(entrada == 2){
            safari.exibirPagina();
            safari.adicionarNovaAba();
            safari.atualizarPagina();
         }else if(entrada== 3){
            ipod.tocarMusica();
            ipod.selecionarMusica();
            ipod.pausarMusica();
         }else{
            System.out.println("Operacao invalida.");
         }
         sc.close();

    }
    
}

    
