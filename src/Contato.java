import java.util.List;
import java.util.ArrayList;

public class Contato {

  private int id;
  public String nome;
  public int telefone;
  public String endereco;

  Contato() {
    this.setId(1);
    this.nome = "Adeobaldo";
    this.telefone = 999999;
    this.endereco = "Pituba";

  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  Contato(String nome, Integer id) {

    this.setId(71);
    this.nome = "Joao";
    this.telefone = 98988989;
    this.endereco = "Paralela";
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