public abstract class MyAreaPrimitive2D extends MyGraphicsPrimitive2D {

    protected MyAreaPrimitive2D(MyPoint2D point, MySize2D size) {
        super(point, size);
    }

    protected MyAreaPrimitive2D(MyPoint2D firstPoint, MyPoint2D secondPoint) {
        super(firstPoint, secondPoint);
    }

    public abstract float square();
}
