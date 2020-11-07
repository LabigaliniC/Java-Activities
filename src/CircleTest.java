public class CircleTest {
    public static void main(String[] args) {
        Circle Circle = new Circle(
            "Green", true, 18
        );

        System.out.println("Imprimindo dados por métodos get: ");
        System.out.println("Cor: " + Circle.getColor());
        System.out.println("Preenchido: " + Circle.isFilled());
        System.out.println("Raio: " + Circle.getRadius());
        System.out.println("Circunferência: " + Circle.earnings());
    }
}
