package exercises;

import java.util.Date;

public class Człowiek {
    private String imię;
    private String nazwisko;
    private Zwierzę zwierzę;
    private DaneAdresowe daneAdresowe;

    public Człowiek(String imię, String nazwisko, Zwierzę zwierzę, DaneAdresowe daneAdresowe) {
        this.imię = imię;
        this.nazwisko = nazwisko;
        this.zwierzę = zwierzę;
        this.daneAdresowe = daneAdresowe;
    }

    public String nazwyamSie(){
        return "Cześć nazywam się ["+imię+" "+nazwisko+"]. ";
    }

    public String nazywamSie(String tekst){
        return this.nazwyamSie()+tekst;
    }

}
