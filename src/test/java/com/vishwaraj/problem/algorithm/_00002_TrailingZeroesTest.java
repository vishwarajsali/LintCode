package com.vishwaraj.problem.algorithm;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class _00002_TrailingZeroesTest {

    @InjectMocks
    _00002_TrailingZeroes trailingZeroes;

    @Test
    void test1(){
        assertEquals(trailingZeroes.trailingZeros(5), 1);
        assertEquals(trailingZeroes.trailingZeros(11), 2);
        assertEquals(trailingZeroes.trailingZeros(105), 25);
    }
}