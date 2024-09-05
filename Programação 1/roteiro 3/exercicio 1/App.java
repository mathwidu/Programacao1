public class App {
    public static void main(String args[]){
    Conta cb1 = new Conta();
    Correntista ct = new Correntista("Marianna", "Nova Hartz");
    cb1.setCc(ct);

    Conta cb2 = new Conta();
    Correntista ct2 = new Correntista("Matheus", "igrejinha");
    cb2.setCc(ct2);

    cb1.depositar(1000);
    cb1.transferir(150, cb2);

    cb1.extrato();
    cb2.extrato();


 





}
}
