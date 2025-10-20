import java.util.Scanner;
public class ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your first grade");
        double grade1 = scanner.nextDouble();
        System.out.println("Write your second grade");
        double grade2 = scanner.nextDouble();
        System.out.println("Write your third grade");
        double grade3 = scanner.nextDouble();
        System.out.println("Write your name");
        String name = scanner.next();
        System.out.println("Write your last name");
        String lastname = scanner.next();
        alumnoMedia (lastname, name, grade1, grade2, grade3);
    }
    static void alumnoMedia(String lastName, String name, double grade1, double grade2, double grade3){
        boolean aprobado = ejercicio10.calcularMedia(grade1, grade2, grade3);
        System.out.println(ejercicio9.formateaNombre (lastName, name) + " ha aprobado " + aprobado);
    }
}