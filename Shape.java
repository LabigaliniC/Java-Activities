/* Escreva uma superclasse chamada Shape (forma - conforme mostrado no diagrama de classe),
que contenha:
Duas variáveis de instância: color (string) e  filled (boolean).
Dois construtores: um sem argumentos que inicializa a cor para "verde" e preenchido
(filled) como true, e um construtor que inicializa color e  filled conforme os
argumentos passados por parâmetro.
Getter e setter para todas as variáveis de instância. Por convenção, um getter para
uma variável boolean começa com "is" (é ...) e nãõ "get". Por exemplo: filled -> isFilled.
Um método toString que retorne: "Shape[color=xxxx, filled=xxxx]".
Escreva um programa para testar todos os métodos definidos em Shape.
*/
public class Shape {
    private String color;
    private boolean filled;

    public Shape() {
        color = "vermelho";
        filled = true;
    }
    public Shape (String color, boolean filled){
        setColor(color);
        setFilled(filled);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color=" + color +
                ", filled=" + filled +
                '}';
    }
}
