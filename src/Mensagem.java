import java.time.LocalDateTime;
import java.util.ArrayList;

public class Mensagem {
    private int id;
    private String texto;
    private Individual emitente;
    private Participante destinatario;
    private LocalDateTime datahora;

    public Mensagem(int id, String texto, Individual emitente, Participante destinatario, LocalDateTime datahora) {
        this.id = id;
        this.texto = texto;
        this.emitente = emitente;
        this.destinatario = destinatario;
        this.datahora = datahora;
    }

    // Getters e Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Individual getEmitente() {
        return emitente;
    }

    public void setEmitente(Individual emitente) {
        this.emitente = emitente;
    }

    public Participante getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Participante destinatario) {
        this.destinatario = destinatario;
    }

    public LocalDateTime getDatahora() {
        return datahora;
    }

    public void setDatahora(LocalDateTime datahora) {
        this.datahora = datahora;
    }
}