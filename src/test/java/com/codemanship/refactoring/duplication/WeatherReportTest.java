package com.codemanship.refactoring.duplication;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WeatherReportTest {

    @Test
    void formatsMorningForecastCorrectly() {
        WeatherReport report = new WeatherReport();

        Forecast forecast = new Forecast("morning", 12.5, "Cloudy", 10);

        List<String> output = new ArrayList<>();
        report.formatDailyReport(List.of(forecast), output);

        assertEquals(1, output.size());
        assertEquals(
                "Morning: 12.5°C, Cloudy, wind 10km/h",
                output.get(0)
        );
    }

    @Test
    void formatsEveningForecastCorrectly() {
        WeatherReport report = new WeatherReport();

        Forecast forecast = new Forecast("evening", 8.0, "Rain", 20);

        List<String> output = new ArrayList<>();
        report.formatDailyReport(List.of(forecast), output);

        assertEquals(1, output.size());
        assertEquals(
                "Evening: 8.0°C, Rain, wind 20km/h",
                output.get(0)
        );
    }

    @Test
    void formatsMultipleForecastsInOrder() {
        WeatherReport report = new WeatherReport();

        List<Forecast> forecasts = List.of(
                new Forecast("morning", 10.0, "Sunny", 5),
                new Forecast("night", 3.0, "Clear", 2)
        );

        List<String> output = new ArrayList<>();
        report.formatDailyReport(forecasts, output);

        assertEquals(2, output.size());

        assertEquals(
                "Morning: 10.0°C, Sunny, wind 5km/h",
                output.get(0)
        );

        assertEquals(
                "Night: 3.0°C, Clear, wind 2km/h",
                output.get(1)
        );
    }
}