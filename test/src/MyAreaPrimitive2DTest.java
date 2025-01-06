import org.junit.jupiter.api.Test;

abstract class MyAreaPrimitive2DTest extends MyGraphicsPrimitive2DTest {

    // -----------------------------------------------------------------
    // Аспекты:
    // !!! Дополнительно проверить площадь примитива.
    // !!! Дополнительно >> Инвариант: площадь всегда положительная и не изменяется
    // !!! Дополнительно >> Инвариант: размеры описывающего прямоугольника всегда положительные

    // !!! TO-DO: учесть новые аспекты в указанных тестах

    @Override
    abstract void mediumSizedPrimitive_and_inscribedInSquare();

    @Override
    abstract void verySmallPrimitive();

    @Override
    abstract void veryBigPrimitive();

    @Override
    abstract void degeneratedIntoAPoint();

    @Override
    abstract void fixedBoundingRectangle();

    @Test
    abstract void fixedSize();
}