package id.rendydermawan.gajikaryawan;
/**
 *
 * NAMA  : Rendy Dermawan
 * KELAS : IF-1
 * NIM   : 10119030
 * Deskripsi Program : program ini berisi class Karyawan.
 * 
 */
public class Karyawan {
    protected String nik;
    protected String nama;
    protected String jabatan;
    protected int golongan;

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public int getGolongan() {
        return golongan;
    }

    public void setGolongan(int golongan) {
        this.golongan = golongan;
    }
}