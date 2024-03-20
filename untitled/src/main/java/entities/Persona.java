package entities;

import java.util.List;

public class Persona {
    private int id;
    private String nome;
    private String cognome;
    private String email;
    private Gender gender;
   private List<Partecipazione> partecipazioni;


    public Persona(String nome, String cognome, String email, Gender gender, List<Partecipazione> partecipazioni) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.gender = gender;
        this.partecipazioni = partecipazioni;
    }

    public List<Partecipazione> getPartecipazioni() {
        return partecipazioni;
    }

    public void setPartecipazioni(List<Partecipazione> partecipazioni) {
        this.partecipazioni = partecipazioni;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", partecipazioni=" + partecipazioni +
                '}';
    }
}
