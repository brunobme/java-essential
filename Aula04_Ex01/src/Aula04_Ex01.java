/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author marquesbruno
 */

import java.util.Scanner;
public class Aula04_Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int opcao;
        do{
            System.out.println("Escreva 1 para Opção 1");
            System.out.println("Escreva 2 para Opção 2");
            System.out.println("Escreva 3 para encerrar");
            opcao = teclado.nextInt();
            if(opcao == 1){
                System.out.println("Escolheu opção 1");
            }else{
                if(opcao == 2){
                    System.out.println("Escolheu opção 2");
                }else{
                    System.out.println("1, 2 ou 3 seu animal");
                }
            }
        }while (opcao != 3);
    }
    
}
