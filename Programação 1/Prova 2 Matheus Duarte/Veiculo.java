public abstract class Veiculo{
    protected String nome;
    protected String placa;
    protected double valor;
    protected String ano;

    public Veiculo(String nome, String placa, double valor, String ano){
        this.nome = nome;
        this.placa = placa;
        this.valor = valor;
        this.ano = ano;
    }

    public abstract double calculaImposto();

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\nPlaca: " + this.placa + "\nValor: " + this.valor + "\nAno: " + this.ano + "\nImposto: " + calculaImposto();
    }
}