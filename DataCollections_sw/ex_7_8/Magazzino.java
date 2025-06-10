package ex_7_8;

import java.util.ArrayList;
import java.util.List;

public class Magazzino<T> {
    private List<T> articoli = new ArrayList<>();

    public void aggiungiArticolo(T articolo) {
        articoli.add(articolo);
    }

    public void rimuoviArticolo(T articolo) {
        articoli.remove(articolo);
    }

    public void stampaArticoli() {
        for (T articolo : articoli) {
            System.out.println(articolo);
        }
    }

    public List<T> getArticoli() {
        return articoli;
    }
}
