package latihan;

class balok {
    double p, l, t;
    public balok(double p, double l, double t){
        this.p = p;
        this.l = l;
        this.t = t;
    }
    public balok(double p, double l){
        this.p = p;
        this.l = l;
        t = 10;
    }
    public double luas() {
        return p*l*t;
    }
    public double keliling() {
        return 4*(p*l*t);
    }
}
class demobalok{
    public static void main(String[] args) {
        balok bl = new balok(10, 10, 10);
        balok bl1 = new balok(10, 10);

        System.out.println("Balok Dengan Konstruktor 2 Parameter");
        System.out.println("Keliling Balok : "+bl.keliling());
       	System.out.println("Luas Balok     : "+bl.luas());
        
        System.out.println("Balok Dengan Konstruktor 2 Parameter");
        System.out.println("Keliling Balok : "+bl1.keliling());
        System.out.println("Luas Balok     : "+bl1.luas());
    }
}
