public class app {
    public static void main(String[] args) {
        Funcionario jorge = new Funcionario("Jorge", 101010, 10000);
        jorge.MostraTudo();
        
        Programador matheus = new Programador("Matheus Duarte", 101203, 3000, "Java");
        matheus.MostraTudo();
    }
}
