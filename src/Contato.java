import java.util.List;
import java.util.ArrayList;

public class Contato {

  private int id;
  public String nome;
  public int tel;
  public String end;

  Contato() {
    this.setId(1);
    this.nome = nome;
    this.tel = tel;
    this.end = end;

  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  Contato(String nome, Integer id) {

    this.setId(2);
    this.nome = nome;
    this.tel = tel;
    this.end = end;
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