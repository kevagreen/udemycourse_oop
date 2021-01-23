package com.tbuckta.main;

import java.util.Locale;

public class Car {
    //state of object defined in variables
    private int doors;
    private int wheels;
    private String engine;
    private String color;
    private String model;

    public void setModel(String model) {
        String validModel = model.toLowerCase(Locale.ROOT);
        if (validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "unknown";
        }
    }

    public String getModel() {
        return this.model;
    }
}
