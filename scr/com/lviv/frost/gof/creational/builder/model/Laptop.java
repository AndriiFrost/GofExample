package com.lviv.frost.gof.creational.builder.model;

public class Laptop {

    private String monitorResolution;

    private String processor;

    private String memory;

    private String hdd;

    private String battery;

    public void setMonitorResolution(String monitorResolution) {
        this.monitorResolution = monitorResolution;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "monitorResolution='" + monitorResolution + '\'' +
                ", processor='" + processor + '\'' +
                ", memory='" + memory + '\'' +
                ", hdd='" + hdd + '\'' +
                ", battery='" + battery + '\'' +
                '}';
    }
}
