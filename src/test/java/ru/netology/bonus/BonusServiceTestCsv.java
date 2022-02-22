package ru.netology.bonus;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BonusServiceTestCsv {

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    void shouldCalculateForDifferentUsers(String testName, long amount, boolean registered, long expected) {

        BonusService service = new BonusService();
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);

    }
}