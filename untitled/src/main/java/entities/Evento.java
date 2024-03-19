package entities;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "eventi")
public class Evento {
    @Id
    @GeneratedValue
    private int id;
    @Column(name="title")
    private String titolo;
    @Column(name="eventDate")
    private LocalDate dataEvento;
    @Column(name="description")
    private String descrizione;
    @Column(name="eventType")
    @Enumerated(EnumType.STRING)
    private EventType tipoEvento;
    @Column(name="maxPeople")
    private long numeroMassimoPartecipanti;

    public Evento() {
        // bisogna SEMPRE creare un costruttore vouto in modo che JPA restituisca i dati dal db come oggetti
    }

    public Evento(String titolo, LocalDate dataEvento, String descrizione, EventType tipoEvento, long numeroMassimoPartecipanti) {
        this.titolo = titolo;
        this.dataEvento = dataEvento;
        this.descrizione = descrizione;
        this.tipoEvento = tipoEvento;
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
    }

    public int getId() {
        return id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public LocalDate getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(LocalDate dataEvento) {
        this.dataEvento = dataEvento;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public EventType getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(EventType tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public long getNumeroMassimoPartecipanti() {
        return numeroMassimoPartecipanti;
    }

    public void setNumeroMassimoPartecipanti(long numeroMassimoPartecipanti) {
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", titolo='" + titolo + '\'' +
                ", dataEvento=" + dataEvento +
                ", descrizione='" + descrizione + '\'' +
                ", tipoEvento=" + tipoEvento +
                ", numeroMassimoPartecipanti=" + numeroMassimoPartecipanti +
                '}';
    }
}
