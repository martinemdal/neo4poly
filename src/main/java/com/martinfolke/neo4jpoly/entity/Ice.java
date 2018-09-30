package com.martinfolke.neo4jpoly.entity;

import org.neo4j.ogm.annotation.Relationship;

public class Ice extends Ingredient {

    Boolean transparent;

    @Relationship(type = "HAS_TEMPERATURE")
    Temperature temperature;

    public Boolean getTransparent() {
        return transparent;
    }

    public void setTransparent(Boolean transparent) {
        this.transparent = transparent;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Ice{" +
                "transparent=" + transparent +
                ", temperature=" + temperature +
                ", name='" + name + '\'' +
                '}';
    }
}
