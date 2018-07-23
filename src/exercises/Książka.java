package exercises;

public class Książka {
    private String tytuł;
    private String autor;
    private int liczbaStron;
    private String wydawnictwo;

    public Książka(String tytuł, String autor, int liczbaStron, String wydawnictwo) {
        this.tytuł = tytuł;
        this.autor = autor;
        this.liczbaStron = liczbaStron;
        this.wydawnictwo = wydawnictwo;

    }

    public String getTytuł() {
        return tytuł;
    }

    public String getAutor() {
        return autor;
    }

    public int getLiczbaStron() {
        return liczbaStron;
    }

    public String getWydawnictwo() {
        return wydawnictwo;
    }

    @Override
    public String toString() {
        return "Książka{" +
                "tytuł='" + tytuł + '\'' +
                ", autor='" + autor + '\'' +
                ", liczbaStron=" + liczbaStron +
                ", wydawnictwo='" + wydawnictwo + '\'' +
                '}';
    }
}
