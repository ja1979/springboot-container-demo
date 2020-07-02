package ec.sevolutivo.demo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DemoApplicationTests {

    @Test
    void testTRue() {
        assertThat(true).isTrue();
    }

    @Test
    void testCompare() {
        assertThat(1+1).isEqualTo(3);
    }

}
