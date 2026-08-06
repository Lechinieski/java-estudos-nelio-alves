package application;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Aluguel;
import entities.Cliente;
import entities.Filme;

public class Program {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int opcao;
		
		List<Cliente>listaClientes = new ArrayList<>();
		List<Filme>listaFilmes=new ArrayList<>();
		List<Aluguel>listaAluguel=new ArrayList<>();
		List<Aluguel>historicoAluguel= new ArrayList<>();
		
		do {
		System.out.println();	
		System.out.printf("===== LOCADORA =====%n");
		System.out.printf("%n1 - Cadastrar Cliente%n");
		System.out.println("2 - Cadastrar Filme");
		System.out.println("3 - ALugar Filme");
		System.out.println("4 - Devolver Filme");
		System.out.println("5 - Listar Clientes");
		System.out.println("6 - Listar Filmes");
		System.out.println("7 - Listar Aluguéis");
		System.out.println("8 - Histórico de Aluguéis");
		System.out.printf("0 - Sair%n");
		System.out.printf("Escolha uma opção:%n");
		
		opcao=sc.nextInt();
		sc.nextLine();
		
		System.out.println();
		
		switch(opcao) {
		
		case 1:
		System.out.println("Cadastrar Cliente");
		
		System.out.print("Nome: ");
		String nome=sc.nextLine();
		
		System.out.print("CPF: ");
		String CPF=sc.nextLine();
		
		boolean cpfExiste = false;
		
		for(Cliente c : listaClientes) {
			if(c.getCPF().equals(CPF)) {
				cpfExiste=true;
				break;
			}
		}
		if (cpfExiste) {
			System.out.println("Já existe um cliente cadastrado com esse CPF.");
		}else {
		
		Cliente cliente= new Cliente(nome,CPF);
		
		listaClientes.add(cliente);
		
		System.out.println("Cliente cadastrado com sucesso!");
		}
		break;
		
		
		case 2:
		System.out.printf("Cadastrar Filme%n");
		
		System.out.println("Título: ");
		String titulo=sc.nextLine();
		
		System.out.println("Gênero: ");
		String genero=sc.nextLine();
		
		System.out.println("Ano: ");
		int ano=sc.nextInt();
		sc.nextLine();
		
		boolean filmeExiste= false;
		
		for(Filme f : listaFilmes) {
			if(f.getTitulo().equalsIgnoreCase(titulo)
					&& f.getAno()== ano) {
				filmeExiste=true;
				break;
			}
		}
		
		if(filmeExiste) {
			System.out.println("Esse filme já está cadastrado.");
		}else {
		
		Filme filme=new Filme(titulo, genero, ano, true);
		
		listaFilmes.add(filme);
		
		System.out.println("Filme cadastrado com sucesso!");
		}
		break;
		
		case 3:
		System.out.println("=== Alugar Filme ===");
		
		if(listaClientes.isEmpty()) {
			System.out.println("Nenhum cliente cadastrado.");
			break;
		}
		//Monta lista apenas com filmes disponíveis
		List<Filme> filmesDisponiveis=new ArrayList<>();
		
		for(Filme f : listaFilmes) {
			if(f.isDisponivel()) {
				filmesDisponiveis.add(f);
			}
		}
		
		//Verifica se existe filme disponível
		if(filmesDisponiveis.isEmpty()) {
			System.out.println("Nenhum filme disponível.");
			break;
		}
		//Escolher cliente
		System.out.println("Escolha o cliente:");
		for(int i=0; i< listaClientes.size(); i++) {
			System.out.println((i+1) + " - "+ listaClientes.get(i).getNome());
		}
		
		int indiceCliente=sc.nextInt()-1;
		sc.nextLine();
		
		if(indiceCliente <0 || indiceCliente>= listaClientes.size()) {
			System.out.println("Cliente inválido.");
			break;
		}
		
		Cliente clienteEscolhido = listaClientes.get(indiceCliente);
		
		//Escolher filme
		System.out.println("Escolha o filme:");
		
		for(int i=0; i< filmesDisponiveis.size(); i++) {
			System.out.println((i+1) + " - " +filmesDisponiveis.get(i).getTitulo());
		}
		
		int indiceFilme=sc.nextInt()-1;
		sc.nextLine();
		
		if(indiceFilme<0 || indiceFilme>= filmesDisponiveis.size()) {
			System.out.println("Filme inválido.");
			break;
		}
		
		Filme filmeEscolhido = filmesDisponiveis.get(indiceFilme);
		
		Aluguel aluguel=new Aluguel (clienteEscolhido, filmeEscolhido);
			listaAluguel.add(aluguel);
			
			filmeEscolhido.setDisponivel(false);
			
			System.out.println("Filme alugado com sucesso!");
			break;
		
		case 4: 
		System.out.println("=== Devolver Filme ===");
		
		if(listaAluguel.isEmpty()) {
		System.out.println("Nenhum aluguel ativo.");
		break;
		}
		
		System.out.println("Escolha o aluguel para devolver:");
		
		for(int i=0; i<listaAluguel.size();i++) {
			
			Aluguel aluguel1 = listaAluguel.get(i);
			
			System.out.println((i+1) 
					+" - Cliente: "
					+ aluguel1.getCliente().getNome()
					+" | Filme: "
					+ aluguel1.getFilme().getTitulo());
		}
		
		int indiceAluguel=sc.nextInt()-1;
		sc.nextLine();
		
		if(indiceAluguel <0 || indiceAluguel >= listaAluguel.size()) {
			System.out.println("Aluguel inválido.");
			break;
		}
		
		Aluguel aluguelEscolhido = listaAluguel.get(indiceAluguel);
		
		aluguelEscolhido.getFilme().setDisponivel(true);
		
		aluguelEscolhido.setDataDevolucao(LocalDate.now());
		
		historicoAluguel.add(aluguelEscolhido);
		
		listaAluguel.remove(indiceAluguel);
		
		System.out.println("Filme devolvido com sucesso!");
		break;
		
		
		case 5:
		System.out.println("=== CLIENTES ===");
		
		if (listaClientes.isEmpty()) {
			System.out.println("Nenhum cliente cadastrado.");
		}else {
		for(int i=0; i < listaClientes.size(); i++) {
			System.out.println((i+1)+ " - " + listaClientes.get(i));
		 }
		}
		break;
		
		case 6:
		System.out.println("=== FILMES ===");
		
		if(listaFilmes.isEmpty()) {
			System.out.println("Nenhum filme cadastrado.");
		}else {
			for(int i=0; i < listaFilmes.size(); i++) {
				Filme f = listaFilmes.get(i);
				System.out.println((i+1)+ " - "+ f);
		 }
		}
		
		break;
		
		case 7:
			System.out.println("=== ALUGUÉIS ATIVOS ===");
			
			if (listaAluguel.isEmpty()) {
				
				System.out.println("Nenhum aluguel ativo.");
				
			}else {
				
				for(int i=0; i<historicoAluguel.size();i++) {
					
					Aluguel aluguel1 = historicoAluguel.get(i);
					
					System.out.println((i+1)
							+ " - Cliente: "
							+ aluguel1.getCliente().getNome()
							+" | Filme: "
							+aluguel1.getFilme().getTitulo()
							+" | Data do aluguel: "
							+ aluguel1.getDataAluguel());
				}
			}
			break;
		case 8:
			
			System.out.println("=== HISTÓRICO DE ALUGUÉIS ===");
			
			if(historicoAluguel.isEmpty()) {
				
				System.out.println("Nenhum aluguel devolvido.");
			}else {
				
				for(int i=0; i< historicoAluguel.size();i++) {
					
					Aluguel aluguel1 = historicoAluguel.get(i);
					
					System.out.println((i +1)
							+" - Cliente: "
							+ aluguel1.getCliente().getNome()
							+" | Filme: "
							+ aluguel1.getFilme().getTitulo()
							+" | Alugado em: "
							+ aluguel1.getDataAluguel()
							+" | Devolvido em: "
							+aluguel1.getDataDevolucao());
				}
			}
			
			break;
			
		case 0:
		System.out.println("Encerrando...");
		break;
		
		default:
		System.out.println("Opção Invalida");
		break;
		
		 }
		}while(opcao !=0);
		
		
		
		
		sc.close();
	}

}
