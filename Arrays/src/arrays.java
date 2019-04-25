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
public class arrays {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
            float[] notas;
            //definindo tamanho
            notas = new float[10];
            
            int pos, i;
            float soma = 0, media;
            System.out.println("Digite a quantidade de notas");
            pos = teclado.nextInt();
            System.out.println("Digite as notas");
            for(i = 0; i < pos; i++){
                //não da pra exibir a array (vetor) de uma vez só
                //System.out.println(notas);
                //essa sintaxe irá aprensentar o local da memória no qual os dados foram arquivados
                notas[i] = teclado.nextFloat();
                soma += notas[i];
            }
            media = soma/pos;
            System.out.println("A média é " + media);
            for(i = 0; i < pos; i++){
                if(notas[i]>media){
                    System.out.println("O aluno " + (i + 1) + " está acima da média");
                }else if(notas[pos]<media){
                    System.out.println("O aluno " + (i + 1) + " está abaixo da média");
                }else{
                    System.out.println("O aluno " + (i + 1) + " está na média");
                }
            }
            
            
    }
}
