public class BoundingRectangle {

    private final float _left;
    private final float _right;
    private final float _top;
    private final float _bottom;

    public BoundingRectangle(float left, float top, float right, float bottom) {
        _left = left;
        _top = top;
        _right = right;
        _bottom = bottom;
    }

    public BoundingRectangle(MyPoint2D left_top, MySize2D size) {
        _left = left_top.getX();
        _top = left_top.getY();
        _right = _left + size.getWidth();
        _bottom = _top + size.getHeight();
    }

    public BoundingRectangle(MyPoint2D left_top, MyPoint2D right_bottom) {
        _left = left_top.getX();
        _top = left_top.getY();
        _right = right_bottom.getX();
        _bottom = right_bottom.getY();
    }

    public float getLeft() { return _left; }

    public float getRight() { return _right; }

    public float getTop() {
        return _top;
    }

    public float getBottom() {
        return _bottom;
    }

    public MyPoint2D getLeftTop() {
        return new MyPoint2D(_left, _top);
    }

    public MyPoint2D getRightBottom() {
        return new MyPoint2D(_right, _bottom);
    }

    public MySize2D getSize() {
        return new MySize2D(_right-_left, _top-_bottom);
    }

    @Override
    public boolean equals(Object other) {

        if (other == this) {
            return true;
        }

        if (other instanceof BoundingRectangle) {
            return this._left == ((BoundingRectangle) other)._left && this._top == ((BoundingRectangle) other)._top && this._right == ((BoundingRectangle) other)._right && this._bottom == ((BoundingRectangle) other)._bottom;
        }

        return false;
    }
}
