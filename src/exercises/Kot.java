package exercises;

public class Kot extends Zwierze {
    RasaKota rasa;

    public Kot(String imię, Integer wiek, RasaKota rasa) {
        super(imię, wiek);
        this.rasa = rasa;
    }

    @Override
    public void czymJest() {
        System.out.println("Jestem Kot");
    }

}
