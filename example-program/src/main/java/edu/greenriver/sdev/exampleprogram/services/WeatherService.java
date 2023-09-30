package edu.greenriver.sdev.exampleprogram.services;

import edu.greenriver.sdev.exampleprogram.model.WeatherReading;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class WeatherService {

    public List<WeatherReading> getAllReadings()
    {
        return List.of(
                new WeatherReading("10/10/21 9pm","Spokane", "Clear Skies", 70.0),
                new WeatherReading("12/25/22","Black Diamond", "Snow", 27.0),
                new WeatherReading("3/1/23","Kent", "Rain",  42.0),
                new WeatherReading("6/12/23","Kent", "Sun", 65.0)
        );
    }

    public List<Double> getAllTemps()
    {
        return List.of(70.0, 24.0, 33.0, 46.5, 49.0,85.0,81.0,57.4);
    }
}
