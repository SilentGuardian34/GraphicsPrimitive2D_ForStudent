// import java.util.Arrays;
import java.util.List;

public abstract class MyAbstractRectangle extends MyAbstractPolygon {

    protected MyPoint2D _leftTop, _rightBottom;
    protected MySize2D _size;
//
    public MyAbstractRectangle(List<MyPoint2D> vertices) {
        super(vertices);

        /*super(Arrays.asList(
                new MyPoint2D(leftTop.getX(), leftTop.getY()),
                new MyPoint2D(rightBottom.getX(), leftTop.getY()),
                new MyPoint2D(rightBottom.getX(), rightBottom.getY()),
                new MyPoint2D(leftTop.getX(), rightBottom.getY())
        )); */

        if (!isRectangle(vertices)) {
            throw new IllegalArgumentException("Заданный многоугольник не является прямоугольником");
        }

        _leftTop = new MyPoint2D(getMinX(vertices), getMaxY(vertices));
        _rightBottom = new MyPoint2D(getMaxX(vertices), getMinY(vertices));
        _size = new MySize2D(_rightBottom.getX() - _leftTop.getX(), _leftTop.getY() - _rightBottom.getY());
    }

    @Override
    public float square() {
        return (_size.getWidth() * _size.getHeight());
    }

    public boolean isRectangle(List<MyPoint2D> vertices) {

        if (vertices.size() != 4) {
            return false;
        }

        for (int i = 0; i < 4; i++) {
            MyPoint2D p1 = vertices.get(i);
            MyPoint2D p2 = vertices.get((i + 1) % 4);
            MyPoint2D p3 = vertices.get((i + 2) % 4);

            float dx1 = p2.getX() - p1.getX();
            float dy1 = p2.getY() - p1.getY();
            float dx2 = p3.getX() - p2.getX();
            float dy2 = p3.getY() - p2.getY();

            if (Math.abs(dx1 * dx2 + dy1 * dy2) > 1e-9) {
                return false;
            }
        }
        return true;
    }

//    protected float distance(MyPoint2D p1, MyPoint2D p2) {
//        return (float)(Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2)));
//    }
}
