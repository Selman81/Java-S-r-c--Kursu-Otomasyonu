package parametre;
 
public class parametre {
 
    public static void main(String[] args) {
        int carpim1 = carp(12, 13);
        int carpim2 = carp(7, 9, 123);
        double carp = carp(2.50, 2.75);
    }
 
    public static int carp(int x, int y) {
        return x + y;
    }
 
    public static int carp(int x, int y, int z) {
        return x + y + z;
    }
 
    public static double carp(double x, double y) {
        return x + y;
    }
}