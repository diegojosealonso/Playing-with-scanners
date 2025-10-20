import java.util.Scanner;
public class ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your first grade");
        double grade1 = scanner.nextDouble();
        System.out.println("Write your second grade");
        double grade2 = scanner.nextDouble();
        System.out.println("Write your third grade");
        double grade3 = scanner.nextDouble();
        System.out.println("Have you passed? " + calcularMedia(grade1,grade2,grade3));
    }
    static boolean calcularMedia(double grade1, double grade2, double grade3){
        double media = (grade1 + grade2 + grade3) / 3;
        return media >= 5;
    }
}
