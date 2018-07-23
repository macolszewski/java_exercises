package exercises;

public class Pies extends Zwierzę {
    RasaPsa rasa;

    public Pies(String imię, Integer wiek, RasaPsa rasa) {
        super(imię, wiek);
        this.rasa = rasa;
    }

    @Override
    public void czymJest() {
        System.out.println("Jestem Pies");
    }
}
