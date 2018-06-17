import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		int num = entrada.nextInt();
					
		for (int i = 0; i <= 9; i++) {
			
			double conta = Math.pow(num, i); 
			
			int numero = (int) conta;
			
			System.out.println(rearrangingNumber(numero));
		}
		
	}
	
	static int rearrangingNumber(int numero){
		 
		int[] ocorrencia = new int[10];
		
		while(numero > 0){
			int digito = numero % 10;
			ocorrencia[digito]++;
			numero = numero / 10;
		}
		
		int result = 0;
		for(int i = 1; i <= 9; i++){
			if(ocorrencia[i] != 0){
				result = i;
				ocorrencia[i]--;
				break;
			}
		}
		
		for(int i = 0; i <= 9; i++)
			while(ocorrencia[i]-- != 0)
				result = result * 10 + i;
		return result;
	}

}
