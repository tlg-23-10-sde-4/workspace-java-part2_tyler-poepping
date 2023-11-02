package com.entertainment;

import java.util.Objects;

public class Television implements Comparable<Television> {
    private String brand;
    private Integer volume;

    public Television(){}

    public Television(String brand, Integer volume) {
        this.brand = brand;
        this.volume = volume;
    }

    // Methods
    private Tuner tuner = new Tuner();

    // Natural order decided by String,
    // Secondary of volume, otherwise this will not be accepted by sets
    // To have the same item in TreeSet with alternate values we must give the second comparator
    @Override
    public int compareTo(Television tv) {
        int result = this.getBrand().compareTo(tv.getBrand());

        if(result == 0) { // Same brand
            return this.getVolume().compareTo(tv.getVolume());
        }
        return result;
    }

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
