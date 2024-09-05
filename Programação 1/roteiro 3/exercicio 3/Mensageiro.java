

public class Mensageiro {
    public String nome;
    public String mensagem;
    public Mensageiro destino;
    public Mensageiro(String nome){
        this.nome = nome;
    }

    public void setDestino(Mensageiro m){
        this.destino = m;
    }

    public void receberMensagem(String mensagem){
        this.mensagem = mensagem;
    }



    public void enviarMensagem(){
        if (destino == null){
            System.out.println(this.nome + " " + this.mensagem);
        } else{ 
            destino.receberMensagem(this.mensagem);
        }
    }










}