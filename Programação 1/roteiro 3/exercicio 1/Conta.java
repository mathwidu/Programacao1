public class Conta {

    private int numero;
 
    private double saldo;
    
    private Correntista cc;

    public Conta(){    
 
    }
    public Conta(int numero, double saldo){
       this.numero = numero;
       this.saldo = saldo;
    }
    public Conta(int numero, double saldo, Correntista cc, double limite){
       this.numero = numero;
       this.saldo = saldo;
       this.cc = cc;
    }
    public Correntista getCc(){
       return cc;
    }
    public void setCc(Correntista cc){
       this.cc = cc;
    }
    public int getNumero() {
 
           return numero;
    }
 
    public void setNumero(int numero) {
 
           this.numero = numero;
    }
 
    public double getSaldo() {
 
           return saldo;
    }
 
    public void retirar(double valor){
       saldo = saldo - valor;
    }
 
    public void depositar(double valor){
 
           saldo = saldo + valor;
    }
 
    public void transferir(double valor, Conta destino){
 
           if(saldo>=valor){
 
                  saldo = saldo - valor;
 
                  destino.depositar(valor);
 
           }else System.out.printf("Valor indisponível!\n");
    }
    public void extrato(){
       System.out.println(cc.getNome() + " seu saldo é: " + saldo);
    }
    }