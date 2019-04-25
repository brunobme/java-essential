/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author marques.bruno
 */
import java.util.Scanner;

public class BitsTrocados {

    /**
     *
     * @param args
     */
    public static void main(String args[]) {
        //preparando o teclado
        Scanner teclado = new Scanner(System.in);
        //declarando variaveis loucas
        int valSaque, n50, n10, n5, n1, maisSaque;
        int resto;
        do{
            System.out.println("Digite o valor desejado");
            valSaque = teclado.nextInt();
            //determinando a quantidade de notas
            //50
            n50 = valSaque / 50;
            resto = valSaque % 50;
            //10 
            n10 = resto / 10;
            resto = resto % 10;
            //5
            n5 = resto / 5;
            resto = resto % 5;
            //1
            n1 = resto;

            if (n50 != 0) {
                System.out.println(n50 + " notas de 50");
            }
            if(n10 != 0){
                System.out.println(n10 + " notas de 10");
            }
            if(n5 != 0){
                System.out.println(n5 + " notas de 5");
            }
            if(n1 != 0){
                System.out.println(n1 + " notas de 1");
            }
            System.out.println("Deseja sacar mais? Digite 1 para sim e 0 para não");
            maisSaque = teclado.nextInt();
        }while(maisSaque == 1);
    }
}
