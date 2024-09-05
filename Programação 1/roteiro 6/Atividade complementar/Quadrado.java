public class Quadrado extends FomaBidimensional {
    private double lado;

    public Quadrado (double lado){
        this.lado = lado;
    }

    public double area(){
        return lado * lado;
    }
    @Override
    String obterDescricao() {
        return "Quadrado com lado " + lado + ", área: " + area();
    }
}
