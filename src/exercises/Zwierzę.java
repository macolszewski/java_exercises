package exercises;

public class Zwierzę {
    protected String imię = "";
    protected Integer wiek = 0;

    public Zwierzę(String imię, Integer wiek) {
        this.imię = imię;
        this.wiek = wiek;
    }

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
