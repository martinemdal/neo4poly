package com.martinfolke.neo4jpoly.entity;

import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Ingredient {

    @Id String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
