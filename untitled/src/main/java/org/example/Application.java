package org.example;

import dao.EventoDAO;
import entities.Evento;
import exceptions.NonTrovato;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class Application {
    public static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestioneeventi");
    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        EventoDAO eventoDAO = new EventoDAO(em);

        //creo gli eventi:
//        Evento evento1 = new Evento("evento1", LocalDate.of(2024, 4, 4), "concerto", EventType.PUBBLICO, 3000);
//        Evento evento2 = new Evento("eventi2", LocalDate.of(2022,2,2), "teatro", EventType.PRIVATO, 2000);
//        Evento evento3 = new Evento("eventi3", LocalDate.of(2021,4,12), "pallavolo", EventType.PUBBLICO, 2300);
//        Evento evento4 = new Evento("eventi4", LocalDate.of(2020,9,10), "briscola", EventType.PRIVATO, 200000);

        // salvo:
//        eventoDAO.save(evento1);
//        eventoDAO.save(evento2);
//        eventoDAO.save(evento3);
//        eventoDAO.save(evento4);

       // provo a cercare un evento per id:
//        try{
//        Evento ev1 = eventoDAO.getById(3);
//            System.out.println("evento cercato " + ev1);
//        }catch (NonTrovato ex){
//            System.out.println(ex.getMessage());
//        }

        //rimuovo un evento tramite id:
//        try{
//            eventoDAO.delete(1);
//            System.out.println("evento rimosso ");
//        }catch (NonTrovato ex){
//            System.out.println(ex.getMessage());
//        }

        em.close();
        emf.close();
    }
}
