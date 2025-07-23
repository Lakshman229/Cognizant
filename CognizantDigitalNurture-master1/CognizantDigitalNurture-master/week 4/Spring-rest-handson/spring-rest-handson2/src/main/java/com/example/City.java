package com.example;

public class City {
    private String cityName;
    private String state;

    public String getCityName() {
        return cityName;
    }
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "City [cityName=" + cityName + ", state=" + state + "]";
    }
}
