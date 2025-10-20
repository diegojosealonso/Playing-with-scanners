public class ejercicio7 {
    public static void main(String[] args) {
        System.out.println(tiempoASegundos(2, 10, 30));
    }

    static int tiempoASegundos(int horas, int minutos, int segundos) {
        return horas * 3600 + minutos * 60 + segundos;
    }
}