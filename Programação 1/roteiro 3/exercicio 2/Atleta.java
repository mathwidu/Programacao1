public class Atleta {

	//atributos
	private String nome;
	private int idade;

	
	//construtor padrão
	public Atleta(){
		
	}
	
	public Atleta(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade(){
		return idade;
	}
	
	public void setIdade(int i){
		if(idade<=0)
			System.out.println("Erro");
		else idade = i;
	}
	
}