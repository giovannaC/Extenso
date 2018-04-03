/* 
 * 
 * Giovanna Cazelato Pires
 * 
 * Bianca Privati
 * 
 * Stefany Lacroux
 * 
 */




import java.util.Scanner;

// Escrevendo os numeros por extenso
public class Extend {

	static String unid[] = {"zero", "um", "dois", "tres", "quatro", "cinco", "seis", "sete", "oito", "nove"};
//                            0      1      2        3       4         5       6       7       8        9
	static String dez[] = {"", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove", "dez","", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"};
//                          0       1      2        3          4         5          6             7          8         9         10  11    12        13         14          15           16           17        18         19

	static String cent[] = {"", "cento", "duzentos", "trezentos", "quatrocentos", "quintentos", "seiscentos", "setecentos", "oitocentos", "novecentos", "cem"};
//                           0     1         2           3           4                 5           6             7             8             9            10

	private static Scanner entrada;


	public Extend() {


	}

	public static void extendendo(String num){
// Estou usando essa váriavel oi como auxilias das arrays "aux" para não ficar modificando o dado da array. 
		int oi = 0;
// A string do valor q o usuario passar vai ser separada em duas, antes da "," e depois.
		String[] textoSeparado = num.split(",");
// A string separada fica guardada em dois arrays A primeria parte no posição 0 e a segunda na 1.
		String AC = textoSeparado[0];

		String DC = textoSeparado[1];
// Integer.parseInt(STRING) passa a string para um numero inteiro.
		int numberAC = Integer.parseInt(AC);

		int numberDC = Integer.parseInt(DC);
// Vamos parar em milhão, pois estamos usando INT.(máx = 2.147.483.647)
		int aux[] = new int [9];
//------------CALCULANDO O REAL---------------------		
		int aux1 = numberAC;
		
		aux[0] = aux1 / 100000000;
		
		aux1 = aux1 % 100000000;
		
		aux[1] = aux1 / 10000000;
		
		aux1 = aux1 % 10000000;
		
		aux[2] = aux1 / 1000000;
		
		aux1 = aux1 % 1000000;
		
		aux[3] = aux1 / 100000;
		
		aux1 = aux1 % 100000;
		
		aux[4] = aux1 / 10000;
		
		aux1 = aux1 % 10000;
		
		aux[5] = aux1 / 1000;
		
		aux1 = aux1 % 1000;
		
		aux[6] = aux1 / 100;
		
		aux1 = aux1 % 100;
		
		aux[7] = aux1 / 10;
		
		aux1 = aux1 % 10;
		
		aux[8] = aux1;
//-----------------------------------------------------------
//----------------CALCULANDO OS CENTAVOS--------------------
		int aux2[] = new int [2];
		
		int moeda = numberDC;
		
		aux2[0] = moeda / 10;
		
		aux2[1] = moeda % 10;
//--------------------------ESCREVENDO O REAL--------------------------------		
		System.out.println("reais " + numberAC);
		System.out.println("centavos " + numberDC);
		

		if(aux[0] != 0){
			if(aux[0] == 1){
				oi = aux[0] + 9;
				System.out.printf("%s ",cent[oi]);
			}else
			System.out.printf("%s ",cent[aux[0]]);
			if(aux[1] != 0 || aux[2] != 0){
				System.out.print("e ");
			}
		}
		
		if(aux[1] == 1){
			if(aux[2] == 1){
				oi = 1;
				System.out.printf("%s ",dez[oi]);
			}else if(aux[2] == 2){
				oi = 2;
				System.out.printf("%s ",dez[oi]);
			}else if(aux[2] == 3){
				oi = 3;
				System.out.printf("%s ",dez[oi]);
			}else if(aux[2] == 4){
				oi = 4;
				System.out.printf("%s ",dez[oi]);
			}else if(aux[2] == 5){
				oi = 5;
				System.out.printf("%s ",dez[oi]);
			}else if(aux[2] == 6){
				oi = 6;
				System.out.printf("%s ",dez[oi]);
			}else if(aux[2] == 7){
				oi = 7;
				System.out.printf("%s ",dez[oi]);
			}else if(aux[2] == 8){
				oi = 8;
				System.out.printf("%s ",dez[oi]);
			}else if(aux[2] == 9){
				oi = 9;
				System.out.printf("%s ",dez[oi]);
			}else if(aux[2] == 0){
				oi = 10;
				System.out.printf("%s ",dez[oi]);
			}
		}else if(aux[1] != 0){
			oi = aux[1] + 10;
			System.out.printf("%s ",dez[oi]);
			if(aux[2] != 0 ){	
				System.out.print(" e ");
				System.out.printf("%s ",unid[aux[2]]);
			}
		}else if(aux[2] != 0 ){
			System.out.printf("%s ",unid[aux[2]]);
		}

		if(aux[0] !=0 || aux[1] !=0 || aux[2] != 0){
			if(aux[0] == 0 && aux[1] == 0 && aux[2] == 1){
				System.out.print("Milhão e ");
			}else
			System.out.print("Milhoes e ");
		}
		if(aux[3] != 0){
			if(aux[4] !=0 || aux[5] != 0){
			System.out.printf("%s ",cent[aux[3]]);
			System.out.print("e ");
			}else if(aux[4] == 0 && aux[5] == 0){
				oi = 10;
				System.out.printf("%s ",cent[oi]);
			}
		}
		
		if(aux[4] == 1){
			if(aux[5] == 1){
				oi = 1;
				System.out.printf("%s ",dez[oi]);
			}else if(aux[5] == 2){
				oi = 2;
				System.out.printf("%s ",dez[oi]);
			}else if(aux[5] == 3){
				oi = 3;
				System.out.printf("%s ",dez[oi]);
			}else if(aux[5] == 4){
				oi = 4;
				System.out.printf("%s ",dez[oi]);
			}else if(aux[5] == 5){
				oi = 5;
				System.out.printf("%s ",dez[oi]);
			}else if(aux[5] == 6){
				oi = 6;
				System.out.printf("%s ",dez[oi]);
			}else if(aux[5] == 7){
				oi = 7;
				System.out.printf("%s ",dez[oi]);
			}else if(aux[5] == 8){
				oi = 8;
				System.out.printf("%s ",dez[oi]);
			}else if(aux[5] == 9){
				oi = 9;
				System.out.printf("%s ",dez[oi]);
			}else if(aux[5] == 0){
				oi = 10;
				System.out.printf("%s ",dez[oi]);
			}
		}else if(aux[4] != 0){
			oi = aux[4] + 10;
			System.out.printf("%s ",dez[oi]);
			if(aux[5] != 0 ){
				System.out.print(" e ");
				System.out.printf("%s ",unid[aux[5]]);
			}
		}else if(aux[5] != 0 ){
			if(aux[5] == 1){
				System.out.print("");
			}else{
			System.out.printf("%s ",unid[aux[5]]);
			}
		}

		if(aux[3] !=0 || aux[4] !=0 || aux[5] != 0){
			System.out.print("Mil ");
		}
		if(aux[6] != 0){
			System.out.printf("%s ",cent[aux[6]]);
			if(aux[7] != 0 || aux[8] != 0){
				System.out.print("e ");
			}
		}
		
		if(aux[7] == 1){
			if(aux[8] == 1){
				oi = 1;
				System.out.printf("%s ",dez[oi]);
			}else if(aux[8] == 2){
				oi = 2;
				System.out.printf("%s ",dez[oi]);
			}else if(aux[8] == 3){
				oi = 3;
				System.out.printf("%s ",dez[oi]);
			}else if(aux[8] == 4){
				oi = 4;
				System.out.printf("%s ",dez[oi]);
			}else if(aux[8] == 5){
				oi = 5;
				System.out.printf("%s ",dez[oi]);
			}else if(aux[8] == 6){
				oi = 6;
				System.out.printf("%s ",dez[oi]);
			}else if(aux[8] == 7){
				oi = 7;
				System.out.printf("%s ",dez[oi]);
			}else if(aux[8] == 8){
				oi = 8;
				System.out.printf("%s ",dez[oi]);
			}else if(aux[8] == 9){
				oi = 9;
				System.out.printf("%s ",dez[oi]);
			}else if(aux[8] == 0){
				oi = 10;
				System.out.printf("%s ",dez[oi]);
			}
			
		}else if(aux[7] != 0){
			oi = aux[7] + 10;
			System.out.printf("%s ",dez[oi]);
			if(aux[8] != 0 ){
				System.out.print(" e ");
				System.out.printf("%s ",unid[aux[8]]);
			}
		}else if(aux[8] != 0 ){
			System.out.printf("%s ",unid[aux[8]]);
		}
		
		if(aux[0] != 0 || aux[1] != 0 || aux[2] != 0 || aux[3] != 0 || aux[4] != 0 || aux[5] != 0 || aux[6] != 0 || aux[7] != 0 || aux[8] != 0){
		
			if(aux[0] == 0 && aux[1] == 0 && aux[2] == 0 && aux[3] == 0 && aux[4] == 0 && aux[5] == 0 && aux[6] == 0 && aux[7] == 0 && aux[8] == 1 && (aux2[0] != 0 || aux2[1] != 0)){
				System.out.print("Real e ");
			}else if(aux[0] == 0 && aux[1] == 0 && aux[2] == 0 && aux[3] == 0 && aux[4] == 0 && aux[5] == 0 && aux[6] == 0 && aux[7] == 0 && aux[8] == 1 && aux2[0] == 0 && aux2[1] == 0){
				System.out.print("Real ");
			}else if((aux[0] != 0 || aux[1] != 0 || aux[2] != 0) && aux[3] == 0 && aux[4] == 0 && aux[5] == 0 && aux[6] == 0 && aux[7] == 0 && aux[8] == 0 && (aux2[0] != 0 || aux2[1] != 0)){
				System.out.print("de Reais e ");
			}else if((aux[0] != 0 || aux[1] != 0 || aux[2] != 0) && aux[3] == 0 && aux[4] == 0 && aux[5] == 0 && aux[6] == 0 && aux[7] == 0 && aux[8] == 0 && aux2[0] == 0 && aux2[1] == 0){
				System.out.print("de Reais ");
			}else if(aux2[0] != 0 || aux2[1] != 0){
				System.out.print("Reais e ");
			}else if(aux2[0] == 0 && aux2[1] == 0){
				System.out.print("Reais ");
			}
		}
//---------------------------------------------------------------				
//----------------ESCREVENDO OS CENTAVOS------------------------
		
		if(aux2[0] == 1){
			if(aux2[1] == 1){
				oi = 1;
				System.out.printf("%s ",dez[oi]);
			}else if(aux2[1] == 2){
				oi = 2;
				System.out.printf("%s ",dez[oi]);
			}else if(aux2[1] == 3){
				oi = 3;
				System.out.printf("%s ",dez[oi]);
			}else if(aux2[1] == 4){
				oi = 4;
				System.out.printf("%s ",dez[oi]);
			}else if(aux2[1] == 5){
				oi = 5;
				System.out.printf("%s ",dez[oi]);
			}else if(aux2[1] == 6){
				oi = 6;
				System.out.printf("%s ",dez[oi]);
			}else if(aux2[1] == 7){
				oi = 7;
				System.out.printf("%s ",dez[oi]);
			}else if(aux2[1] == 8){
				oi = 8;
				System.out.printf("%s ",dez[oi]);
			}else if(aux2[1] == 9){
				oi = 9;
				System.out.printf("%s ",dez[oi]);
			}else if(aux2[1] == 0){
				oi = 10;
				System.out.printf("%s ",dez[oi]);
			}
		}else if(aux2[0] != 0){
			oi = aux2[0] + 10;
			System.out.printf("%s ",dez[oi]);
			if(aux2[1] != 0 ){
				System.out.print(" e ");
				System.out.printf("%s ",unid[aux2[1]]);
			}
		}else if(aux2[1] != 0 ){
			System.out.printf("%s ",unid[aux2[1]]);
		}
		
		if(aux2[0] == 0 && aux2[1] == 1){
			System.out.print("Centavo");
		}else if (aux2[0] != 0 || aux2[1] != 0){
			System.out.print("Centavos");
		}
		
//--------------------------------------------------------------
		
	}

	
	public static void main(String[] args) {

		entrada = new Scanner(System.in);
		
		System.out.println("A quantia que pode ser escrita vai de 0,00 a 999999999,99");
		
		System.out.print("Digite a quantia: ");
		
		String number = entrada.next();
		
		extendendo(number);

	}


}
