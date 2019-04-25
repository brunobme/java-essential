/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author leonardo.bertucci
 */

import java.util.Scanner;
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        
        int posL, posC;
        float matriz[][];
        matriz = new float[3][4];
        
        System.out.println("Digite os valores da matriz");
        for(posL = 0; posL < 3; posL++){
            for(posC = 0; posC < 4; posC++){
                matriz[posL][posC]= teclado.nextFloat();
            }
        }
        
        for(posL = 0; posL < 3; posL++){
            for(posC = 0; posC < 4; posC++){
                System.out.print(matriz[posL][posC]+"   ");
            }
            System.out.println();
        }
        float max, min, maxL, soma;
        int[] posMax, posMin;
        float[] vetor;
        posMax = new int[2];
        posMin = new int[2];
        vetor = new float[3];
        max = matriz[0][0];
        min = matriz[0][0];
        soma = 0;
        for(posL = 0; posL < 3; posL++){
            maxL = matriz[posL][0];
            for(posC = 0; posC < 4; posC++){
                if(matriz[posL][posC] > max){
                    max = matriz[posL][posC];
                    posMax[0] = 1+posL;
                    posMax[1] = 1+posC;
                }
                if(matriz[posL][posC]<min){
                    min = matriz[posL][posC];
                    posMin[0] = 1+posL;
                    posMin[1] = 1+posC;
                }
                if(matriz[posL][posC]>maxL){
                    maxL = matriz[posL][posC];
                }
                soma += matriz[posL][posC];
            }
            vetor[posL] = maxL;
        }
        System.out.println("O valor máximo é: "+max+" na posição "+posMax[0]+","+posMax[1]);
        System.out.println("O valor mínimo é: "+min+" na posição "+posMin[0]+","+posMin[1]);
        System.out.println("O valor total é: "+soma);
        for(posL = 0; posL < 3; posL++){
            System.out.println("O máximo da linha "+(1+posL)+" é "+vetor[posL]);
        }
        
        
        
        
        
    }
    
}
