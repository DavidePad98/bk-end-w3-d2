package entities;

public class Partecipazione {
    private int id;
    private Persona persona;
    private Evento evento;
    private StatePartecipation stato;

    public Partecipazione(Persona persona, Evento evento, StatePartecipation stato) {
        this.persona = persona;
        this.evento = evento;
        this.stato = stato;
    }

    public int getId() {
        return id;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public StatePartecipation getStato() {
        return stato;
    }

    public void setStato(StatePartecipation stato) {
        this.stato = stato;
    }

    @Override
    public String toString() {
        return "Partecipazione{" +
                "id=" + id +
                ", persona=" + persona +
                ", evento=" + evento +
                ", stato=" + stato +
                '}';
    }
}
