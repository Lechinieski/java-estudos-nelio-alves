package entities;



public class Filme {
	
	private String titulo;
	private String genero;
	private int ano;
	private boolean disponivel;
	
	public Filme(String titulo, String genero, int ano, boolean disponivel) {
		this.titulo = titulo;
		this.genero = genero;
		this.ano = ano;
		this.disponivel = disponivel;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public boolean isDisponivel() {
		return disponivel;
	}
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	public String toString() {
		
		String status = disponivel ? "Disponível" : "Alugado";
		
		return "Filme " + titulo  
			   +"| Gênero:" + genero 
			   +"| Ano: " + ano 
			   +"| Status: "+ status;
	}
	
	
}
