package exerciciosJavaGeneration3;

import java.util.Scanner;

/*2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
 */

public class exercicio2 {

	public static void main(String[] args) {
		
		 Scanner leia = new Scanner(System.in);
		 
	        int num, numPar = 0, numImpar = 0;
	        
	        for(int i = 1; i <= 10; i++){
	            System.out.println("Digite o " + i + "º número: ");
	            num = leia.nextInt();
	            
	            if(num % 2 == 0){
	                numPar++;
	            }
        
	            else {
	                numImpar++;
	            }
	        }
	        
	     System.out.println("Foram digitados " + numPar + " números pares.");
	     System.out.println("Foram digitados " + numImpar + " números ímpares.");
	       
	     leia.close();  
	}
}

