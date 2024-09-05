public class Contato{
    private String nome;
    private String numero;
    private String email;
    private String endereco;
    public Contato[] listaDeContatos;

    public Contato (String nome, String numero, String email, String endereco){
        this.nome = nome;
        this.numero = numero;
        setEmail(email);
        this.endereco = endereco;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        if (email.contains("@")){
            this.email = email;
        } else{
            System.out.println("Email não valido");
        }
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getnumero(){
        return numero;
    }
    public void setNumero(String numero){
        this.numero = numero;
    }
    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
}