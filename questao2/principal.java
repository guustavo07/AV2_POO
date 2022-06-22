package questao2;
import java.util.Scanner;
import java.util.ArrayList;

public class principal {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int id_aluno,id_prova,ano,nota, notaTotal = 0; 
		String nome, titulo; 

		 ArrayList<ProvaEnem> provas = new ArrayList<> (); 
		System.out.println("Informe o ID do aluno: ");
		id_aluno=ler.nextInt();
		System.out.println("Informe o nome do aluno: ");
		nome=ler.next();
		System.out.println("Informe o ano: ");
		ano=ler.nextInt();
			 
		 AlunoEnem a1 = new AlunoEnem(id_aluno, nome, ano);
		 
		 for(int i=0;i<=5;i++) {
			System.out.println("Informe o ID da Prova: ");
			id_prova=ler.nextInt();
			System.out.println("Informe o titulo da Prova: ");
			titulo=ler.next();
			System.out.println("Informe a nota: ");
			nota=ler.nextInt();
			
			ProvaEnem prova1 = new ProvaEnem (id_prova, titulo, nota);
			provas.add(prova1);
			
			notaTotal+=prova1.getNota();
			
		 }
		 System.out.println("A nota total do aluno "+nome+" é: "+notaTotal);
	}

}
