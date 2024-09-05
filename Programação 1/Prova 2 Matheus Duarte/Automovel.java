public class Automovel extends Veiculo{
    public Automovel(String nome, String placa, double valor, String ano){
        super(nome, placa, valor, ano);
    }
    @Override
    public double calculaImposto() {
        return valor * 0.03;
    }
   

    
    
}