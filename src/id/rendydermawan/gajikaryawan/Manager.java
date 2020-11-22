package id.rendydermawan.gajikaryawan;
import static id.rendydermawan.gajikaryawan.Tester.hadir;
/**
 *
 * NAMA  : Rendy Dermawan
 * KELAS : IF-1
 * NIM   : 10119030
 * Deskripsi Program : program ini berisi class Manager.
 * 
 */
public class Manager extends Karyawan {
    private int kehadiran;
    private float tunjanganGolongan;
    private float tunjanganJabatan;
    private float tunjanganKehadiran;

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }
    
    public float tunjanganKehadiran(int hadir) {
        return hadir = kehadiran * 10000;
    }
    
    public float tunjanganJabatan(String jabatan) {
        if(jabatan.equals("Manager")) {
            tunjanganJabatan = 2000000;
        } else if(jabatan.equals("Kabag")) {
            tunjanganJabatan = 1000000;
        } else {
            tunjanganJabatan = 0;
        }
        
        return tunjanganJabatan;
    }
    
    public float tunjanganGolongan(int golongan) {
        if(golongan == 1) {
            tunjanganGolongan = 500000;
        } else if(golongan == 2) {
            tunjanganGolongan = 1000000;
        } else if(golongan == 3) {
            tunjanganGolongan = 1500000;
        } else {
            tunjanganGolongan = 0;
        }
        
        return tunjanganGolongan;
    }
    
    public float gajiTotal() {
        return tunjanganJabatan(jabatan) + tunjanganGolongan(golongan) + tunjanganKehadiran(hadir);
    }
}
