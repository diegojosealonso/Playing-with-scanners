import java.util.Scanner;
public class ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write your text");
        String text= sc.nextLine();
        System.out.println(decoraTexto(text));
    }
    static String decoraTexto(String text){
        return "===" + text + "===";
    }
}