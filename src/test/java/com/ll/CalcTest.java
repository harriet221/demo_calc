package com.ll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalcTest {
    @Test
    @DisplayName("Calc의 run 메서드는 int를 return 한다.")
    void test1() {
        int rs = Calc.run("");
    }
}
