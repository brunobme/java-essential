/*
O que eu quero?
que o usuário informe 3 numeros e eu calcule o percentual de cada valor no total
Ex: 1 2 3

1 representa 0,16666667 do total
2 representa 0,33333333 do total
3 representa 0,5        do total

E   ------>       P         ------> S
v1           1. ler v1             exibir r1
v2           2. ler v2             exibir r2
v3           3. ler v3             exibir r3
             4. somar tudo
             5. calcular r1
             6. calcular r2
             7. calcular r3
*/
import java.util.Scanner;
public class Aula01_Ex02 {
    public static void main(String args[]){
        // preparei o decodificador do teclado
        Scanner teclado;
        teclado = new Scanner(System.in);
        
        float v1,v2,v3,soma,r1,r2,r3;
        System.out.println("Digite o primeiro valor");
        v1 = teclado.nextFloat();
        System.out.println("Digite o segundo valor");
        v2 = teclado.nextFloat();
        System.out.println("Digite o terceiro valor");
        v3 = teclado.nextFloat();
        soma = v1 + v2 + v3;
        
        r1 = v1/soma;
        r2 = v2/soma;
        r3 = v3/soma;
        
        System.out.println("O valor " + v1 + " representa "+r1+ " do total");
        System.out.println("O valor " + v2 + " representa "+r2+ " do total");
        System.out.println("O valor " + v3 + " representa "+r3+ " do total");        
    }    
}
