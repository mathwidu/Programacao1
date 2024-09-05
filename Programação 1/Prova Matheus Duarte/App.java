public class App {
    public static void main(String[] args) {
       Contato[] listaDeContatos = new Contato[100];
       Contato contato1 = new Contato("Jorge", "51999883377", "Email.jorge@gmail.com", "rua josé leão 78");
       Contato contato2 = new Contato("Eduardo", "51999338899", "eduardo@gemail.com", "rua gustavo da silva 90");
       Contato contato3 = new Contato("Wellison", "51999334487", "welisson@gemail.com", "rua dr romeu linden 89");
        //contatos com todas as informações corretas
       listaDeContatos[0] = contato1;
       listaDeContatos[1] = contato2;
       listaDeContatos[2] = contato3;
        //contato com erro no email que ira retornar NULL
       Contato contato4 = new Contato("Norberto", "519998883378", "Norberto.gmail.com", "rua linden bravo 72");
       listaDeContatos[3] = contato4;
        
        for (int i = 0; i <listaDeContatos.length; i++){
            System.out.printf("Nome do Contato %d: %s \n\n", i+1, listaDeContatos[i].getNome());
            System.out.printf("Numero do Contato %d: %s \n\n", i+1, listaDeContatos[i].getnumero());
            System.out.printf("Email do Contato %d: %s \n\n", i+1, listaDeContatos[i].getEmail());
            System.out.printf("Endereço do Contato %d: %s \n\n", i+1, listaDeContatos[i].getEndereco());
        }
    }
}
