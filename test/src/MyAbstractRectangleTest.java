import org.junit.jupiter.api.Test;

abstract class MyAbstractRectangleTest extends MyAreaPrimitive2DTest {

    // -----------------------------------------------------------------
    // Аспекты:
    // !!! Дополнительно проверить левый верхний угол, правый нижний угол и размеры прямоугольника.
    // !!! Дополнительно >> Инвариант: правый нижний угол всегда отстоит от левого верхнего в юго-восточном направлении
    // !!! Дополнительно >> Инвариант: размеры прямоугольника всегда положительные и не изменяются

    // !!! TO-DO: обновить/добавить тесты с учетом добавленных аспектов

    @Test
    abstract void mediumSizedPrimitive_and_inscribedInSquare();

    @Test
    abstract void verySmallPrimitive();

    @Test
    abstract void veryBigPrimitive();

    @Override
    abstract void fixedBoundingRectangle();

    @Override
    abstract void fixedSize();
}