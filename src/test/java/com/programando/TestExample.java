package com.programando;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestExample {
    @Test
    void TestSuma(){
        Example example = new Example();
        int resultado = example.sumaNumeros(6,6);
        Assertions.assertEquals(12, resultado);
    }
}
