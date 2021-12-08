package pl.camp.it.exceptions;

public class MojWyjatek extends Exception {
    private String wiadomosc;

    public MojWyjatek(String wiadomosc) {
        this.wiadomosc = wiadomosc;
    }

    public String getWiadomosc() {
        return wiadomosc;
    }

    public void setWiadomosc(String wiadomosc) {
        this.wiadomosc = wiadomosc;
    }
}
