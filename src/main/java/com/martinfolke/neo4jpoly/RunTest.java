package com.martinfolke.neo4jpoly;

import com.martinfolke.neo4jpoly.entity.*;
import org.neo4j.ogm.config.Configuration;
import org.neo4j.ogm.session.Session;
import org.neo4j.ogm.session.SessionFactory;

import java.util.HashSet;
import java.util.Set;

public class RunTest {
    public static void main(String[] args) {

        // Save strawberry smoothie
        Strawberry strawberry = new Strawberry();
        Flavor flavor = new Flavor();
        flavor.setType("sweet");
        strawberry.setColor("red");
        strawberry.setFlavor(flavor);
        strawberry.setName("strawberry");

        Ice ice = new Ice();
        Temperature temperature = new Temperature();
        temperature.setId("cold");
        ice.setTransparent(true);
        ice.setName("ice");
        ice.setTemperature(temperature);

        Recipe smoothie = new Recipe();
        Set<Ingredient> ingredients = new HashSet<>();
        ingredients.add(strawberry);
        ingredients.add(ice);
        smoothie.setName("strawberry smoothie");

        smoothie.setIngredients(ingredients);



        Configuration configuration = new Configuration.Builder()
                .uri("bolt://localhost")
                .credentials("neo4j", "testing")
                .build();

        SessionFactory sessionFactory = new SessionFactory(configuration, "com.martinfolke.neo4jpoly");
        Session session = sessionFactory.openSession();

        session.save(smoothie);

        session.clear();

        Recipe loadedSmoothie = session.load(Recipe.class, "strawberry smoothie", 2);

        System.out.println(smoothie);
        System.out.println(loadedSmoothie);


    }
}
