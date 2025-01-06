abstract class MyAbstractPolygonTest extends MyAreaPrimitive2DTest {

    // -----------------------------------------------------------------
    // Аспекты:
    // !!! Дополнительно >>  TO-DO: добавить аспекты !!!

    // !!! TO-DO: обновить указанные тесты с учетом новых аспектов. Также добавить новые тесты

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

    @Override
    abstract void fixedSize();

    // -----------------------------------------------------------------
    // Аспекты:
    // !!! Дополнительно >> Позиция анализируемой точки (с точки зрения примитива):
    // ... + вершина многоугольника (не менее 3-х вариантов)
    // Проверить принадлежность точки примитиву

    // !!! TO-DO: обновить/добавить тесты с учетом добавленных аспектов
}