package exercises;

public class Zwierzę {

    //TODO nie powinno się stosować tutaj przypisania. Jeżeli chcemy ustawić wartości domyślne to tworzymy do tego odpowiedni konstruktor.
    //TODO Klasa nie powinna zawierać polskich znaków!!!!
    private String imię = "";
    private Integer wiek = 0;

    public Zwierzę(String imię, Integer wiek) {
        this.imię = imię;
        this.wiek = wiek;
    }

    //TODO metoda toString powinna być na samym dole klasy
    @Override
    public String toString() {
        return "Zwierzę{" +
                "imię='" + imię + '\'' +
                ", wiek=" + wiek +
                '}';
    }

    public void czymJest(){
        System.out.println("Jestem Zwierzę");
    }
}
