package com.martinfolke.neo4jpoly.entity;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class Strawberry extends Ingredient {

    String color;

    @Relationship(type = "TASTES_LIKE")
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
