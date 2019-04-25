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
public class picosdeCalor {
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        int n, count, picos=0;
        float[] temp;
        System.out.println("Quantas medições foram realizadas?");
        n = teclado.nextInt();
        temp = new float[n];
        System.out.println("Digite as temperaturas medidas:");
        for(count = 0; count < n; count++){
            temp[count] = teclado.nextFloat();
        }
        for(count = 0; count < n; count++){
            if(n!=1){
                if(((count == 0) && (temp[count] > temp[count+1]))||((count == n-1) && (temp[count] > temp[count-1]))|| (temp[count] > temp[count+1] && temp[count] > temp[count-1])){
                    picos +=1;
                }
            }
        }
        if(picos == 1){
            System.out.println(picos + " pico de calor");
        }else{
            System.out.println(picos + " picos de calor");
        }
    }
}
