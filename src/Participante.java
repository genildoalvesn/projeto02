import java.util.ArrayList;
public class Participante {
    private String nome;
    private ArrayList<Mensagem> recebidas;

    public Participante(String nome) {
        this.nome = nome;
        this.recebidas = new ArrayList<>();
    }

    // Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Mensagem> getRecebidas() {
        return recebidas;
    }

    public void setRecebidas(ArrayList<Mensagem> recebidas) {
        this.recebidas = recebidas;
    }
}