import java.util.List;

public class MyPolygon extends MyAbstractPolygon {

    public MyPolygon(List<MyPoint2D> vertices) {
        super(vertices);
        this._vertices = vertices;
    }

    @Override
    public float square() {
        float square = 0;
        for (int i = 0; i < _vertices.size(); i++) {
            MyPoint2D p1 = _vertices.get(i);
            MyPoint2D p2 = _vertices.get((i + 1) % _vertices.size());
            square += p1.getX() * p2.getY() - p2.getX() * p1.getY();
        }
        return Math.abs(square) / 2;
    }
}
