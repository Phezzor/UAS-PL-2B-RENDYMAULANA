public class luas{
    double panjang;
    double lebar;
    double tinggi;
    double volume;
    double luas;

    public double Hitungvolume (){
        return volume = panjang*lebar*tinggi;
    }

    public double  Hitungluas (){
        return luas = (2*((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi)));
    }
}