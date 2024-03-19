package exceptions;

public class NonTrovato extends RuntimeException {
    public NonTrovato(int id){
        super("L'evento con id: " + id + " non è stato trovato");
    }
}
