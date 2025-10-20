public class ejercicio4 {
    public static void main(String[] args) {
        double resultado = precioConIva(10);
        System.out.println(resultado);
    }
    static double precioConIva(double precio){
        return ((precio*21)/100+precio);
    }
}