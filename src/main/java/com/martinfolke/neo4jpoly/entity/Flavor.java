package com.martinfolke.neo4jpoly.entity;

import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Flavor {

    @Id String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Flavor{" +
                "type='" + type + '\'' +
                '}';
    }
}
