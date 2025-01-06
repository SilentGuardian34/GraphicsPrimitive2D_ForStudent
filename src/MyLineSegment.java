public class MyLineSegment extends MyGraphicsPrimitive2D {

    private final MyPoint2D _firstPoint;
    private final MyPoint2D _secondPoint;

    public MyLineSegment(float firstPointX, float firstPointY, float secondPointX, float secondPointY) {
        super(Math.min(firstPointX, secondPointX), Math.max(firstPointY, secondPointY), Math.abs(secondPointX - firstPointX), Math.abs(secondPointY - firstPointY));

        _firstPoint = new MyPoint2D(firstPointX, firstPointY);
        _secondPoint = new MyPoint2D(secondPointX, secondPointY);
    }

    public double getLength() {
        return Math.sqrt(Math.pow(_secondPoint.getX() - _firstPoint.getX(), 2) + Math.pow(_secondPoint.getY() - _firstPoint.getY(), 2));
    }
}
