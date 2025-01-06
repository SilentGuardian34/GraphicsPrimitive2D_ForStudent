import java.util.List;

public abstract class MyAbstractPolygon extends MyAreaPrimitive2D {

    protected List<MyPoint2D> _vertices;

    public MyAbstractPolygon(List<MyPoint2D> vertices) {
        super(new MyPoint2D(getMinX(vertices), getMaxY(vertices)), new MyPoint2D(getMaxX(vertices), getMinY(vertices)));
        this._vertices = vertices;
    }

    @Override
    public abstract float square();

    @Override
    public void move(float dx, float dy) {
        for (MyPoint2D vertex : _vertices) {
            vertex = new MyPoint2D(vertex.getX() + dx, vertex.getY() + dy);
        }
        super.move(dx, dy);
    }

    @Override
    public boolean contains(MyPoint2D point) {
        // Здесь должна быть реализация операции
        return false;
    }

    // Вспомогательные методы для вычисления минимальных и максимальных координат
    protected static float getMinX(List<MyPoint2D> vertices) {
        return (float) vertices.stream().mapToDouble(MyPoint2D::getX).min().orElse(0);
    }

    protected static float getMinY(List<MyPoint2D> vertices) {
        return (float) vertices.stream().mapToDouble(MyPoint2D::getY).min().orElse(0);
    }

    protected static float getMaxX(List<MyPoint2D> vertices) {
        return (float) vertices.stream().mapToDouble(MyPoint2D::getX).max().orElse(0);
    }

    protected static float getMaxY(List<MyPoint2D> vertices) {
        return (float) vertices.stream().mapToDouble(MyPoint2D::getY).max().orElse(0);
    }
}
