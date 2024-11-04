package src;
public class Square extends Shape {
    public Square(Renderer renderer) {
        super(renderer);
    }

    public void draw() {
        renderer.renderShape("Square");
    }
}
