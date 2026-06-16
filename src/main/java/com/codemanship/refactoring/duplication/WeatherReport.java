package com.codemanship.refactoring.duplication;

import java.util.List;

class WeatherReport {

    void formatDailyReport(List<Forecast> forecasts, List<String> output) {

        for (Forecast forecast : forecasts) {

            if (forecast.isMorning()) {
                addFormattedLine(output, forecast, "Morning: ");
            }

            if (forecast.isAfternoon()) {
                addFormattedLine(output, forecast, "Afternoon: ");
            }

            if (forecast.isEvening()) {
                addFormattedLine(output, forecast, "Evening: ");
            }

            if (forecast.isNight()) {
                addFormattedLine(output, forecast, "Night: ");
            }
        }
    }

    private static void addFormattedLine(List<String> output, Forecast forecast, String timeOfDay) {
        String line = timeOfDay + forecast.getTemperature() + "°C, "
                + forecast.getCondition() + ", wind " + forecast.getWindSpeed() + "km/h";
        output.add(line);
    }
}
