public abstract class MyGraphicsPrimitive2D {

    protected BoundingRectangle _area;

    public BoundingRectangle getArea() {
        return _area;
    }

    protected MyGraphicsPrimitive2D(BoundingRectangle area) {
        _area = area;
    }

    protected MyGraphicsPrimitive2D(float left, float top, float right, float bottom) {
        _area = new BoundingRectangle(left, top, right, bottom);
    }

    protected MyGraphicsPrimitive2D(MyPoint2D leftTop, MySize2D size) {
        _area = new BoundingRectangle(leftTop ,size);
    }

    protected MyGraphicsPrimitive2D(MyPoint2D leftTop, MyPoint2D rightBottom) {
        _area = new BoundingRectangle(leftTop, rightBottom);
    }

    public void move(float dx, float dy) {
        _area = new BoundingRectangle(_area.getLeft() + dx, _area.getTop() + dy, _area.getRight() + dx, _area.getBottom() + dy);
    }

    public boolean contains(MyPoint2D point) {
        return _area.getLeft() <= point.getX() && _area.getRight() >= point.getX() && _area.getTop() >= point.getY() && _area.getBottom() <= point.getY();
    }
}
