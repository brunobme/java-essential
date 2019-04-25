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

public class batimentosCardiacos {
    public static void main (String args[]){
        //teclado sensual
        Scanner teclado = new Scanner(System.in);
        //m se refere as medidas dos batimentos cardiacos
        //n se refere ao numero de alunos a serem avaliados na instância
        //qt_m se refere a quantidade de medidas para cada aluno da instância
        int n, qt_m, instancia, i, j;
        float m, max_m, min_m;
        instancia = 0;
        do{
            //System.out.println("Quantos alunos deseja avaliar?");
            n = teclado.nextInt();
            if(n > 0){
                instancia++;
                System.out.println("Instância " + instancia);
                //System.out.println("Quantas medições para cada?");
                qt_m = teclado.nextInt();
                for(i =1; i <= n; i++){
                    //System.out.println("Digite os valores para o aluno " + i);
                    m = teclado.nextFloat();
                    max_m = m;
                    min_m = m;
                    for (j = 1; j < qt_m; j++){
                        m = teclado.nextFloat();
                        if(m > max_m){
                            max_m = m;
                        }else if(m < min_m){
                            min_m = m;
                        }
                    }
                    if(max_m - min_m > 20){
                        System.out.println("Cuidado com o aluno " + i + " Isidro... Você está correndo perigo iminente!!!");
                    }else{
                        System.out.println("Ufa... O aluno " + i + " tomou suco de maracujá");
                    }
                }
            }
        }while(n > 0);
    }
}
