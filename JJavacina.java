package Projeto_Generation_Bloco1;

import java.util.Scanner;

public class JJavacina {

	public static void main(String[] args) {

				int laudov=0;
				Scanner entrada = new Scanner(System.in);

				Pessoa p = new Pessoa();
			

				System.out.println("Por favor insira seu nome: ");
				p.setnome(entrada.nextLine());
				
				while(p.getnome().length()<=2 || p.getnome().length()>=30) {
					
					System.out.println("Nome incorreto ");
					System.out.println("Digite novamente");
					p.setnome(entrada.nextLine());
					
					}
				
									
				System.out.println("Digite sua idade: ");
				p.setidade(entrada.nextInt());
				
				while(p.getidade()<0 ||p.getidade()>130) {
					
					System.out.println("Idade incorreta");
					System.out.println("Digite novamente");
					p.setidade(entrada.nextInt());

					}


				if(p.getidade()>=80) {

						PessoassemComorbidade ps = new PessoassemComorbidade();
						ps.setnome(p.getnome());
						ps.setidade(p.getidade());

						System.out.println("Nome: " + ps.getnome());
						System.out.println("Idade: " + ps.getidade());
						System.out.println("-------------------------------------------------------");	
						ps.setData(ps.getidade());
						return;

					}
					if(p.getidade()<18) {

					PessoassemComorbidade ps = new PessoassemComorbidade();
					ps.setnome(p.getnome());
					ps.setidade(p.getidade());

					System.out.println("Nome: " + ps.getnome());
					System.out.println("Idade: " + ps.getidade());
					ps.setData(ps.getidade());
						return;
									}

				System.out.println("-------------------------------------------------------");	
				System.out.println("\nDigite o número caso tenha alguma dessas comorbidades: ");
				System.out.println();
				System.out.println("1-Obesidade grau 3" + "\n" + "2-Diabetes" + "\n" + "3-Doença do coração " + "\n"
						+ "4-Doença respiratória " + "\n" + "5-Caso tenha nehuma dessa opções \n");
				p.setpresençadeComorbidade(entrada.nextInt());

				while (p.getpresençadeComorbidade() < 1 || p.getpresençadeComorbidade() >=6 ) {
					System.out.println("Comorbidade incorreta ");
					System.out.println("Digite novamente");
					p.setpresençadeComorbidade(entrada.nextInt());
				}

				if (p.getpresençadeComorbidade() == 1 || p.getpresençadeComorbidade() == 2 || p.getpresençadeComorbidade() == 3
						|| p.getpresençadeComorbidade() == 4) {
					PessoacomComorbidade pc = new PessoacomComorbidade();

					pc.setnome(p.getnome());
					pc.setidade(p.getidade());
					
					System.out.println("-------------------------------------------------------");
					System.out.println("\nNome: " + pc.getnome());
					System.out.println("Idade: " + pc.getidade());
					pc.setcomorbidade(p.getpresençadeComorbidade());

				}  else if (p.getpresençadeComorbidade() == 5) {
					System.out.println("--------------------------------------------------------");	
					System.out.println("Digite o número respectivo de sua complicação médica:");
					System.out.println();
					System.out.println("1-Voce toma algum remédio anticoagulante "+"\n"+"2-Voce tem alergia a algum componente da vacina"+"\n"+"3-nehuma das opções \n");
						p.setComplicavacia(entrada.nextInt());
						
						
				    if (p.getComplicavacia() == 3) {
				    	
						PessoassemComorbidade ps = new PessoassemComorbidade();
						ps.setnome(p.getnome());
						ps.setidade(p.getidade());

						System.out.println("-------------------------------------------------------");
						System.out.println("Nome: " + ps.getnome());
						System.out.println("Idade: " + ps.getidade());
						ps.setData(ps.getidade());
					}
						
						
				
					laudov=entrada.nextInt();
					if(laudov==1) {
						
						PessoassemComorbidade ps = new PessoassemComorbidade();
						ps.setnome(p.getnome());
						ps.setidade(p.getidade());

						System.out.println("-------------------------------------------------------");
						System.out.println("Nome: " + ps.getnome());
						System.out.println("Idade: " + ps.getidade());
						ps.setData(ps.getidade());
					}
						if(laudov==2) {
							
							System.out.println("-------------------------------------------------------");
							System.out.println("infelizmente voce não poderá se vacinar.");
						}
					
					
				}
				entrada.close();
			}

		}