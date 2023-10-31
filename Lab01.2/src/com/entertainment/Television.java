package com.entertainment;

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
            return this.getBrand().equals(tv.getBrand()) && this.getVolume().equals(tv.getVolume());
        }
        return false;
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
