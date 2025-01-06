import org.junit.jupiter.api.Test;

abstract class MyGraphicsPrimitive2DTest {

    // -----------------------------------------------------------------
    // Аспекты:
    // Размер: средний; очень маленький; очень большой; точка
    // Форма описывающего прямоугольника: квадратная
    // Проверить описывающий прямоугольник
    // Инвариант: размеры описывающего прямоугольника не изменяются, всегда
    // не отрицательные и не могут быть нулевыми одновременно по обоим измерениям

    @Test
    abstract void mediumSizedPrimitive_and_inscribedInSquare();

    @Test
    abstract void verySmallPrimitive();

    @Test
    abstract void veryBigPrimitive();

    @Test
    abstract void degeneratedIntoAPoint();

    @Test
    abstract void fixedBoundingRectangle();

    // -----------------------------------------------------------------
    // Аспекты:
    // Позиция анализируемой точки (с точки зрения примитива):
    // в середине примитива; внутри + рядом с границей; на границе;
    // вне + рядом с границей; вне + далеко от границы
    // Позиция анализируемой точки (с точки зрения описывающего прямоугольника):
    // в середине; внутри + рядом с границей; на границе;
    // вне + рядом с границей; вне + далеко от границы; в одной из вершин (проверять все четрые вершины)
    // Проверить принадлежность точки примитиву

    @Test
    abstract void inTheMiddleOfPrimitive();

    @Test
    abstract void insideNearTheBorder();

    @Test
    abstract void onTheBorderOfPrimitive();

    @Test
    abstract void outsideNearTheBorder_and_insideTheBoundingRectangle();

    @Test
    abstract void outsideNearTheBorder_and_onTheBorderOfBoundingRectangle();

    @Test
    abstract void outsideTheBoundingRectangle();

    // -----------------------------------------------------------------
    // Аспекты:
    // Расстояние, на которое смещаем примитив: среднее; небольшое; большое; нулевое
    // Направление смещения: 8 направлений
    // Проверить новую позицию

    @Test
    abstract void averageDisplacementToTheEast();

    @Test
    abstract void shortDistanceMovement();

    @Test
    abstract void longDistanceMovement();

    @Test
    abstract void nullDistanceMovement();

    @Test
    abstract void averageDisplacementToTheNorth();

    @Test
    abstract void averageDisplacementToTheNortheast();

    @Test
    abstract void averageDisplacementToTheSoutheast();

    @Test
    abstract void averageDisplacementOnTheSouth();

    @Test
    abstract void averageDisplacementToTheSouthwest();

    @Test
    abstract void averageDisplacementToTheWest();

    @Test
    abstract void averageDisplacementToTheNorthwest();
}
