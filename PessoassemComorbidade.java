package Projeto_Generation_Bloco1;

public class PessoassemComorbidade extends Pessoa {
	

	public int setData(int idade) {
		this.idade = idade;
		
		if(idade>=80) {
			System.out.println("Seu dia de vacinação será de amanhã e irá até o dia 20 deste mes");
			
		}
		
		else if(idade>=70 && idade<80) {
			System.out.println("Seu dia de vacinação será do dia 21 até o dia 28 de agosto");	
			
		}
		else if(idade>=60 && idade<70) {
			System.out.println("Seu dia de vacinação será do dia 29 de agosto até o dia 12 de setembro");	
			
		}
		else if(idade>=50 && idade<60) {
			System.out.println("Seu dia de vacinação será do dia 13 de setembro até o dia 27");	
			
		}
		else if(idade>=40 && idade<50) {
			System.out.println("Seu dia de vacinação será do dia 28 de setembro até o dia 12 de outubro");	
			
		}
		else if(idade>=30 && idade<40) {
			System.out.println("Seu dia de vacinação será do dia 13 de outrubro até o dia 26");	
			
		}
		else if(idade>=18 && idade<=29) {
			System.out.println("Seu dia de vacinação será do dia 27 de outubro até o dia 10 de novembro");	
			
		}
		else if(idade<18) {
			System.out.println("Ainda não chegou seu momento de se vacinar");
		}
		
		return idade;
	}

}