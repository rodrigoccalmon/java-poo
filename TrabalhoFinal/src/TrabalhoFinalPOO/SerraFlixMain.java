package TrabalhoFinalPOO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SerraFlixMain {
	static Biblioteca biblioteca = new Biblioteca();
	static Temporada temporada = new Temporada();
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("SERRAFLIX - BEM VINDO(A)!");

		Filme f1 = new Filme(10, "Harry Potter e Ordem da F�nix ", Categoria.FANTASIA, 2.5);
		Filme f2 = new Filme(9, "Senhor dos An�is e a Sociedade do Anel", Categoria.FANTASIA, 3.0);
		Filme f3 = new Filme(10, "Pineapple Express", Categoria.COMEDIA, 2.0);		
		List<Filme> filmes = new ArrayList<>();
		filmes.add(f1);
		filmes.add(f2);
		filmes.add(f3);

		biblioteca.adicionarFilme(f1);
		biblioteca.adicionarFilme(f2);
		biblioteca.adicionarFilme(f3);

		System.out.println("CAT�LAGO DE FILMES CADASTRADOS: ");
		System.out.println("==================================");		
		for (int i = 0; i < filmes.size(); i++) {
			System.out.println("Nome do filme: "+filmes.get(i).getNome());
			System.out.println("Nota: " +filmes.get(i).getPontuacao());
			System.out.println("Categoria: " +filmes.get(i).getCategoria());
			System.out.println("==================================");
		}

		Serie s1 = new Serie(10,"Freaks and Geeks",Categoria.COMEDIA);
		Serie s2 = new Serie(10,"Breaking Bad",Categoria.FANTASIA);
		Serie s3 = new Serie(10,"Terror",Categoria.TERROR);

		List<Serie> series = new ArrayList<>();
		series.add(s1);
		series.add(s2);
		series.add(s3);

		s1.setTemporada(10, 1);
		s2.setTemporada(15, 3);
		s3.setTemporada(12, 5);

		biblioteca.adicionarSerie(s1);
		biblioteca.adicionarSerie(s2);
		biblioteca.adicionarSerie(s3);

		System.out.println("CAT�LAGO DE S�RIES CADASTRADAS: ");
		System.out.println("==================================");
		for (int y = 0; y < series.size(); y++) {
			System.out.println("Nome da s�rie: "+series.get(y).getNome());
			System.out.println("Nota: " +series.get(y).getPontuacao());
			System.out.println("Categoria: " +series.get(y).getCategoria());
			System.out.println("==================================");
		}
		
		chamaMenuPrincipal();

	}	


		public static void chamaMenuPrincipal() {
			int op = 0;
			Scanner scan = new Scanner(System.in);
					
			do {
				System.out.println("=========== MENU PRINCIPAL =============");
				System.out.println("Digite o n�mero relacionado a op��o escolhida:");
				System.out.println("1 - Cadastrar");
				System.out.println("2 - Editar");
				System.out.println("3 - Remover");
				System.out.println("4 - Classificar");
				System.out.println("5 - Listar");
				System.out.println("0 - Sair do programa");
				System.out.println("=========================================");
				System.out.println("Digite a op��o desejada....");
				

				switch (scan.nextInt()) {
				case 1:
					menuCadastrar();
					break;
				case 2:
					menuEditar();
					break;
				case 3:
					menuRemover();
					break;
				case 4:
					menuClassificar();
					break;
				case 5:
					menuListar();
					break;
				case 0:
					scan.close();
					break;
				default:
					System.out.println("Digite uma op��o v�lida.");
					chamaMenuPrincipal();
					break;
				}
			} while (op != 0);
		}
			
	private static void menuCadastrar() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("O que voc� deseja Cadastrar?");
		System.out.println("(1) FILME  |   (2) S�RIE");
		System.out.println("Se desejar voltar ao Menu Principal, digite 0.");
		int entradaScan = scanner.nextInt();
		int op = 0;
		
		do {
			switch (entradaScan){
			case 1:
				cadastrarNovoFilme();
				break;
			case 2:
				cadastrarNovaSerie();
				break;
			case 0:
				chamaMenuPrincipal();
				break;
			default:
				System.out.println("Digite uma op��o v�lida.");
				menuCadastrar();
				break;
			}
		} while (op!= 0);
		
		scanner.close();
	}
	
	private static void cadastrarNovoFilme() {
		
		System.out.println(" == CADASTRO DE NOVO FILME ==");
		
		Scanner scanner = new Scanner(System.in);
		
		int entradaScan;
		int pontuacaoFilme;
		double duracaoFilme;
		String nomeFilme;
		Categoria categoriaFilme = null;
		
		System.out.println("Qual � o Nome do Filme?");
		System.out.println(">");
		nomeFilme = scanner.nextLine();

		System.out.println("Qual � a pontua��o do Filme?");
		System.out.println(" Digite um valor entre 0 e 5");
		System.out.println(">");
		pontuacaoFilme = scanner.nextInt();
		
		try {
			if (pontuacaoFilme < 0 || pontuacaoFilme > 5) {
				System.out.println("Digite um valor v�lido.");	
			}
			} catch (ClassificacaoForaDoRange e) {
				e.getMessage();
				menuCadastrar();
			}
		
		/*if (pontuacaoFilme < 0 || pontuacaoFilme > 5) {
			System.out.println("Digite um valor v�lido.");
			menuCadastrar();
		}*/
		
		System.out.println("Qual � a Categoria do Filme?");
		System.out.println("1 - FANTASIA");
		System.out.println("2 - TERROR");
		System.out.println("3 - COMEDIA");
		entradaScan = scanner.nextInt();

		switch (entradaScan) {
		case 1:
			categoriaFilme = Categoria.FANTASIA;
			break;
		case 2:
			categoriaFilme = Categoria.TERROR;
			break;
		case 3:
			categoriaFilme = Categoria.COMEDIA;
			break;
		default:
			System.out.println("Digite uma op��o v�lida.");
			menuCadastrar();
		}
		
		System.out.println("Qual � a dura��o do Filme?");
		System.out.println(">");
		duracaoFilme = scanner.nextDouble();
		
		Filme filme = new Filme(pontuacaoFilme, nomeFilme, categoriaFilme, duracaoFilme);
		
		biblioteca.adicionarFilme(filme);
		//biblioteca.programas.add(filme);
		
		System.out.println("Filme cadastrado com sucesso!");
		System.out.println(".........");
		System.out.println("Deseja cadastrar um Novo Filme?");
		System.out.println("1 - Sim");
		System.out.println("2 - Voltar ao Menu de Cadastro");
		System.out.println("0 - Voltar ao Menu Principal");
		entradaScan = scanner.nextInt();
		
		switch(entradaScan) {
		case 1:
			cadastrarNovoFilme();
			break;
		case 2:
			menuCadastrar();
			break;
		case 0:
			chamaMenuPrincipal();
			break;
		}
		
		scanner.close();
		
	}
		
	private static void cadastrarNovaSerie() {
		
		System.out.println(" == CADASTRO DE NOVA S�RIE ==");
		
		Scanner scanner = new Scanner(System.in);
		
		int entradaScan;
		int pontuacaoSerie;
		int temporadaSerie;
		int episodioSerie;
		String nomeSerie;
		Categoria categoriaSerie = null;
		
		System.out.println("Qual � o Nome da s�rie?");
		System.out.println(">");
		nomeSerie = scanner.nextLine();

		System.out.println("Qual � a pontua��o da s�rie?");
		System.out.println(">");
		pontuacaoSerie = scanner.nextInt();
		
		try {
			if (pontuacaoSerie < 0 || pontuacaoSerie > 10) {
				System.out.println("Digite um valor v�lido.");
			}
						
			} catch (ClassificacaoForaDoRange e) {
				e.getMessage();
				menuCadastrar(); 
			}
		
		/*if (pontuacaoSerie < 0 || pontuacaoSerie > 10) {
			System.out.println("Digite um valor v�lido.");
			menuCadastrar();
		}*/
		
		System.out.println("Qual � a Categoria da s�rie?");
		System.out.println("1 - FANTASIA");
		System.out.println("2 - TERROR");
		System.out.println("3 - COMEDIA");
		entradaScan = scanner.nextInt();

		switch (entradaScan) {
		case 1:
			categoriaSerie = Categoria.FANTASIA;
			break;
		case 2:
			categoriaSerie = Categoria.TERROR;
			break;
		case 3:
			categoriaSerie = Categoria.COMEDIA;
			break;
		default:
			System.out.println("Digite uma op��o v�lida.");
		}
		
		System.out.println("Qual o n�mero da Temporada voc� deseja cadastrar?");
		System.out.println(">");
		temporadaSerie = scanner.nextInt();
	
		System.out.println("Quantos Epis�dios a Temporada informada tem?");
		System.out.println(">");
		episodioSerie = scanner.nextInt();

		Temporada temporada = new Temporada();
		temporada.setNumeroTemporada(temporadaSerie);
		temporada.setQuantidadeEpisodios(episodioSerie);

		Serie serie = new Serie(pontuacaoSerie, nomeSerie, categoriaSerie);
		serie.adicionarTemporada(temporada);

		biblioteca.adicionarSerie(serie);
		//biblioteca.programas.add(serie);
		
		System.out.println("S�rie cadastrada com sucesso!");
		System.out.println(".........");
		System.out.println("Deseja cadastrar uma Nova S�rie?");
		System.out.println("1 - Sim");
		System.out.println("2 - Voltar ao Menu de Cadastro");
		System.out.println("0 - Voltar ao Menu Principal");
		entradaScan = scanner.nextInt();
		
		switch(entradaScan) {
		case 1:
			cadastrarNovaSerie();
			break;
		case 2:
			menuCadastrar();
			break;
		case 0:
			chamaMenuPrincipal();
			break;
		}
		
		scanner.close();
		
	}
		
	private static void menuEditar() {
	
	}
	
	private static void mostraProgramas() {
		System.out.println("CAT�LAGO DE PROGRAMAS CADASTRADOS - FILMES e S�RIES: ");
		System.out.println("==================================");
		
	    int i = 0;
	    for (Programa programa: biblioteca.programas) {
	    	System.out.println("C�DIGO DO PROGRAMA: " + i + "\n" + programa + "\n");
	        i++;
	    }
	}
	
	private static void menuRemover() {
		
		System.out.println(" == MENU DE REMO��O ==\n");
		System.out.printf("POR FAVOR, INFORME O C�DIGO DO PROGRAMA QUE VOC� DESEJA REMOVER: \n");
		
		mostraProgramas();
		
	    Scanner scanner = new Scanner(System.in);
		
	    int codigoPrograma = scanner.nextInt();

	    try {
	      biblioteca.removerPrograma(codigoPrograma);
	      System.out.println("Programa Removido com Sucesso!\n\n");
	      mostraProgramas();
	    } catch (IndexOutOfBoundsException e) {
	        // exceção lançada para indicar que um índice (i)
	        // está fora do intervalo válido (de 0 até agenda.size()-1)
	        System.out.println("\nErro: Posi��o inv�lida: "+ e.getMessage());
	    }
	    
	    System.out.println("O que voc� deseja fazer agora?");
		System.out.println("0 - Voltar ao Menu Principal");
		System.out.println("4 - Remover outra op��o");
		int entradaScan = scanner.nextInt();
		
		switch(entradaScan) {
		case 0:
			chamaMenuPrincipal();
			break;
		case 4:
			menuRemover();
			break;
		default:
			System.out.println("Digite uma op��o v�lida.");
			menuRemover();
			break;
		}
		scanner.close();
	}
	
	private static void menuClassificar() {
	
		System.out.println("===== MENU DE CLASSIFICAÇÃO =====");
		System.out.println("Qual op��o voc� deseja Classificar?");
		System.out.println("1 - Filmes");
		System.out.println("2 - S�ries");
		scanner.nextInt();
		
		
		
	}
	
	private static void menuListar() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("===== MENU DE OP��ES DE LISTAGEM =====");
		System.out.println("Qual op��o voc� deseja Listar?");
		System.out.println("1 - Filmes");
		System.out.println("2 - S�ries");
	
		int entradaScan = scanner.nextInt();
		
		switch(entradaScan) {
		case 1:
			menuListaFilme();
			break;
		case 2:
			menuListaSerie();
			break;
		default:
			System.out.println("Op��o inv�lida.");
			menuListar();
			break;
		}
		
		scanner.close();
	}

	private static void menuListaFilme() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual Categoria de Filme voc� deseja visualizar?");
		System.out.println(" 1 - FANTASIA");
		System.out.println(" 2 - TERROR");
		System.out.println(" 3 - COM�DIA");
		System.out.println("0 - Voltar ao Menu Principal");

		Categoria categoriaFilme = null;
		
		int entradaScan = scanner.nextInt();
		
		if (entradaScan == 1) {
			categoriaFilme = Categoria.FANTASIA;
			System.out.println("CAT�LADO DE FILMES DE FANTASIA CADASTRADOS: ");
			System.out.println("==================================");
			for (int i = 0; i < biblioteca.getProgramas().size() ; i++) {
				if (biblioteca.getProgramas().get(i) instanceof Filme) {
					Filme f = (Filme) biblioteca.getProgramas().get(i);
					if (f.categoria == categoriaFilme) {
						System.out.println(f.toString());
					}
				}
			}
			System.out.println("==================================");
		}

		if (entradaScan == 2) {
			categoriaFilme = Categoria.TERROR;
			System.out.println("CAT�LAGO DE FILMES DE TERROR CADASTRADOS: ");
			System.out.println("==================================");
			for (int i = 0; i < biblioteca.getProgramas().size() ; i++) {
				if (biblioteca.getProgramas().get(i) instanceof Filme) {
					Filme f = (Filme) biblioteca.getProgramas().get(i);
					if (f.categoria == categoriaFilme) {
						System.out.println(f.toString());
					}
				}
			}
			System.out.println("==================================");
		}
		
		if (entradaScan == 3) {
			categoriaFilme = Categoria.COMEDIA;
			System.out.println("CAT�LAGO DE FILMES DE COM�DIA CADASTRADOS: ");
			System.out.println("==================================");
			for (int i = 0; i < biblioteca.getProgramas().size() ; i++) {
				if (biblioteca.getProgramas().get(i) instanceof Filme) {
					Filme f = (Filme) biblioteca.getProgramas().get(i);
					if (f.categoria == categoriaFilme) {
						System.out.println(f.toString());
					}
				}
			}
			System.out.println("==================================");
		}
		
		System.out.println("O que voc� deseja fazer agora?");
		System.out.println("0 - Voltar ao Menu Principal");
		System.out.println("4 - Listar outra op��o");
		entradaScan = scanner.nextInt();
		
		switch(entradaScan) {
		case 0:
			chamaMenuPrincipal();
			break;
		case 4:
			menuListaFilme();
			break;
		default:
			System.out.println("Digite uma op��o v�lida.");
			menuListaFilme();
			break;
		}
		scanner.close();
	}
	
	private static void menuListaSerie() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual Categoria de s�rie voc� deseja visualizar?");
		System.out.println(" 1 - FANTASIA");
		System.out.println(" 2 - TERROR");
		System.out.println(" 3 - COM�DIA");
		System.out.println(" 0 - Voltar ao Menu Principal");

		Categoria categoriaSerie = null;
		
		int entradaScan = scanner.nextInt();
		
		if (entradaScan == 1) {
			categoriaSerie = Categoria.FANTASIA;
			System.out.println("CAT��AGO DE S�RIES DE FANTASIA CADASTRADAS: ");
			System.out.println("==================================");
			for (int i = 0; i < biblioteca.getProgramas().size() ; i++) {
				if (biblioteca.getProgramas().get(i) instanceof Serie) {
					Serie s = (Serie) biblioteca.getProgramas().get(i);
					if (s.categoria == categoriaSerie) {
						System.out.println(s.toString());
					}
				}
			}
			System.out.println("==================================");
		}

		if (entradaScan == 2) {
			categoriaSerie = Categoria.TERROR;
			System.out.println("CAT�LAGO DE S�RIES DE TERROR CADASTRADAS: ");
			System.out.println("==================================");
			for (int i = 0; i < biblioteca.getProgramas().size() ; i++) {
				if (biblioteca.getProgramas().get(i) instanceof Serie) {
					Serie s = (Serie) biblioteca.getProgramas().get(i);
					if (s.categoria == categoriaSerie) {
						System.out.println(s.toString());
					}
				}
			}
			System.out.println("==================================");
		}
		
		if (entradaScan == 3) {
			categoriaSerie = Categoria.COMEDIA;
			System.out.println("CAT�LAGO DE S�RIES DE COM�DIA CADASTRADAS: ");
			System.out.println("==================================");
			for (int i = 0; i < biblioteca.getProgramas().size() ; i++) {
				if (biblioteca.getProgramas().get(i) instanceof Serie) {
					Serie s = (Serie) biblioteca.getProgramas().get(i);
					if (s.categoria == categoriaSerie) {
						System.out.println(s.toString());
					}
				}
			}
			System.out.println("==================================");
		}
		
		System.out.println("O que voc� deseja fazer agora?");
		System.out.println("0 - Voltar ao Menu Principal");
		System.out.println("4 - Listar outra op��o");
		entradaScan = scanner.nextInt();
		
		switch(entradaScan) {
		case 0:
			chamaMenuPrincipal();
			break;
		case 4:
			menuListaSerie();
			break;
		default:
			System.out.println("Digite uma op��o v�lida.");
			menuListaSerie();
			break;
		}
		
		scanner.close();
	}

}

	


	


