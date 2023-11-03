package SoalPASNo3;

public class Main {

    public static void main(String[] args) {

        Tabungan tabungan = new Tabungan();

        tabungan = new TabunganSilver();
        tabungan.start("Danish", 100_000);

        tabungan = new TabunganGold();
        tabungan.start("Daffa",600_000);

        tabungan = new TabunganPlatinum();
        tabungan.start("Deka", 2_305_500);
    }

}
