import zadanie9.Rhombuses;
public class Main {
    public static void main(String[] args) {
        Rhombuses r = new Rhombuses(10, 30, 30, "Red");
        System.out.println(r.getLargeDiagonal());
        System.out.println(r.getHeight());
        System.out.println(r.area());
        System.out.println(r.perimeter());
    }
}
