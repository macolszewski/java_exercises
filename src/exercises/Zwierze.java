package exercises;

public class Zwierze {

    private String imię;
    private Integer wiek;

    public Zwierze(String imię, Integer wiek) {
        this.imię = imię;
        this.wiek = wiek;
    }


    public void czymJest(){
        System.out.println("Jestem Zwierze");
    }

    @Override
    public String toString() {
        return "Zwierze{" +
                "imię='" + imię + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}
