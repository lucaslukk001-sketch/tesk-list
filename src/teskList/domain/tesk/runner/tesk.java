package teskList.domain.tesk.runner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class tesk {
    private String Titulo;
    private String tarefa;
    private LocalDateTime data;
    private int prioriade;

    public tesk(String titulo, int prioriade, LocalDateTime data, String tarefa) {
        Titulo = titulo;
        this.prioriade = prioriade;
        this.data = data;
        this.tarefa = tarefa;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getTarefa() {
        return tarefa;
    }

    public void setTarefa(String tarefa) {
        this.tarefa = tarefa;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public int getPrioriade() {
        return prioriade;
    }

    public void setPrioriade(int prioriade) {
        this.prioriade = prioriade;
    }
}
