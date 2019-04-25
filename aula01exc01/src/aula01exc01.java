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

public class aula01exc01 {
    public static void main(String args[]) {
        // declarei um decodificador do tipo Scanner que chamei de teclado
        Scanner teclado;
        //o meu decodificador vai ler do teclado
        teclado = new Scanner(System.in);
        float n1;
        System.out.println("Digite um número");
        n1 = teclado.nextFloat();
        System.out.println("Voce digitou " + n1);
        float n2;
        System.out.println("Digite outro número");
        n2 = teclado.nextFloat();
        System.out.println("Voce digitou " + n2);
        float n3;
        System.out.println("Digite só mais um número, por favor vai");
        n3 = teclado.nextFloat();
        System.out.println("Voce digitou " + n3);
        
        float soma = n1 + n2 + n3;
        float r1 = n1/soma;
        float r2 = n2/soma;
        float r3 = n3/soma;
        
        System.out.println("O valor " + n1 + " representa " + r1 + 
        " do total, já o valor " + n2 + " representa " + r2 + " enquanto o "
        + n3 + " equivale a " + r3 + " do total.");
    }
    
}
