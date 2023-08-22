package video.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RentalTest {

    Movie 子供用作品_となりのトトロ = new Movie("となりのトトロ", PriceType.CHILDREN);
    Movie 旧作_トップガン = new Movie("トップガン", PriceType.REGULAR);
    Movie 新作_君たちはどう生きるか = new Movie("君たちはどう生きるか", PriceType.NEW_RELEASE);
    @Test
    void 新作を4日のレンタル料金() {
        Rental sut = new Rental(新作_君たちはどう生きるか, 4);

        double result = sut.amount();

        assertEquals(1200, result);
    }


    @Test
    void 旧作を2日のレンタル料金() {
        Rental sut = new Rental(旧作_トップガン, 2);

        double result = sut.amount();

        assertEquals(200, result);
    }

    @Test
    void 旧作を3日のレンタル料金() {
        Rental sut = new Rental(旧作_トップガン, 3);

        double result = sut.amount();

        assertEquals(350, result);
    }

    @Test
    void 子供用作品を4日のレンタル料金() {
        Rental sut = new Rental(子供用作品_となりのトトロ, 4);

        double result = sut.amount();

        assertEquals(300, result);
    }

    @Test
    void 子供用作品を3日のレンタル料金() {
        Rental sut = new Rental(子供用作品_となりのトトロ, 3);

        double result = sut.amount();

        assertEquals(150, result);
    }
}