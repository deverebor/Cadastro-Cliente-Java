public class App {
    public static void main(String[] args) throws Exception {
        Contato a = new Contato();

        Contato b = new Contato("Geisielle");

        System.out.println(a.listaContatos());
        System.out.println("\n--------------------------------------\n");
        System.out.println(b.listaContatos());
    }
}
