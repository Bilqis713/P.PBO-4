package overloading;
class circle{
    double x, y, r;
    public circle(double x, double y, double r){
        this.x = x;
        this.y = y;
        this.r = r;
    }
    public circle(double x, double y){
        this.x = x;
        this.y = y;
        r=1;
    }
    public double keliling() {
        return 2*3.14*r;
    }
    public double luas() {
        return 3.14*r*r;
    }
}
class democirle{
    public static void main(String[] args) {
        circle cr = new circle(2, 3, 5);
        circle cr1 = new circle(2, 3);

        System.out.println("Lingkaran Konstruktor 3 Parameter");
        System.out.println("Keliling Lingkaran : "+cr.keliling());
       	System.out.println("Luas Lingkaran     : "+cr.luas());
        
        System.out.println("Lingkaran Konstruktor 2 Parameter");
        System.out.println("Keliling Lingkaran : "+cr1.keliling());
        System.out.println("Luas Lingkaran     : "+cr1.luas());
    }
}