import java.util.List;

public class MySquare extends MyAbstractRectangle {

    private float _side;

    public float getSide() {
        return _side;
    }

    public MySquare(List<MyPoint2D> vertices) {
        super(vertices);

        if (!isRectangleSquare()) {
            throw new IllegalArgumentException("Заданный прямоугольник не является квадратом");
        }
    }

    public boolean isRectangleSquare() {

        /* if (_vertices.size() != 4) {
            return false;
        }

        _side = distance(vertices.get(0), vertices.get(1));
        for (int i = 1; i < 4; i++) {
            if (Math.abs(distance(vertices.get(i), vertices.get((i + 1) % 4)) - _side) > 1e-9) {
                return false;
            }
        }

        return true; */

        return _size.getWidth() == _size.getHeight();
    }
}
