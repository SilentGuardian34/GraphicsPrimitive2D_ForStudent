public class MySize2D {

    private final float _width;
    private final float _height;

    public MySize2D(float width, float height) {
        _width = width;
        _height = height;
    }

    public float getWidth(){
        return _width;
    }

    public float getHeight(){
        return _height;
    }

    @Override
    public boolean equals(Object other) {

        if (other == this) {
            return true;
        }

        if (other instanceof MySize2D) {
            return ((MySize2D) other)._width == this._width && ((MySize2D) other)._height == this._height;
        }

        return false;
    }
}
