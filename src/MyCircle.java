public class MyCircle extends MyAreaPrimitive2D {
    private MyPoint2D _center;

    public MyPoint2D getCenter() {
        return _center;
    }

    private final float _radius;

    public float getRadius() {
        return _radius;
    }

    public MyCircle(MyPoint2D center, float radius) {
        super(new MyPoint2D(center.getX() - radius, center.getY() - radius), new MySize2D(2 * radius, 2 * radius));
        _center = center;
        _radius = radius;
    }

    @Override
    public float square() {
        return (float) (Math.PI * _radius * _radius);
    }

    @Override
    public void move(float dx, float dy) {
        super.move(dx, dy);
        _center = new MyPoint2D(_center.getX() + dx, _center.getY() + dy);
    }

    @Override
    public boolean contains(MyPoint2D point) {
        float distanceSquared = (float) (Math.pow(point.getX() - _center.getX(), 2) + Math.pow(point.getY() - _center.getY(), 2));
        return distanceSquared <= Math.pow(_radius, 2);
    }
}
