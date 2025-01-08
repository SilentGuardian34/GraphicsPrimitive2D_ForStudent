import java.util.Objects;

public class MyPoint2D {

    private final float _x;
    private final float _y;

    public float getX() {
        return _x;
    }

    public float getY() {
        return _y;
    }

    public MyPoint2D(float x, float y) {
       _x = x;
       _y = y;
    }

    public MyPoint2D(MyPoint2D other) {
        _x = other._x;
        _y = other._y;
    }

    public final float distance(MyPoint2D other) {
        return (float) Math.hypot(
                (other.getX() - this.getX()),
                (other.getY() - this.getY())
        );
    }

    @Override
    public boolean equals(Object other) {

        if (other == this) {
            return true;
        }

        if (other instanceof MyPoint2D) {
            return this._x == ((MyPoint2D) other)._x && this._y == ((MyPoint2D) other)._y;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(_x, _y);
    }
}
