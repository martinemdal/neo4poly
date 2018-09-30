package com.martinfolke.neo4jpoly.entity;

import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Strawberry extends Ingredient {

    String color;

    Flavor flavor;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Flavor getFlavor() {
        return flavor;
    }

    public void setFlavor(Flavor flavor) {
        this.flavor = flavor;
    }

    @Override
    public String toString() {
        return "Strawberry{" +
                "color='" + color + '\'' +
                ", flavor=" + flavor +
                ", name='" + name + '\'' +
                '}';
    }
}
