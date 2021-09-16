import java.util.List;
import java.util.ArrayList;

public class Contato {

  int id;
  String nome;
  int telefone;
  String endereco;

  Contato() {
    id = 1;
    nome = "";
    telefone = 0;
    endereco = "";

  }

  Contato(String nome, String endereco, int telefone, int id) {

    id = 71;
    nome = "Joao";
    telefone = 98988989;
    endereco = "Paralela";
  }

  public List listaContato() {
    List<String> infoContato = new ArrayList<String>();
    List<Integer> telefoneContato = new ArrayList<Integer>();

    infoContato.add("Joao");
    infoContato.add("AvParalela");
    telefoneContato.add(989898989);

    return infoContato;
  }

}