package paridade;
import java.util.Scanner;
import paridade.CalculadoraDeParidade;
import paridade.ChecadorDeParidade;

public class AchaErroComParidade {
	
	
	public static void main(String[] args) {
		System.out.println("---------- Checagem de paridade ----------");
		String enviado1 = "0100101";
		String enviado1certo = "01001011";
		String enviado1errado = "01001010";
		ChecaParidade(enviado1, enviado1certo);
		ChecaParidade(enviado1, enviado1errado);
		
		
		String enviado2 = "010101010010100";
		String enviado2certo = "0101010100101000";
		String enviado2errado = "0101010100101001";
		ChecaParidade(enviado2, enviado2certo);
		ChecaParidade(enviado2, enviado2errado);
		
		String enviado3 = "00011";
		String enviado3certo = "000110";
		String enviado3errado = "110000";
		ChecaParidade(enviado3, enviado3certo);
		System.out.println("Note que, temps um erro da verificação usando paridade!");
		ChecaParidade(enviado3, enviado3errado);
		
	} 
    
    
    private static String recebePalavraEnviada() {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Digite o código a ser enviado sem o bit de paridade: ");
        return sc.nextLine();
    }
    
    private static String recebePalavraRecebida() {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Digite o código recebido: ");
        return sc.nextLine();
    }
    
    private static void ChecaParidade(String enviado, String recebido) {
    	System.out.println("A palavra enviada sem paridade: " + enviado);
    	CalculadoraDeParidade calc = new CalculadoraDeParidade(enviado);
    	System.out.println("A palavra com paridade: " + calc.getPalavraComParidade());
    	System.out.println("A palavra recebida: " + recebido);
    	ChecadorDeParidade checar = new ChecadorDeParidade(recebido);
    	if (checar.getResultado()) {
			System.out.println("RESULTADO: Nenhum erro de paridade encontrado");
			System.out.println("==================================================");
		}
		else {
			System.out.println("RESULTADO: Erro de paridade encontrado");
			System.out.println("==================================================");
		}
    }
    
}



