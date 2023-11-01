package com.entertainment;

import java.util.Objects;

public class Television {
    private String brand;
    private Integer volume;

    public Television(){}

    public Television(String brand, Integer volume) {
        this.brand = brand;
        this.volume = volume;
    }

    // Methods
    private Tuner tuner = new Tuner();

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Television) {
            Television tv = (Television) obj;
            return Objects.equals(this.getBrand(), tv.getBrand()) && Objects.equals(this.getVolume(), tv.getVolume()); // Null safe check
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getVolume(), getBrand());
    }

    public int getCurrentChannel() {
        return tuner.getChannel();
    }

    public void changeChannel(int channel) {
        tuner.setChannel(channel);
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }


    @Override
    public String toString() {
        return "Television{" +
                "brand='" + getBrand() + '\'' +
                ", volume=" + getVolume() +
                ", channel=" + getCurrentChannel() +
                '}';
    }
}
