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
public class desafioIsidro {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float n, intN;
        n = 1;
        while (n >=1 || n <=0){
            System.out.println("Digite um número real entre 0 e 1");
            n = teclado.nextFloat();
            if(n >=1 || n <=0){
                System.out.println("ENTRE 0 e 1 -.-");
            }
        }
        while(n < 1000){
            n *= 10;
        };
        intN = 0;
        while (n >= 1){
            n--;
            intN++;
        }
        System.out.println("O valor inteiro é " + intN);
    }
}
