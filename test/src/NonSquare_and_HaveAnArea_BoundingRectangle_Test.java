import org.junit.jupiter.api.Test;

interface NonSquare_and_HaveAnArea_BoundingRectangle_Test {

    // -----------------------------------------------------------------
    // Аспекты:
    // !!! Дополнительно >> Форма описывающего прямоугольника: ... +
    // вытянутая по горизонтали; вытянутая по вертикали

    @Test
    void horizontallyExtendedPrimitive();

    @Test
    void verticallyExtendedPrimitive();
}