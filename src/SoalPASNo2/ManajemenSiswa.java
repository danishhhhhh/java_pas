package SoalPASNo2;
import java.util.ArrayList;
import java.util.Scanner;

public class ManajemenSiswa {
    ArrayList<ManajemenSiswa> data = new ArrayList<>();

    private String nis;
    private String nama;
    private String kelas;

    public String getNis() {
        return nis;
    }

    public void setNis(String nis) {
        this.nis = nis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    ManajemenSiswa() {
    }

    ManajemenSiswa(String nis, String nama, String kelas) {
        this.nis = nis;
        this.nama = nama;
        this.kelas = kelas;
    }

    public void menuUtama(){
        Scanner input = new Scanner(System.in);

        System.out.println("\n================================");
        System.out.println("| Program Manajemen Data Siswa |");
        System.out.println("================================");
        System.out.println("| 1. Tambah Data Siswa         |");
        System.out.println("| 2. Hapus Data Siswa          |");
        System.out.println("| 3. Lihat Semua Data Siswa    |");
        System.out.println("| 4. Ganti Data Siswa          |\n");

        System.out.print("Pilih Menu : ");
        int menu = input.nextInt();
        switch (menu){
            case 1 -> menuTambahData();
            case 2 -> menuHapusData();
            case 3 -> menuLihatData();
            case 4 -> menuGantiData();
        }
    }
    public void menuTambahData(){
        Scanner input = new Scanner(System.in);

        System.out.println("\nMenu Tambah Data Siswa");
        System.out.println("======================\n");

        System.out.println("Masukkan NIS Siswa");
        String nisSiswa = input.nextLine();

        for (int i = 0; i < data.size(); i++){
            if (nisSiswa.equals(data.get(i).getNis())){
                System.out.println("Maaf Nis siswa sudah digunakan");
                menuTambahData();
            }
        }

        System.out.println("Masukkan Nama Siswa");
        String namaSiswa = input.nextLine();

        System.out.println("Masukkan Kelas Siswa");
        String kelasSiswa = input.nextLine();

        data.add((new ManajemenSiswa(nisSiswa,namaSiswa,kelasSiswa)));

        System.out.println("\nData Siswa Telah Ditambahkan");

        menuUlang();

    }
    public void menuHapusData(){
        Scanner input = new Scanner(System.in);
        boolean dataExist = false;

        System.out.println("\nMenu Hapus Data Siswa");
        System.out.println("=====================\n");

        System.out.println("Masukan NIS Siswa Yang Akan Dihapus");
        String nis = input.nextLine();

        for (int i = 0; i < data.size(); i++){
            if (nis.equals(data.get(i).getNis())){
                data.remove(i);
                System.out.println("\nData Siswa Berhasil Dihapus");
                dataExist = true;
            }
        }

        if (!dataExist){
            System.out.println("\nData Siswa Tidak Ditemukan");
        }

        menuUlang();

    }
    public void menuLihatData(){
        System.out.println("\nMenu Lihat Data Siswa");
        System.out.println("=====================");

        for (int i = 0; i < data.size(); i++){

            System.out.println("\nData Siswa ke-" + (i + 1));
            System.out.println("===============");

            System.out.print("\nNIS : ");
            System.out.println(data.get(i).getNis());

            System.out.print("NAMA : ");
            System.out.println(data.get(i).getNama());

            System.out.print("KELAS : ");
            System.out.println(data.get(i).getKelas());
        }

        menuUlang();

    }

    public void menuGantiData(){
        Scanner input = new Scanner(System.in);

        System.out.println("\nMenu Ganti Data Siswa");
        System.out.println("=====================\n");

        System.out.println("Masukan NIS Siswa Yang Akan Diganti");
        String nis = input.nextLine();

        int i;
        boolean dataKosong = false;

        for (i = 0; i < data.size(); i++){

            if (nis.equals(data.get(i).getNis())){
                System.out.println("Masukkan Nama Siswa");
                System.out.println("-Enter untuk tidak mengganti Nama Siswa-");
                String namaSiswa = input.nextLine();
                if (namaSiswa != ""){
                    data.get(i).setNama(namaSiswa);
                }

                System.out.println("Ganti Kelas Siswa");
                System.out.println("-Enter untuk tidak mengganti Kelas Siswa-");
                String kelasSiswa = input.nextLine();
                if (kelasSiswa != ""){
                    data.get(i).setKelas(kelasSiswa);
                }

                dataKosong = true;
            }
        }

        if (!dataKosong){
            System.out.println("Data Tidak Ditemukan");
        }

        menuUlang();

    }
    public void menuUlang(){
        Scanner input = new Scanner(System.in);

        System.out.println("\nIngin Kembali Ke Menu Utama? y/n");
        String yesNo = input.nextLine().toLowerCase();

        if (yesNo.equals("y")){
            menuUtama();
        } else if (yesNo.equals("n")) {

            System.out.println("\n=====================");
            System.out.println("|| Program Selesai ||");
            System.out.println("=====================");

        } else {
            System.out.println("\n-Jawaban Tidak Sesuai-\n");
            menuUlang();
        }
    }
}