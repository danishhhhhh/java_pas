package SoalPASNo3;

class Tabungan {

    String nama;
    int jumlahTabungan;

    public void start(String nama, int jumlahTabungan){

        this.nama = nama;
        this.jumlahTabungan = jumlahTabungan;
        menu();

    }

    public void menu(){

        System.out.println("Hai " + this.nama + ", Terimakasih Sudah Membuka Program Ini, Sekarang Jumlah Tabungan Anda Sebesar Rp." + this.jumlahTabungan + ",00");

    }

}

class TabunganSilver extends Tabungan {

    @Override
    public void menu() {
        System.out.println("Hai Mas " + this.nama + ", Terimakasih Sudah Membuka Program Ini dan Membantu Dengan Menggunakan Kartu Silver, Sekarang Jumlah Tabungan Anda Sebesar Rp." + this.jumlahTabungan + ",00");
    }
}

class TabunganGold extends Tabungan {

    @Override
    public void menu() {
        System.out.println("Hai Pak " + this.nama + ", Terimakasih Sudah Membuka Program Ini dan Membantu Dengan Menggunakan Kartu Gold, Sekarang Jumlah Tabungan Anda Sebesar Rp." + this.jumlahTabungan + ",00");
    }
}

class TabunganPlatinum extends Tabungan {

    @Override
    public void menu() {
        System.out.println("Hai Tuan " + this.nama + ", Terimakasih Sudah Membuka Program Ini dan Membantu Dengan Menggunakan Kartu Platinum, Sekarang Jumlah Tabungan Anda Sebesar Rp." + this.jumlahTabungan + ",00");
    }
}


