package paridade;

public class ChecadorDeParidade {	
	private String palavra;
	private int bitDeParidade;	
	private boolean resultado;
	
	public ChecadorDeParidade(String palavra) {
		this.palavra = palavra;
		String ultimoBitString = palavra.substring(palavra.length() -1);
		this.bitDeParidade = Integer.parseInt(ultimoBitString);			
		this.resultado = checa(palavra.substring(0, palavra.length() -1),this.bitDeParidade);
	}
	
	private int paridade(String palavra) {
		char[] array = palavra.toCharArray();
		int qtdde1 = 0;
		for (int i = 0; i < array.length; i++) {
			char um = '1';
			if (array[i] == um) {				
				qtdde1++;
			}
		}
		
		if (qtdde1 % 2 == 0) {			
			return 0;
		}		
		return 1;
	}
	
	private boolean checa(String palavra, int bitDeParidade) {
		int bitCalculado = paridade(palavra);	
		
		if (bitCalculado == bitDeParidade) {
			return true;
		}
		return false;
	}

	public String getPalavra() {
		return palavra;
	}

	public void setPalavra(String palavra) {
		this.palavra = palavra;
		this.bitDeParidade = palavra.charAt(palavra.length() -1);	
		this.resultado = checa(palavra.substring(0, palavra.length() -1),this.bitDeParidade);
	}

	public int getBitDeParidade() {
		return bitDeParidade;
	}

	public boolean getResultado() {
		return resultado;
	}
	
	


}
