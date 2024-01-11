
/*
Desafio
Para dar conta de toda a fabricação dos presentes de Natal, por várias vezes os elfos precisam ficar até tarde trabalhando para que tudo possa ser terminado a tempo.
Para melhor gerenciar seus cronogramas, os elfos estipularam quantos minutos são necessários para fabricar cada presente.
Já está quase no final do expediente, e um dos elfos pediu sua ajuda.
Faltam N minutos para a hora de ir embora, e restam dois presentes para o elfo Dobby fabricar. Ajude-o a descobrir se ele conseguirá fabricar os dois ainda hoje, ou se deve deixar o trabalho para amanhã.
Entrada
Cada caso de teste inicia com um inteiro N, indicando quantos minutos faltam para o final do expediente (2 <= N <= 100).
Em seguida haverá dois inteiros A e B, indicando quantos minutos são necessários para fabricar os dois presentes que Dobby precisa fabricar (1 <= A, B <= 100).
Saída
Imprima uma linha, contendo a frase "Farei hoje!" caso seja possível fabricar os dois presentes antes do final do expediente, ou "Deixa para amanha!" caso contrário.
 
Exemplos de Entrada	
20
15 6	

Exemplos de Saída
Deixa para amanha!


20
10 10	

Exemplos de Saída
Farei hoje!


*/

import java.io.IOException;
import java.util.Scanner;

public class Problem {
    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	int N = leitor.nextInt();
    	int A = leitor.nextInt() + leitor.nextInt();
        //TODO: Complete o If com a condição que soluciona o problema.
    	if (A >  N )
    		System.out.println("Deixa para amanha!");
    	else
    		System.out.println("Farei hoje!");
    }
	
}
