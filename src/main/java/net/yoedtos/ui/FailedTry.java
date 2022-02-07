package net.yoedtos.ui;

/**
 * Classe para visualizar tentativas falhas
 * no Jogo da Forca através de uma forca em
 * ASCII caracteres
 * 
 * @author yoedtos
 *
 */
public class FailedTry {

	private static final int TRY_1= 1;
	private static final int TRY_2= 2;
	private static final int TRY_3= 3;
	private static final int TRY_4= 4;
	private static final int TRY_5= 5;
	private static final int TRY_6= 6;
	private static final int TRY_7= 7;
	
	private char[] fails;
	
	
	public FailedTry() {
		fails = new char[7];
		for(int i= 0; i < fails.length; i++) {
			fails[i] = ' ';
		}
	}
	
	/**
	 * Desenha a forca com o incremento de fail
	 * @param fail inteiro representando numero de falhas
	 */
	public void show(int fail) {
		fillDisplay(fail);
		
		System.out.print("__________\n");
		System.out.print(String.format("%10s\n", fails[6]));
		System.out.print(String.format("%10s\n", fails[5]));
		System.out.print(String.format("%9s", fails[4]));    
		System.out.print(String.format("%1s", fails[3]));   
		System.out.print(String.format("%1s\n", fails[2])); 
		System.out.print(String.format("%9s", fails[1]));   
		System.out.print(String.format("%2s", fails[0]));   
		System.out.println();
	}
	
	private void fillDisplay(int fail) {
		switch (fail) {
		case TRY_1:
			fails[0] = 92;
			break;
		case TRY_2:
			fails[1] = 47;
			break;
		case TRY_3:
			fails[2] = 92;
			break;
		case TRY_4:
			fails[3] = 124;
			break;
		case TRY_5:
			fails[4] = 47;
			break;
		case TRY_6:
			fails[5] = 79;
			break;
		case TRY_7:
			fails[6] = 124;
			break;
		default:
			break;
		}
	}
	
}
