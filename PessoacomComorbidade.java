package Projeto_Generation_Bloco1;

public class PessoacomComorbidade extends Pessoa {

	protected int comorbidade;
	

	public int getcomorbidade() {
		return comorbidade;
	}

	public void setcomorbidade(int comorbidade) {
		
		this.comorbidade = comorbidade;
		if(this.comorbidade ==1||this.comorbidade==2||this.comorbidade==3||this.comorbidade==4) {
			System.out.println("Você faz parte do grupo de risco, e irá se vacinar entre o dia de amanhã até o dia 20 deste mes");
			
		}

		
	}
	}
