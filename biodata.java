public class biodata { 
    public static void main(String[] args) {
        //Head
        String bio = "BIODATA PRIBADI";
        System.out.println(bio);

        //nama lengkap
        String namaDepan = "DIAN";
        String namaBelakang = "NITAMI";
        String namaLengkap = namaDepan+" "+namaBelakang;
        System.out.println("Nama Lengkap : "+namaLengkap);

        //tempat tanggal lahir
        String tem = "BANTENG KESELET";
        int tgl = 20;
        int bln = 05;
        int thn = 2001;
        System.out.println("TTL : "+tem+"/"+tgl+"/"+bln+"/"+thn);

        //umur
        int tahuna = 2001;
        int tahunb = 2022;
        int umur = 2022-2001;
        System.out.println("Umur : "+umur+" Tahun");

        //jenis kelamin
        char jk = 'P';
        System.out.println("Jenis Kelamin : "+jk);

        //alamat
        String alamat = "Dusun Banteng keselet, Desa taman indah, Kecamatan pringgarata";
        System.out.println("Alamat : "+alamat);

        //pendidikan
        String sd = "Sekolah Dasar Negeri 1 banteng keselet";
        String smp = "SMPN 1 NW Pringgarata";
        String smk = "SMK Bangun Bangsa";
        String kuliah1 = "AKN(Akademi Komunitas Negri) Lombok Barat";
        String kuliah2 = "STMIK Lombok";
        System.out.println("Riwayat Pendidikan");
        System.out.println("Sekolah Dasar : "+sd);
        System.out.println("Sekolah Menengah Pertama : "+smp);
        System.out.println("Sekolah Menengah Kejuruan : "+smk);
        System.out.println("Sekolah Tinggi : "+kuliah1);
        System.out.println("Sekolah Tinggi : "+kuliah2);


    }



}
