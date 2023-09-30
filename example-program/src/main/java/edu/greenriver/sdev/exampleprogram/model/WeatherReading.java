package edu.greenriver.sdev.exampleprogram.model;

import lombok.*;

@Data
@AllArgsConstructor

public class WeatherReading {

    private String dateTime;
    private String location;
    private String condition;   // foggy, rainy, sunny, ...
    private double tempFaren;



}
