package ex_7_8;

public class Main {
    public static void main(String[] args) throws Exception {
        Magazzino<Prodotto> magazzino = new Magazzino<>();

        System.out.println("Prodotti disponibili: ");
        magazzino.aggiungiArticolo(new Prodotto("Martello", 10));
        magazzino.aggiungiArticolo(new Prodotto("Sedia", 40));
        magazzino.aggiungiArticolo(new Prodotto("Corda", 4));
        magazzino.aggiungiArticolo(new Prodotto("Tavolo", 100));
        magazzino.aggiungiArticolo(new Prodotto("Ruota", 80));
        magazzino.aggiungiArticolo(new Prodotto("Bicicletta", 300));

        magazzino.stampaArticoli();
    }
}
