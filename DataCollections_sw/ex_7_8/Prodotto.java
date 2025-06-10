package ex_7_8;

public class Prodotto {
    private String nome;
    private int prezzo;

    public Prodotto(String nome, int prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return nome + "," + prezzo + "$";
    }
}
