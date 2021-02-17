package ru.netology.checkstyleplugin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckStylePluginServiceTest {

    @Test
    void findMax() {
CheckStylePluginService variable = new CheckStylePluginService();

        long[] incomesInEuro = {5, 12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long predicted = 12;

        long actual = variable.findMax(incomesInEuro);

        assertEquals(predicted,actual);
    }
}