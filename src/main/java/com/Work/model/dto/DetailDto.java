package com.Work.model.dto;

public class DetailDto {
    private Long id;
    private String address;
    private String description;
    private String areaOfInterest;
    private String workInLocations;
    private int price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAreaOfInterest() {
        return areaOfInterest;
    }

    public void setAreaOfInterest(String areaOfInterest) {
        this.areaOfInterest = areaOfInterest;
    }

    public String getWorkInLocations() {
        return workInLocations;
    }

    public void setWorkInLocations(String workInLocations) {
        this.workInLocations = workInLocations;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
