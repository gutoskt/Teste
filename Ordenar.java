import java.util.Scanner;
public class Ordenar{


	private int [] vet;
	private int tamanho;

	Ordenar(){
		this.setTamanho(11);
		vet = new int [getTamanho()];
	}

	public int getTamanho(){
		return this.tamanho;
	}
	public void setTamanho(int tamanhoS){
		this.tamanho = tamanhoS;
	}

	public int getElemento(int posicao){
		return this.vet[posicao];
	}
	public void setElemento(int posicao, int valor){
		this.vet[posicao] = valor;
	}

	public void CriarVetor(){

		int cont, entrada;
		Scanner leitura = new Scanner(System.in);

		for(cont = 0; cont < getTamanho(); cont++){

			entrada = leitura.nextInt();
			setElemento(cont, entrada);
		}

	}

	public void imprimeVetor(){

		int cont;

		for(cont = 0; cont < getTamanho(); cont++){

			System.out.println(getElemento(cont));
		}

	}

	public void OrdenarVetor(){

		int cont, auxiliar, cont1;
		for(cont = 0; cont < getTamanho(); cont++){
			for(cont1 = 0; (cont1 < getTamanho() - 1); cont1++){

				if(getElemento(cont1) < getElemento(cont1 + 1)){

					auxiliar = getElemento(cont1);
					setElemento(cont1, getElemento(cont1 + 1));
					setElemento(cont1 + 1, auxiliar);

				}
			}
		}
	}

	public void Mediana(){


		int cont1, cont2, maior, maior2,cont,maior3,maior4,maior5,maior6, maiorAntigo, maiorx;

		
		maior = getElemento(0);
		maiorAntigo = 0;

		for(cont1 = 0; cont1 < getTamanho(); cont1++){

			
			if(maior < getElemento(cont1)){

				maior = getElemento(cont1);
				maiorAntigo = getElemento(cont1);
			}

		}

		/*maior2 = 0;
		for(cont1 = 0; cont1 < getTamanho(); cont1++){
	
			if(maiorAntigo > getElemento(cont1) && maior2 < getElemento(cont1)){

				maior2 = getElemento(cont1);

			}		
		}
		maiorAntigo = maior2;

		maior3 = 0;
		for(cont1 = 0; cont1 < getTamanho(); cont1++){
	
			if(maiorAntigo > getElemento(cont1) && maior3 < getElemento(cont1)){

				maior3 = getElemento(cont1);

			}
					
		}
		maiorAntigo = maior3;

		maior4 = 0;
		for(cont1 = 0; cont1 < getTamanho(); cont1++){
	
			if(maiorAntigo > getElemento(cont1) && maior4 < getElemento(cont1)){

				maior4 = getElemento(cont1);

			}
					
		}

		maiorAntigo = maior4;

		maior5 = 0;
		for(cont1 = 0; cont1 < getTamanho(); cont1++){
	
			if(maiorAntigo > getElemento(cont1) && maior5 < getElemento(cont1)){

				maior5 = getElemento(cont1);

			}		
		}
		maiorAntigo = maior5;

		maior6 = 0;
		for(cont1 = 0; cont1 < getTamanho(); cont1++){
	
			if(maiorAntigo > getElemento(cont1) && maior6 < getElemento(cont1)){

				maior6 = getElemento(cont1);

			}
				
		}
		maiorAntigo = maior6;	
		*/

		maiorx = 0;
		for(cont2 = 0; cont2 < 6; cont2++){
			for(cont1 = 0; cont1 < getTamanho(); cont1++){
				

				if(maiorAntigo > getElemento(cont1) && maiorx < getElemento(cont1)){

					maiorx = getElemento(cont1);

				}		
			}
			maiorAntigo = maiorx;
			System.out.println(maiorx);
		}


		/*System.out.println(maior);
		System.out.println(maior2);
		System.out.println(maior3);
		System.out.println(maior4);
		System.out.println(maior5);*/
		//System.out.println(maior6);
		/*System.out.println();
		System.out.println(maiorx);*/


	}
}