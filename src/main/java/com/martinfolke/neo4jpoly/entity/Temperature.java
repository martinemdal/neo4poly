package com.martinfolke.neo4jpoly.entity;

import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Temperature {

    @Id String type;

    public String getId() {
        return type;
    }

    public void setId(String id) {
        this.type = id;
    }

    @Override
    public String toString() {
        return "Temperature{" +
                "type='" + type + '\'' +
                '}';
    }
}
