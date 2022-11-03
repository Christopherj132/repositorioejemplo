public class Expresiones2 {
    public static void main(String[] args) {

        byte a = 2;
        byte b = 4;
        byte c = 5;
        byte d = 8;
        byte e = 22;
        byte f = 25;
        byte g = 100;

        final double resultado = (a * d / a / a - e * b / d - (g + f) / f);

        System.out.println("Es " + resultado);

    }

}