public class Method {
    public  void fulan(){
        System.out.println("Halo, nama saya Hanif Nouval Setyananda");
        System.out.println("Saya adalah mahasiswa Teknik Informatika Universitas Dian Nuswantoro");
        System.out.println("Saya sedang menulis program Java");
    }

    public double keliling(double diameter){
        double ret = 22/7 * diameter;
        return ret;
    }

    public double luasSegitiga(double alas, double tinggi){
        double ret = alas*tinggi/2;
        return ret;
    }

    public double volumeTabung(double diameter, double tinggi){
        double r = diameter/2;
        double phi = 22/7;
        double ret = phi*(r*r)*tinggi;
        return ret;
    }
}
