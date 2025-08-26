public class calculator {
    double ar;
    public void Area(double l,double b){
        ar=l*b;
        System.out.println("area of rectangle "+ar);
    }
    public void Area(double r){
        ar=Math.PI*r*r;
        System.out.println("area of circle "+ar);
    }
    public void Area(double l,double b,double h){
        ar=2*(l*b+b*h+l*h);
        System.out.println("area of cuboid "+ar);
    }
}
