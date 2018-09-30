package com.martinfolke.neo4jpoly.entity;

import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@NodeEntity
public class Recipe {

    @Id
    String name;

    @Relationship(type = "HAS_INGREDIENT")
    Set<Ingredient> ingredients;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Set<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        List<String> ingredientToString = ingredients.stream().map(Ingredient::toString).collect(Collectors.toList());
        return "Recipe{" +
                "name='" + name + '\'' +
                ", ingredients=" + ingredientToString +
                '}';
    }
}
