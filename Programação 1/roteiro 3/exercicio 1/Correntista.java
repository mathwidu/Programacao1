public class Correntista {
    public String nome;
    private String endereco;
    private Conta c;

public Correntista(){

}
public Correntista(String nome, String endereco){
    this.nome = nome;
    this.endereco = endereco;
}
public String getNome(){
    return nome;
}
public String getEndereco(){
    return endereco;
}
public void setNome (String nome){
    this.nome = nome;
}
public void setEndereco(String endereco){
    this.endereco = endereco;
}
public Conta getC(){
    return c;
}
public void setC(Conta c){
    this.c = c;
}
}
