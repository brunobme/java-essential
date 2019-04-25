
import java.util.Scanner;
public class BitsTrocados {
    public static void main(String args[]){
        // preparando o teclado
        Scanner teclado = new Scanner(System.in);
        // declarar as variaveis
        int valorSaque, q50, q10, q5, q1;
        int resto;
        
        System.out.println("Qual o valor do saque?");
        valorSaque = teclado.nextInt();
        
        // numero de cedulas de 50
        q50 = valorSaque / 50;
        //quanto sobrou?
        resto = valorSaque % 50;
        
        // determinar cedulas de 10
        q10 = resto / 10;
        // quanto sobrou?
        resto = resto % 10;
        
        // determinar cedulas de 5
        q5 = resto / 5;
        q1 = resto % 5;
        
        if ( q50 != 0 ){
            System.out.println("Quantidade de B$ 50 = "+q50); 
        }
        if ( q10 != 0 ){
            System.out.println("Quantidade de B$ 10 = "+q10);
        }
        if ( q5 != 0 ){
            System.out.println("Quantidade de B$  5 = "+q5);
        }
        if ( q1 != 0 ){
            System.out.println("Quantidade de B$  1 = "+q1);
        }
        
        
                
    }
    
}

