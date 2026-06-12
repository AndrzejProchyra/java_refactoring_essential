package com.codemanship.refactoring.duplication;

import java.util.List;

class WeatherReport {

    void formatDailyReport(List<Forecast> forecasts, List<String> output) {

        for (Forecast forecast : forecasts) {

            if (forecast.isMorning()) {
                String line = "Morning: " + forecast.getTemperature() + "°C, "
                        + forecast.getCondition() + ", wind " + forecast.getWindSpeed() + "km/h";
                output.add(line);
            }

            if (forecast.isAfternoon()) {
                String line = "Afternoon: " + forecast.getTemperature() + "°C, "
                        + forecast.getCondition() + ", wind " + forecast.getWindSpeed() + "km/h";
                output.add(line);
            }

            if (forecast.isEvening()) {
                String line = "Evening: " + forecast.getTemperature() + "°C, "
                        + forecast.getCondition() + ", wind " + forecast.getWindSpeed() + "km/h";
                output.add(line);
            }

            if (forecast.isNight()) {
                String line = "Night: " + forecast.getTemperature() + "°C, "
                        + forecast.getCondition() + ", wind " + forecast.getWindSpeed() + "km/h";
                output.add(line);
            }
        }
    }
}
