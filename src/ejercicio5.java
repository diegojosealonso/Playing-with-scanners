public class ejercicio5 {
    public static void main(String[] args) {
        System.out.println(precioConImpuesto(15,21));
    }
    static double precioConImpuesto(double precio, double impuesto){
        return precio*impuesto/100+precio;
    }
}
