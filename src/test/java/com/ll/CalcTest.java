package com.ll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalcTest {
    @Test
    @DisplayName("Calc의 run 메서드는 int를 return 한다.")
    void test1() {
        int rs = Calc.run("");
    }

    @Test
    @DisplayName("10 + 8 == 18")
    void test2() {
        int rs = Calc.run("10 + 8");
        assertThat(rs).isEqualTo(18);
    }

    @Test
    @DisplayName("20 - 8 == 12")
    void test3() {
        int rs = Calc.run("20 - 8");
        assertThat(rs).isEqualTo(12);
    }

    @Test
    @DisplayName("10 + 8 - 2 == 16")
    void test4() {
        int rs = Calc.run("10 + 8 - 2");
        assertThat(rs).isEqualTo(16);
    }

    @Test
    @DisplayName("(10 + 8) == 18")
    void test5() {
        int rs = Calc.run("(10 + 8)");
        assertThat(rs).isEqualTo(18);
    }


    @Test
    @DisplayName("((10 + 8)) == 18")
    void test6() {
        int rs = Calc.run("((10 + 8))");
        assertThat(rs).isEqualTo(18);
    }

    @Test
    @DisplayName("(10 + 8) - 7 == 11")
    void test7() {
        int rs = Calc.run("(10 + 8) - 7");
        assertThat(rs).isEqualTo(11);
    }

    @Test
    @DisplayName("((10 + 8)) - 7 == 11")
    void test8() {
        int rs = Calc.run("((10 + 8)) - 7");
        assertThat(rs).isEqualTo(11);
    }
}
