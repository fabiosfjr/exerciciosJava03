package exerciciosJavaGeneration3;

import java.util.Scanner;

/*2- Ler 10 n?meros e imprimir quantos s?o pares e quantos s?o ?mpares. (FOR)
 */

public class exercicio2 {

	public static void main(String[] args) {
		
		 Scanner leia = new Scanner(System.in);
		 
	        int num, numPar = 0, numImpar = 0;
	        
	        for(int i = 1; i <= 10; i++){
	            System.out.println("Digite o " + i + "? n?mero: ");
	            num = leia.nextInt();
	            
	            if(num % 2 == 0){
	                numPar++;
	            }
        
	            else {
	                numImpar++;
	            }
	        }
	        
	     System.out.println("Foram digitados " + numPar + " n?meros pares.");
	     System.out.println("Foram digitados " + numImpar + " n?meros ?mpares.");
	       
	     leia.close();  
	}
}

