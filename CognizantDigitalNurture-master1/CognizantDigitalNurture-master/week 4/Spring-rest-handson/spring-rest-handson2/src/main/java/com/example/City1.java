package com.example;

public class City1 {
    private String name;
    private String state;

    // Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "City [name=" + name + ", state=" + state + "]";
    }
}
