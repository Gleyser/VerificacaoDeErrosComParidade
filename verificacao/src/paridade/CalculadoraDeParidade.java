package paridade;

public class CalculadoraDeParidade {
	private String palavra;
	private int bitDeParidade;
	private String palavraComParidade;
	
	public CalculadoraDeParidade(String palavra) {
		this.palavra = palavra;
		this.bitDeParidade = paridade(palavra);	
		this.palavraComParidade = palavra + this.bitDeParidade;
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

	public String getPalavra() {
		return palavra;
	}

	public void setPalavra(String palavra) {
		this.palavra = palavra;
		this.bitDeParidade = paridade(palavra);	
		this.palavraComParidade = palavra + this.bitDeParidade;
	}

	public int getBitDeParidade() {
		return bitDeParidade;
	}

	public String getPalavraComParidade() {
		return palavraComParidade;
	}
	
	
	
	
	
}
