package com.Luldle.Luldle.model;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Entity
@Table(name = "champions")
public class Champion {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "gender")
    private String gender;

    @Column(name = "position")
    private String position;

    @Column(name = "specy")
    private String specy;

    @Column(name = "resource")
    private String resource;

    @Column(name = "range_type")
    private String range_type;

    @Column(name = "region")
    private String region;

    @Column(name = "year_of_release")
    private int year_of_release;

    @Column(name = "image_url")
    private String image_url;

    public Champion(String name, String gender, String position, String specy, String resource, String range_type, String region, int year_of_release, String image_url) {
        this.name = name;
        this.gender = gender;
        this.position = position;
        this.specy = specy;
        this.resource = resource;
        this.range_type = range_type;
        this.region = region;
        this.year_of_release = year_of_release;
        this.image_url = image_url;
    }

    public Champion(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSpecy() {
        return specy;
    }

    public void setSpecy(String specy) {
        this.specy = specy;
    }

    public String getRange_type() {
        return range_type;
    }

    public void setRange_type(String range_type) {
        this.range_type = range_type;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public int getYear_of_release() {
        return year_of_release;
    }

    public void setYear_of_release(int year_of_release) {
        this.year_of_release = year_of_release;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public void setChampion(){

    }

}