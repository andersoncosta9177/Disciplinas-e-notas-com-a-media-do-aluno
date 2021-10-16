package cursoJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Aluno {
	
	private String nome;
	private int idade;
	private String dataNasc;
	private String Rg;
	private String numeroCpf;
	private String nomePai;
	private String nomeMae;
	private String dataMatricula;
	private String serieMatriculada;
	private String nomeEscola;
	

private List<Disciplina>   disciplina = new ArrayList<Disciplina>();


	public Aluno() {
	}







	public List<Disciplina> getDisciplina() {
		return disciplina;
	}







	public void setDisciplina(List<Disciplina> disciplina) {
		this.disciplina = disciplina;
	}







	public Aluno(String nome, int idade, String dataNasc, String rg, String numeroCpf, String nomePai, String nomeMae,
			String dataMatricula, String serieMatriculada, String nomeEscola, double nota1, String disciplina1,
			double nota2, String disciplina2, double nota3, String disciplina3, double nota4, String disciplina4) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.dataNasc = dataNasc;
		Rg = rg;
		this.numeroCpf = numeroCpf;
		this.nomePai = nomePai;
		this.nomeMae = nomeMae;
		this.dataMatricula = dataMatricula;
		this.serieMatriculada = serieMatriculada;
		this.nomeEscola = nomeEscola;

	}







	







	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public int getIdade() {
		return idade;
	}




	public void setIdade(int idade) {
		this.idade = idade;
	}




	public String getDataNasc() {
		return dataNasc;
	}




	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}




	public String getRg() {
		return Rg;
	}




	public void setRg(String rg) {
		Rg = rg;
	}




	public String getNumeroCpf() {
		return numeroCpf;
	}




	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}




	public String getNomePai() {
		return nomePai;
	}




	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}




	public String getNomeMae() {
		return nomeMae;
	}




	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}




	public String getDataMatricula() {
		return dataMatricula;
	}




	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}




	public String getNomeEscola() {
		return nomeEscola;
	}




	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}




	public String getSerieMatriculada() {
		return serieMatriculada;
	}




	public void setSerieMatriculada(String serieMatriculada) {
		this.serieMatriculada = serieMatriculada;
	}






	//metodo que retorna a media do aluno
	public double getMediaNota() {
		double somaNotas = 0.0;
		for(Disciplina disciplina : disciplina) {
			somaNotas += disciplina.getNota();
			
		}
		return somaNotas / disciplina.size();
	} 
	
	
	
	
	public boolean getAprovado() {
		double media = this.getMediaNota();
		
		if(media >= 7) {
			return true;
		}else{
		return false;
		}
	}







	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNasc=" + dataNasc + ", Rg=" + Rg + ", numeroCpf="
				+ numeroCpf + ", nomePai=" + nomePai + ", nomeMae=" + nomeMae + ", dataMatricula=" + dataMatricula
				+ ", serieMatriculada=" + serieMatriculada + ", nomeEscola=" + nomeEscola + "]";
	}







	@Override
	public int hashCode() {
		return Objects.hash(Rg, dataMatricula, dataNasc, disciplina, idade, nome, nomeEscola, nomeMae, nomePai,
				numeroCpf, serieMatriculada);
	}







	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(Rg, other.Rg) && Objects.equals(dataMatricula, other.dataMatricula)
				&& Objects.equals(dataNasc, other.dataNasc) && Objects.equals(disciplina, other.disciplina)
				&& idade == other.idade && Objects.equals(nome, other.nome)
				&& Objects.equals(nomeEscola, other.nomeEscola) && Objects.equals(nomeMae, other.nomeMae)
				&& Objects.equals(nomePai, other.nomePai) && Objects.equals(numeroCpf, other.numeroCpf)
				&& Objects.equals(serieMatriculada, other.serieMatriculada);
	}




}
