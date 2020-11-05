public class ShapeTest {
    public static void main(String[] args) {
        Shape Shape = new Shape(
                "blue", true
        );

        System.out.println("Imprimindo dados por métodos get: ");
        System.out.println("Cor: " + Shape.getColor());
        System.out.println("Preenchido: " + Shape.isFilled());
    }
}
