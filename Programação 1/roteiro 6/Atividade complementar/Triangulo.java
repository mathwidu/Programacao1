public class Triangulo extends FomaBidimensional{
    private double altura;
    private double base;

    public Triangulo (double altura, double base){
        this.altura = altura;
        this.base = base;
    }

    public double area(){
        return (base*altura)/2;
    }

    @Override
    String obterDescricao() {
        return "Triângulo com base " + base + " e altura " + altura + ", área: " + area();
    }
}
