package dao;

import entities.Evento;
import exceptions.NonTrovato;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class EventoDAO {
    private final EntityManager em;

    public EventoDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Evento event){
        EntityTransaction transaction = em.getTransaction(); // richiedo una nuova transazione
        transaction.begin(); // starto la transazione
        em.persist(event); // aggiungo l'elemento al persistence context
        transaction.commit(); // pusho/salvo la transazione nel database e la concludo
        System.out.println("L'evento " + event + " è stato salvato."); // messaggio di avvenuto salvataggio
    }

    public Evento getById(int eventId) {
        Evento event = em.find(Evento.class, eventId); // selezione la classe dell'entity  e passo l'elemento da cercare
        if(event == null) throw new NonTrovato(eventId); // do una eccezzione in caso di errore
        return event;
    }

    public void delete(int eventId){
        Evento trovato = this.getById(eventId); // cerco lo studente nel db con il metodo scritto sopra getById
        EntityTransaction transaction = em.getTransaction(); // richiedo una nuova transazione
        transaction.begin(); // starto la transazione
        em.remove(trovato);  // rimuovo l'elemento al persistence context
        transaction.commit(); // pusho/salvo la transazione nel database e la concludo
        System.out.println("l'evento " + trovato.getTitolo() + "/" + trovato.getId() + " è stato rimosso");
    }
}
