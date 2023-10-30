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
}
