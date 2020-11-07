public class SquareTest {
    public static void main(String[] args) {
        Square Square = new Square(
                "White", false, 6, 6
        );

        System.out.println("Imprimindo dados por métodos get: ");
        System.out.println("Cor: " + Square.getColor());
        System.out.println("Preenchido: " + Square.isFilled());
        System.out.println("Largura: " + Square.getWidth());
        System.out.println("Altura: " + Square.getLength());
    }

}
