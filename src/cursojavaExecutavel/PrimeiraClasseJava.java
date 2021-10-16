package cursojavaExecutavel;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import cursoJava.Aluno;
import cursoJava.Disciplina;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		Aluno  aluno1 = new Aluno();

		String nome = JOptionPane.showInputDialog("DIGITE SEU NOME: ");
		String idade = JOptionPane.showInputDialog("DIGITE SUA IDADE: ");
		String dataNasc = JOptionPane.showInputDialog("DIGITE SUA DATA DE NASC:: ");
		String rg = JOptionPane.showInputDialog("DIGITE SEU RG: ");
		String cpf = JOptionPane.showInputDialog("DIGITE SEU CPF: ");
		String nomeMae = JOptionPane.showInputDialog("DIGITE O NOME DA MÃE: ");
		String nomePai = JOptionPane.showInputDialog("DIGITE O NOME DO PAI: ");
		String dataMatricula = JOptionPane.showInputDialog("DIGITE A DATA DA MATRICULA: ");
		String serie = JOptionPane.showInputDialog("DIGITE A SERIE: ");
		String NomeEscola = JOptionPane.showInputDialog("DIGITE O NOME DA ESCOLA: ");

		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNasc(dataNasc);
		aluno1.setRg(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai); 
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setSerieMatriculada(serie);
		aluno1.setNomeEscola(NomeEscola);
		
		
        for(int pos =1; pos <= 4; pos++) {
        	String nomeDisciplina = JOptionPane.showInputDialog("DIGITE O NOME DA DISCIPLINA  ");
        	String notaDisciplina  = JOptionPane.showInputDialog("DIGITE O NOTA DA DISCIPLINA: ");
        	
        	Disciplina disciplina = new Disciplina();
        }
     
      int escolha =  JOptionPane.showConfirmDialog(null, "Deseja reover alguma disciplina?");
        
        if(escolha ==0) {
        	
        	
        	String disciplinaRemover = JOptionPane.showInputDialog("QUAL A DISCIPLINA REMOVER? ");
        	
        	aluno1.getDisciplina().remove(Integer.valueOf(disciplinaRemover).intValue()-1);
        }
        


		

	    System.out.println(aluno1.toString());
		System.out.println("MEDIA DO ALUNO: " + aluno1.getMediaNota());
		System.out.println("ALUNO APROVADO?: " + aluno1.getAprovado());
		System.out.println("=========================================");


		


		
		
		
		
		
	}

}
