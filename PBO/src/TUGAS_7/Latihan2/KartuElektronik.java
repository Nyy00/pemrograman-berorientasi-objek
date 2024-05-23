package TUGAS_7.Latihan2;

public class KartuElektronik implements Kartu{
    private String kodeBank;
    private String pin;

    public KartuElektronik(String kodeBank, String pin) {
        super();
        this.kodeBank = kodeBank;
        this.pin = pin;
    }

    @Override
    public boolean otentikasi(String pin) {
        return this.pin.equals(pin);
    }

    @Override
    public String encode(String pin) {
        return null;
    }
}