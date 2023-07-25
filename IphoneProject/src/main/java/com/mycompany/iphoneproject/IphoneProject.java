package com.mycompany.iphoneproject;
import java.util.Scanner;
/**
 *
 * @author Mateus
 */
public class IphoneProject {

    public static void main(String[] args) {
        int x;
        Scanner scan = new Scanner(System.in);
        Iphone1 iphone = new Iphone1();
        iphone.LigarIphone();
        System.out.println("menu");
        System.out.println("1-Musica");
        System.out.println("2-Internet");
        System.out.println("3-Telefone");
        x = scan.nextInt();
        switch (x){
            case 1:
                iphone.PausarMusica();
                break;
            case 2:
                iphone.AtualizarPagina();
                break;
            case 3:
                iphone.FazerChamada();
                break;
            default :
                System.out.println("Opção Invalida");
                break;
        }
    }
}
